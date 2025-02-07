package com.example.supabase_lambda.application.service.impl;

import com.example.supabase_lambda.application.service.MetricsService;
import com.example.supabase_lambda.domain.repository.ChangeRequestRepository;
import com.example.supabase_lambda.domain.repository.IncidentRepository;
import org.springframework.stereotype.Service;

@Service
public class MetricsServiceImpl implements MetricsService {

    private final IncidentRepository incidentRepository;
    private final ChangeRequestRepository changeRequestRepository;

    public MetricsServiceImpl(
            IncidentRepository incidentRepository,
            ChangeRequestRepository changeRequestRepository) {
        this.changeRequestRepository = changeRequestRepository;
        this.incidentRepository = incidentRepository;
    }

    @Override
    public long getTotalTickets() {
        long incidentsCount = incidentRepository.count();
        long changeRequestCount = changeRequestRepository.count();
        return incidentsCount + changeRequestCount;
    }
}

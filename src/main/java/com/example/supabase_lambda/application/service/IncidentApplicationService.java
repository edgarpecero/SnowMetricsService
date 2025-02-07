package com.example.supabase_lambda.application.service;

import com.example.supabase_lambda.application.dto.IncidentDTO;
import com.example.supabase_lambda.domain.service.IncidentService;
import com.example.supabase_lambda.mapper.IncidentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IncidentApplicationService {

    private final IncidentService incidentService;

    public IncidentApplicationService(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @Transactional
    public List<IncidentDTO> getAllIncidents() {
        return incidentService.getAllIncidents().stream()
                .map(IncidentMapper.INSTANCE::incidentToIncidentDTO)
                .collect(Collectors.toList());
    }

}
package com.example.supabase_lambda.application.service.impl;

import com.example.supabase_lambda.application.service.IncidentService;
import com.example.supabase_lambda.domain.exception.InvalidRequestException;
import com.example.supabase_lambda.domain.model.Incident;
import com.example.supabase_lambda.domain.repository.IncidentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidentServiceImpl implements IncidentService  {
    private static final Logger LOGGER = LoggerFactory.getLogger(IncidentServiceImpl.class);

    private final IncidentRepository incidentRepository;

    public IncidentServiceImpl(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    @Override
    public List<Incident> getAllIncidents() {
        try {
            return incidentRepository.findAll();
        } catch (Exception e) {
            String message = "Error ocurred while getting all incidents";
            LOGGER.error(message, e);
            throw new InvalidRequestException(message);
        }
    }

    @Override
    public Incident createIncident(Incident incident) {
        try {
            // Business logic
            return incidentRepository.save(incident);
        } catch (Exception e) {
            String message = "Error ocurred while creating incident";
            LOGGER.error(message, e);
            throw new InvalidRequestException(message);
        }
    }

    @Override
    public Optional<Incident> getIncidentById(Long id) {
        return incidentRepository.findById(id);
    }

    @Override
    public long getTotalIncidents() {
        return incidentRepository.count();
    }
}
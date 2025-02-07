package com.example.supabase_lambda.application.service;

import com.example.supabase_lambda.domain.model.Incident;

import java.util.List;
import java.util.Optional;

public interface IncidentService {
    Incident createIncident(Incident incident);
    Optional<Incident> getIncidentById(Long id);
    List<Incident> getAllIncidents();
    long getTotalIncidents();
}


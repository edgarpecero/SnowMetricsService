package com.example.supabase_lambda.domain.repository;

import com.example.supabase_lambda.domain.model.Incident;

import java.util.List;
import java.util.Optional;

public interface IncidentRepository {
    Incident save(Incident incident);
    Optional<Incident> findById(Long id);
    List<Incident> findAll();
    long count();
}
package com.example.supabase_lambda.infrastructure.persistence;

import com.example.supabase_lambda.domain.model.Incident;
import com.example.supabase_lambda.domain.repository.IncidentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaIncidentRepository extends JpaRepository<Incident, Long>, IncidentRepository { }

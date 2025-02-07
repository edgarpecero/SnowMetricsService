package com.example.supabase_lambda.domain.repository;

import com.example.supabase_lambda.domain.model.ChangeRequest;

import java.util.List;
import java.util.Optional;

public interface ChangeRequestRepository {
    ChangeRequest save(ChangeRequest changeRequest);
    Optional<ChangeRequest> findById(Long id);
    List<ChangeRequest> findAll();
    long count();
}

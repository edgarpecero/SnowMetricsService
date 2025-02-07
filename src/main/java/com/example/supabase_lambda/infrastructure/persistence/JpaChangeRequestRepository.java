package com.example.supabase_lambda.infrastructure.persistence;

import com.example.supabase_lambda.domain.model.ChangeRequest;
import com.example.supabase_lambda.domain.repository.ChangeRequestRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaChangeRequestRepository extends JpaRepository<ChangeRequest, Long>, ChangeRequestRepository { }

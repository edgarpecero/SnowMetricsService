package com.example.supabase_lambda.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "change_requests")
public class ChangeRequest extends BaseEntity {
    // Other fields are inherited from BaseEntity
}
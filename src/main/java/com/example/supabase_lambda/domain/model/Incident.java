package com.example.supabase_lambda.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "incidents")
public class Incident extends BaseEntity {
}
package com.example.supabase_lambda.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@MappedSuperclass // This annotation is required for inheritance in JPA
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "requestedby")
    private String requestedBy;

    @Column(name = "manager")
    private String manager;

    @Column(name = "application")
    private String application;

    @Column(name = "assignmentgroup")
    private String assignmentGroup;

    @Column(name = "state")
    private String state;

    @Column(name = "type")
    private String type;

    @Column(name = "actualworkstart")
    private LocalDateTime actualWorkStart;

    @Column(name = "actualworkend")
    private LocalDateTime actualWorkEnd;

    @Column(name = "createddate")
    private LocalDateTime createdDate;

    @Column(name = "updateddate")
    private LocalDateTime updatedDate;

    @Column(name = "closeddate")
    private LocalDateTime closedDate;

    @Column(name = "closenotes")
    private String closeNotes;

    @Column(name = "scope")
    private String scope;

    @Column(name = "severity")
    private Integer severity;

    @Column(name = "description")
    private String description;

    @Column(name = "approval")
    private String approval;

    @Column(name = "notes")
    private String notes;
}
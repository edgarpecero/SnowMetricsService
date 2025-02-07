package com.example.supabase_lambda.application.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class IncidentDTO {
    private String number;
    private String requestedBy;
    private String manager;
    private String application;
    private String assignmentGroup;
    private String state;
    private String type;
    private LocalDateTime actualWorkStart;
    private LocalDateTime actualWorkEnd;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime closedDate;
    private String closeNotes;
    private String scope;
    private Integer severity;
    private String description;
    private String approval;
    private String notes;
}
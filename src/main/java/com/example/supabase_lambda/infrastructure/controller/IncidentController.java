package com.example.supabase_lambda.infrastructure.controller;

import com.example.supabase_lambda.application.dto.IncidentDTO;
import com.example.supabase_lambda.application.service.IncidentApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {
    private final IncidentApplicationService incidentApplicationService;

    public IncidentController(IncidentApplicationService incidentApplicationService) {
        this.incidentApplicationService = incidentApplicationService;
    }

    @GetMapping
    public List<IncidentDTO> getAllIncidents() {
        return incidentApplicationService.getAllIncidents();
    }
}

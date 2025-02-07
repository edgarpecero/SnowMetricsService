package com.example.supabase_lambda.presentation.controller;

import com.example.supabase_lambda.application.dto.IncidentDTO;
import com.example.supabase_lambda.application.service.IncidentService;
import com.example.supabase_lambda.application.service.impl.IncidentServiceImpl;
import com.example.supabase_lambda.domain.exception.ResourceNotFoundException;
import com.example.supabase_lambda.presentation.mapper.IncidentMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/incidents")
public class IncidentController {
    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GetMapping
    public List<IncidentDTO> getAllIncidents() {
        return incidentService.getAllIncidents().stream()
                .map(IncidentMapper.INSTANCE::incidentToIncidentDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<IncidentDTO> getIncidentById(@PathVariable Long id) {
        return incidentService.getIncidentById(id)
                .map(IncidentMapper.INSTANCE::incidentToIncidentDTO)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException("Incident not found"));
    }
}

package com.example.supabase_lambda.mapper;


import com.example.supabase_lambda.application.dto.IncidentDTO;
import com.example.supabase_lambda.domain.model.Incident;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IncidentMapper {
    IncidentMapper INSTANCE = Mappers.getMapper(IncidentMapper.class);

    IncidentDTO incidentToIncidentDTO(Incident incident);

    Incident incidentDTOtoIncident(IncidentDTO incidentDTO);
}

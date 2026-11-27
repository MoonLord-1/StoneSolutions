package com.yeirel.stonesolutions.mappers;

import com.yeirel.stonesolutions.dto.proyecto.ProyectoRequest;
import com.yeirel.stonesolutions.dto.proyecto.ProyectoResponse;
import com.yeirel.stonesolutions.entidades.Proyecto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProyectoMapper {
    @Mapping(target = "id", ignore = true)
    Proyecto toEntity(ProyectoRequest proyectoRequest);

    @Mapping(target = "id", ignore = true)
    ProyectoResponse toResponse(Proyecto proyecto);

}

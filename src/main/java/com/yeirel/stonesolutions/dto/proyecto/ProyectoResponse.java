package com.yeirel.stonesolutions.dto.proyecto;

import com.yeirel.stonesolutions.entidades.ProyectoEstado;

import java.time.LocalDateTime;

public record ProyectoResponse(
        Long id,
        String nombre,
        String cliente,
        String direccion,
        ProyectoEstado estado,
        LocalDateTime fechaInicio,
        LocalDateTime fechaFin) {
}

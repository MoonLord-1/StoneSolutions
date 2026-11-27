package com.yeirel.stonesolutions.dto.proyectoMaterial;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


public record ProyectoMaterialRequest(
        @NotNull
        Long idProyecto,
        @NotNull
        Long idMaterial,
        @NotNull
        @Positive(message = "Los numeros deben ser positivos.")
        Integer cantidadUsada
) {
}

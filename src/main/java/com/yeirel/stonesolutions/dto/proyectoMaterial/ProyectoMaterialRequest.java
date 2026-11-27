package com.yeirel.stonesolutions.dto.proyectoMaterial;

import com.yeirel.stonesolutions.entidades.Material;
import com.yeirel.stonesolutions.entidades.Proyecto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record ProyectoMaterialRequest(
        @NotNull
        Proyecto proyecto,
        @NotNull
        Material material,
        @NotNull
        @PositiveOrZero(message = "Los numeros deben ser positivos.")
        Integer cantidadUsada
) {
}

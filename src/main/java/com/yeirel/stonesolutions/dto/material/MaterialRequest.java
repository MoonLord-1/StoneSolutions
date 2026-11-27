package com.yeirel.stonesolutions.dto.material;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record MaterialRequest(
        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 100)
        String nombre,
        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 100)
        String unidad,
        @NotNull
        @PositiveOrZero(message = "Los numeros deben ser positivos.")
        Integer stockActual,
        @NotNull
        @PositiveOrZero(message = "Los numeros deben ser positivos.")
        Integer stockMinimo) {
}

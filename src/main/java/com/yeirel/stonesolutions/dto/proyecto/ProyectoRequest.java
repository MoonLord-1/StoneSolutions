package com.yeirel.stonesolutions.dto.proyecto;

import com.yeirel.stonesolutions.entidades.ProyectoEstado;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record ProyectoRequest(
        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 100)
        String nombre,

        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 100)
        String cliente,

        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 200)
        String direccion,

        @NotNull
        ProyectoEstado estado,

        @NotNull
        LocalDateTime fechaInicio,


        LocalDateTime fechaFin
) {
}

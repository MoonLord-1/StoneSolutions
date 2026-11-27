package com.yeirel.stonesolutions.dto.usuario;

import com.yeirel.stonesolutions.entidades.UsuarioRoles;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(
        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 100)
        String nombre,
        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( max = 100)
        @Email
        String email,
        @NotBlank(message = "No puede estar vacia la opcion.")
        @Size( min = 8, max = 100)
        String passwordHash,
        @NotNull
        UsuarioRoles rol
) {
}

package com.yeirel.stonesolutions.dto.usuario;

import com.yeirel.stonesolutions.entidades.UsuarioRoles;

public record UsuarioResponse(
        Long id,
        String nombre,
        String email,
        UsuarioRoles rol
) {
}

package com.yeirel.stonesolutions.dto.material;

public record MaterialResponse(
        Long id,
        String nombre,
        String unidad,
        int stockActual,
        int stockMinimo) {
}

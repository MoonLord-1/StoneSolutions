package com.yeirel.stonesolutions.dto.proyectoMaterial;

import com.yeirel.stonesolutions.entidades.Material;
import com.yeirel.stonesolutions.entidades.Proyecto;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public record ProyectoMaterialResponse(
        Long id,
        Proyecto proyecto,
        Material material,
        int cantidadUsada
) {
}

package com.yeirel.stonesolutions.entidades;

import com.yeirel.stonesolutions.entidades.Material;
import com.yeirel.stonesolutions.entidades.Proyecto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "proyecto_material",
        uniqueConstraints = @UniqueConstraint(columnNames = {"proyecto_id", "material_id"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProyectoMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "material_id")
    private Material material;

    @Column(nullable = false)
    private int cantidadUsada;
}
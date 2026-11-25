package com.yeirel.stonesolutions.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "proyectos")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String cliente;
    private String direccion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProyectoEstado estado;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;







}

package com.proyect.app.repository;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_VEHICULOS")
public class VehiculoRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "año")
    private String año;
    @Column(name = "color")
    private String color;
    @Column(name = "precio")
    private double precio;
    @Column(name = "tipo_vehiculo")
    private String tipo_vehiculo;
    @Column(name = "concesionaria")
    private String concesionaria;
    @Column(name = "imagen_cargada")
    private String imagen_cargada;

}

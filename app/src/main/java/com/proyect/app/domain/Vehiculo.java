package com.proyect.app.domain;

import lombok.Data;

@Data
public class Vehiculo {
    private Long id;
    private String marca;
    private String modelo;
    private String año;
    private String color;
    private double precio;
    private String tipo_vehiculo;
    private String concesionaria;
    private String imagen_cargada;

    public Vehiculo(Long id, String marca, String modelo, String año, String color, double precio, String tipo_vehiculo,
            String concesionaria, String imagen_cargada) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
        this.tipo_vehiculo = tipo_vehiculo;
        this.concesionaria = concesionaria;
        this.imagen_cargada = imagen_cargada;
    }

    public Vehiculo() {
    }

}
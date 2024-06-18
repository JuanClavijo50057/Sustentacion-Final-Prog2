package com.proyect.app.service;

import java.util.ArrayList;

import com.proyect.app.domain.Vehiculo;

public interface VehiculoService {

    void AgregarVehiculo(Vehiculo vehiculo);

    ArrayList<Vehiculo> ListarVehiculos();
    
}

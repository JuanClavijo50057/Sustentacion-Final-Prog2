package com.proyect.app.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.proyect.app.domain.Vehiculo;

@Service
public class VehiculoServiceImp implements VehiculoService {

    private final ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    @Override
    public void AgregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public ArrayList<Vehiculo> ListarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            return vehiculos;
        }
        return null;
    }
}
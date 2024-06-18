package com.proyect.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyect.app.domain.Vehiculo;

@Controller
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/")
    public String vistaPrincipal() {
        return "vista_principal";
    }

    @GetMapping("/agregar-vehiculo")
    public String MostrarFormularioVehiculo(Model model) {
        model.addAttribute("vehiculo", new Vehiculo());
        return "add_vehiculo";
    }

    @PostMapping("/agregar-vehiculo")
    public String GuardarVehiculo(@ModelAttribute("vehiculo") Vehiculo vehiculo) {
        vehiculoService.AgregarVehiculo(vehiculo);
        return "redirect:/vehiculos";

    }

    @GetMapping("/vehiculos")
    public String ListaDeLibros(Model model) {
        model.addAttribute("vehiculoListAttribute", vehiculoService.ListarVehiculos());
        return "vehiculos";
    }

}

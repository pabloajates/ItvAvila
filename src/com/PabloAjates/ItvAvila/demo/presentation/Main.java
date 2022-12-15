package com.PabloAjates.ItvAvila.demo.presentation;

import com.PabloAjates.ItvAvila.demo.domain.models.*;
import com.PabloAjates.ItvAvila.demo.domain.usecase.BuscarVehiculoUseCase;
import com.PabloAjates.ItvAvila.demo.domain.usecase.GuardarPropietarioUseCase;

public class Main {
    public static void main(String[] args){

     //propietario
        Propietario propietario = new Propietario();
        propietario.setDni("SGUWG6");
        propietario.setNombre("Juan");
        propietario.setApellidos("Perez");
        propietario.setDireccion("Calle la paz 5");
        propietario.setPoblacion("pueblo");
        propietario.setProvincia("Avila");
        propietario.setTelefono("747474747");

       //camion
        Camion camion = new Camion();
        camion.setMatricula("");
        camion.setMarca("");
        camion.setModelo("");
        camion.setColor("");
        camion.setAñoMatriculacion("");
        camion.setTara("");
        camion.setLongitud("");

        //coche
        Coche coche = new Coche();
        coche.setMatricula("");
        coche.setMarca("");
        coche.setModelo("");
        coche.setColor("");
        coche.setAñoMatriculacion("");
        coche.setNumPuertas("");

        //Inspeccion1
        Inspeccion inspeccion1 = new Inspeccion();
        inspeccion1.setCodInspeccion(1);
        inspeccion1.setFechaInspeccion(" ");
        inspeccion1.setResultadoInspeccion("true");
        inspeccion1.setVehiculo(camion);

        BuscarVehiculoUseCase buscarVehiculoUseCase = new BuscarVehiculoUseCase();
        Vehiculo vehiculo = buscarVehiculoUseCase.execute("1");
        System.out.println("Demo buscado" + camion.getMatricula() + " | " + camion.getMarca());

        inspeccion1.setPropietario(propietario);

        //inspeccion2
        Inspeccion inspeccion2 = new Inspeccion();
        inspeccion2.setCodInspeccion(2);
        inspeccion2.setFechaInspeccion(" ");
        inspeccion2.setResultadoInspeccion("false");
        inspeccion2.setVehiculo(camion);

        GuardarPropietarioUseCase guardarPropietarioUseCase = new GuardarPropietarioUseCase();

    }

}
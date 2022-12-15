package com.PabloAjates.ItvAvila.demo.presentation;

import com.PabloAjates.ItvAvila.demo.domain.models.*;
import com.PabloAjates.ItvAvila.demo.domain.usecase.BuscarVehiculoUseCase;

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

        //Inspeccion
        Inspeccion inspeccion1 = new Inspeccion();
        inspeccion1.setCodInspeccion(1);
        inspeccion1.setFechaInspeccion(" ");
        inspeccion1.setResultadoInspeccion("");
        inspeccion1.setVehiculo(camion);

        BuscarVehiculoUseCase buscarVehiculoUseCase = new BuscarVehiculoUseCase();
        Vehiculo demoBuscado = buscarVehiculoUseCase.execute("1");
        System.out.println("Demo buscado" + camion.getMatricula() + " | " + camion.getMarca());

        inspeccion1.setPropietario(propietario);


    }

}
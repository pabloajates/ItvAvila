package com.PabloAjates.ItvAvila.demo.domain.usecase;

import com.PabloAjates.ItvAvila.demo.data.VehiculoDataStore;
import com.PabloAjates.ItvAvila.demo.domain.models.Vehiculo;


public class BuscarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String matricula) {
        return dataStore.buscar(matricula);
    }
}

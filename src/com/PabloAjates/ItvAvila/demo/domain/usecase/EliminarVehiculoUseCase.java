package com.PabloAjates.ItvAvila.demo.domain.usecase;

import com.PabloAjates.ItvAvila.demo.data.VehiculoDataStore;

public class EliminarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(String matricula) {
        dataStore.eliminar(matricula);
    }
}

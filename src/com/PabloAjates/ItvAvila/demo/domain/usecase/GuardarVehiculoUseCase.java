package com.PabloAjates.ItvAvila.demo.domain.usecase;

import com.PabloAjates.ItvAvila.demo.data.VehiculoDataStore;
import com.PabloAjates.ItvAvila.demo.domain.models.Vehiculo;


public class GuardarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo vehiculo) {
        dataStore.guardar(vehiculo);
    }
}

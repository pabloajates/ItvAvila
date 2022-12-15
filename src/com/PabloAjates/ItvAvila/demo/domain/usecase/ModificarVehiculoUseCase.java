package com.PabloAjates.ItvAvila.demo.domain.usecase;

import com.PabloAjates.ItvAvila.demo.data.VehiculoDataStore;
import com.PabloAjates.ItvAvila.demo.domain.models.Vehiculo;


public class ModificarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo vehiculo) {
        dataStore.modificar(vehiculo);
    }
}

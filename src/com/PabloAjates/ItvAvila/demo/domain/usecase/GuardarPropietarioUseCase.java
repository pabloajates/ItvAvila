package com.PabloAjates.ItvAvila.demo.domain.usecase;

import com.PabloAjates.ItvAvila.demo.data.PropietarioDataStore;
import com.PabloAjates.ItvAvila.demo.data.VehiculoDataStore;
import com.PabloAjates.ItvAvila.demo.domain.models.Propietario;
import com.PabloAjates.ItvAvila.demo.domain.models.Vehiculo;


public class GuardarPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Propietario propietario) {
        dataStore.guardar(propietario);
    }
}

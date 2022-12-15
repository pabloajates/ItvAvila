package com.PabloAjates.ItvAvila.demo.domain.models;

public class Inspeccion {

    private Integer codInspeccion;
    private String FechaInspeccion;
    private String resultadoInspeccion;
    private Vehiculo vehiculo;
    private Propietario propietario;

    public Integer getCodInspeccion() {
        return codInspeccion;
    }

    public void setCodInspeccion(Integer codInspeccion) {
        this.codInspeccion = codInspeccion;
    }

    public String getFechaInspeccion() {
        return FechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        FechaInspeccion = fechaInspeccion;
    }

    public String getResultadoInspeccion() {
        return resultadoInspeccion;
    }

    public void setResultadoInspeccion(String resultadoInspeccion) {
        this.resultadoInspeccion = resultadoInspeccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}

package com.imagosur.domain;

public class InfDeseoEvolucion {
    private Long idDeseoEvolucion;
    private String descripcionDeseoEvolucion;
    private String valorDeseoEvolucion;

    public String getValorDeseoEvolucion() {
        return valorDeseoEvolucion;
    }

    public void setValorDeseoEvolucion(String valorDeseoEvolucion) {
        this.valorDeseoEvolucion = valorDeseoEvolucion;
    }

    public Long getIdDeseoEvolucion() {
        return idDeseoEvolucion;
    }

    public void setIdDeseoEvolucion(Long idDeseoEvolucion) {
        this.idDeseoEvolucion = idDeseoEvolucion;
    }

    public String getDescripcionDeseoEvolucion() {
        return descripcionDeseoEvolucion;
    }

    public void setDescripcionDeseoEvolucion(String descripcionDeseoEvolucion) {
        this.descripcionDeseoEvolucion = descripcionDeseoEvolucion;
    }

    @Override
    public String toString() {
        return "InfDeseoEvolucion [idDeseoEvolucion=" + idDeseoEvolucion + ", descripcionDeseoEvolucion="
                + descripcionDeseoEvolucion + ", valorDeseoEvolucion=" + valorDeseoEvolucion + "]";
    }
}
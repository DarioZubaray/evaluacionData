package com.imagosur.domain;

public class EncabezadoDeseoEvolucion {
    private Long idDeseosEvolucion;
    private String descripcionDeseosEvolucion;

    public Long getIdDeseosEvolucion() {
        return idDeseosEvolucion;
    }

    public void setIdDeseosEvolucion(Long idDeseosEvolucion) {
        this.idDeseosEvolucion = idDeseosEvolucion;
    }

    public String getDescripcionDeseosEvolucion() {
        return descripcionDeseosEvolucion;
    }

    public void setDescripcionDeseosEvolucion(String descripcionDeseosEvolucion) {
        this.descripcionDeseosEvolucion = descripcionDeseosEvolucion;
    }

    @Override
    public String toString() {
        return "EncabezadoDeseoEvolucion [idDeseosEvolucion=" + idDeseosEvolucion + ", descripcionDeseosEvolucion="
                + descripcionDeseosEvolucion + "]";
    }
}
package com.imagosur.domain;

public class Explotacion {

    private Long idExplotacion;
    private String descripcionExplotacion;
    private Long inactivo;

    public Long getIdExplotacion() {
        return idExplotacion;
    }

    public void setIdExplotacion(Long idExplotacion) {
        this.idExplotacion = idExplotacion;
    }

    public String getDescripcionExplotacion() {
        return descripcionExplotacion;
    }

    public void setDescripcionExplotacion(String descripcionExplotacion) {
        this.descripcionExplotacion = descripcionExplotacion;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "Explotacion [idExplotacion=" + idExplotacion + ", descripcionExplotacion=" + descripcionExplotacion + ", inactiva=" + inactivo + "]";
    }

}

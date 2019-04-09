package com.imagosur.domain;

public class Explotacion {

    private Long idExplotacion;
    private String descripcionExplotacion;
    private Long inactiva;

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

    public Long getInactiva() {
        return inactiva;
    }

    public void setInactiva(Long inactiva) {
        this.inactiva = inactiva;
    }

    @Override
    public String toString() {
        return "Explotacion [idExplotacion=" + idExplotacion + ", descripcionExplotacion=" + descripcionExplotacion + ", inactiva=" + inactiva + "]";
    }

}

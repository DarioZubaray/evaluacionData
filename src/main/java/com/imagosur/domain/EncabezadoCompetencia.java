package com.imagosur.domain;

public class EncabezadoCompetencia {
    private Long idCompetencia;
    private String descripcionCompetencia;
    private Long idComportamientoCompetencia;
    private String descripcionComportamientoCompetencia;

    public Long getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Long idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDescripcionCompetencia() {
        return descripcionCompetencia;
    }

    public void setDescripcionCompetencia(String descripcionCompetencia) {
        this.descripcionCompetencia = descripcionCompetencia;
    }

    public Long getIdComportamientoCompetencia() {
        return idComportamientoCompetencia;
    }

    public void setIdComportamientoCompetencia(Long idComportamientoCompetencia) {
        this.idComportamientoCompetencia = idComportamientoCompetencia;
    }

    public String getDescripcionComportamientoCompetencia() {
        return descripcionComportamientoCompetencia;
    }

    public void setDescripcionComportamientoCompetencia(String descripcionComportamientoCompetencia) {
        this.descripcionComportamientoCompetencia = descripcionComportamientoCompetencia;
    }

    @Override
    public String toString() {
        return "EncabezadoCompetencia [idCompetencia=" + idCompetencia + ", descripcionCompetencia="
                + descripcionCompetencia + ", idComportamientoCompetencia=" + idComportamientoCompetencia
                + ", descripcionComportamientoCompetencia=" + descripcionComportamientoCompetencia + "]";
    }
}
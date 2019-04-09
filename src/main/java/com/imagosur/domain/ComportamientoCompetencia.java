package com.imagosur.domain;

public class ComportamientoCompetencia {

    private Long idComportamientoCompetencia;
    private Long idPlantilla;
    private Long idCompetencia;
    private String descripcionComportamientoCompetencia;
    private Long inactivo;

    public Long getIdComportamientoCompetencia() {
        return idComportamientoCompetencia;
    }

    public void setIdComportamientoCompetencia(Long idComportamientoCompetencia) {
        this.idComportamientoCompetencia = idComportamientoCompetencia;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Long idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDescripcionComportamientoCompetencia() {
        return descripcionComportamientoCompetencia;
    }

    public void setDescripcionComportamientoCompetencia(String descripcionComportamientoCompetencia) {
        this.descripcionComportamientoCompetencia = descripcionComportamientoCompetencia;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "ComportamientoCompetencia [idComportamientoCompetencia=" + idComportamientoCompetencia
                + ", idPlantilla=" + idPlantilla + ", idCompetencia=" + idCompetencia
                + ", descripcionComportamientoCompetencia=" + descripcionComportamientoCompetencia + ", inactivo="
                + inactivo + "]";
    }
}
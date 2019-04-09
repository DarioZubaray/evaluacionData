package com.imagosur.domain;

public class CalificacionCompetencia {

    private Long idCalificacionCompetencia;
    private Long idPlantilla;
    private Long numero;
    private String descripcionCorta;
    private String descripcionCalificacionCompentencia;
    private Long inactivo;
    private Double numeroHasta;

    public Double getNumeroHasta() {
        return numeroHasta;
    }

    public void setNumeroHasta(Double numeroHasta) {
        this.numeroHasta = numeroHasta;
    }

    public Long getIdCalificacionCompetencia() {
        return idCalificacionCompetencia;
    }

    public void setIdCalificacionCompetencia(Long idCalificacionCompetencia) {
        this.idCalificacionCompetencia = idCalificacionCompetencia;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcionCalificacionCompentencia() {
        return descripcionCalificacionCompentencia;
    }

    public void setDescripcionCalificacionCompentencia(String descripcionCalificacionCompentencia) {
        this.descripcionCalificacionCompentencia = descripcionCalificacionCompentencia;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "CalificacionCompetencia [idCalificacionCompetencia=" + idCalificacionCompetencia + ", idPlantilla="
                + idPlantilla + ", numero=" + numero + ", descripcionCorta=" + descripcionCorta
                + ", descripcionCalificacionCompentencia=" + descripcionCalificacionCompentencia + ", inactivo="
                + inactivo + ", numeroHasta=" + numeroHasta + "]";
    }
}
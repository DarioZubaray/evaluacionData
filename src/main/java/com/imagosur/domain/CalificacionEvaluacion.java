package com.imagosur.domain;

public class CalificacionEvaluacion {
    private Long idCalificacionEvaluacion;
    private String descripcionCalificacionEvaluacion;
    private Long numero;
    private Long idPlantilla;
    private Long inactivo;
    private Double numeroHasta;

    public Double getNumeroHasta() {
        return numeroHasta;
    }

    public void setNumeroHasta(Double numeroHasta) {
        this.numeroHasta = numeroHasta;
    }

    public Long getIdCalificacionEvaluacion() {
        return idCalificacionEvaluacion;
    }

    public void setIdCalificacionEvaluacion(Long idCalificacionEvaluacion) {
        this.idCalificacionEvaluacion = idCalificacionEvaluacion;
    }

    public String getDescripcionCalificacionEvaluacion() {
        return descripcionCalificacionEvaluacion;
    }

    public void setDescripcionCalificacionEvaluacion(String descripcionCalificacionEvaluacion) {
        this.descripcionCalificacionEvaluacion = descripcionCalificacionEvaluacion;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "CalificacionEvaluacion [idCalificacionEvaluacion=" + idCalificacionEvaluacion
                + ", descripcionCalificacionEvaluacion=" + descripcionCalificacionEvaluacion + ", numero=" + numero
                + ", idPlantilla=" + idPlantilla + ", inactivo=" + inactivo + ", numeroHasta=" + numeroHasta + "]";
    }
}
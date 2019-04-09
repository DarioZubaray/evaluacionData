package com.imagosur.domain;

public class CalificacionTarea {
    private Long idCalificacionTarea;
    private Long idPlantilla;
    private Long numero;
    private String descripcionCalificacionTarea;
    private Long inactivo;
    private Double numeroHasta;

    public Long getIdCalificacionTarea() {
        return idCalificacionTarea;
    }

    public void setIdCalificacionTarea(Long idCalificacionTarea) {
        this.idCalificacionTarea = idCalificacionTarea;
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

    public String getDescripcionCalificacionTarea() {
        return descripcionCalificacionTarea;
    }

    public void setDescripcionCalificacionTarea(String descripcionCalificacionTarea) {
        this.descripcionCalificacionTarea = descripcionCalificacionTarea;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    public Double getNumeroHasta() {
        return numeroHasta;
    }

    public void setNumeroHasta(Double numeroHasta) {
        this.numeroHasta = numeroHasta;
    }

    @Override
    public String toString() {
        return "CalificacionTarea [idCalificacionTarea=" + idCalificacionTarea + ", numero=" + numero + ", descripcionCalificacionTarea="
                + descripcionCalificacionTarea + ", numeroHasta=" + numeroHasta + "]";
    }
}
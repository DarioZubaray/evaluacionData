package com.imagosur.domain;

public class Tarea implements GetterValorEvaluacion {

    private Long idTarea;
    private String descripcionTarea;
    private String valorAutoEvaluacion;
    private String valorConjunto;
    private Long idPlantilla;
    private Long inactivo;

    public Tarea() {
        super();
    }

    public Tarea(Long idTarea) {
        super();
        this.idTarea = idTarea;
        this.descripcionTarea = "-- Seleccione una tarea --";
    }

    public Long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Long idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getValorAutoEvaluacion() {
        return valorAutoEvaluacion;
    }

    public void setValorAutoEvaluacion(String valorAutoEvaluacion) {
        this.valorAutoEvaluacion = valorAutoEvaluacion;
    }

    public String getValorConjunto() {
        return valorConjunto;
    }

    public void setValorConjunto(String valorConjunto) {
        this.valorConjunto = valorConjunto;
    }

    @Override
    public String toString() {
        return "Tarea [idTarea=" + idTarea + ", descripcionTarea=" + descripcionTarea + ", valorAutoEvaluacion=" + valorAutoEvaluacion
                + ", valorConjunto=" + valorConjunto + "]";
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

}

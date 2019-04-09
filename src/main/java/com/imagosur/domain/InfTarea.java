package com.imagosur.domain;

public class InfTarea {
    private Long idTarea;
    private String descripcionTarea;
    private String valorAutoEvaluacion;
    private String valorConjunto;

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
        return "InfTarea [idTarea=" + idTarea + ", descripcionTarea=" + descripcionTarea + ", valorAutoEvaluacion="
                + valorAutoEvaluacion + ", valorConjunto=" + valorConjunto + "]";
    }
}
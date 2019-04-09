package com.imagosur.domain;

public class InfCompetencia {
    private Long idCompentencia;
    private String descripcionCompetencia;
    private Long idComportamientoCompetencia;
    private String descripcionComportamientoCompetencia;
    private String valorAutoEvaluacion;
    private String valorConjunto;

    public Long getIdCompentencia() {
        return idCompentencia;
    }

    public void setIdCompentencia(Long idCompentencia) {
        this.idCompentencia = idCompentencia;
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
        return "InfCompetencia [idCompentencia=" + idCompentencia + ", descripcionCompetencia=" + descripcionCompetencia
                + ", idComportamientoCompetencia=" + idComportamientoCompetencia
                + ", descripcionComportamientoCompetencia=" + descripcionComportamientoCompetencia
                + ", valorAutoEvaluacion=" + valorAutoEvaluacion + ", valorConjunto=" + valorConjunto + "]";
    }
}
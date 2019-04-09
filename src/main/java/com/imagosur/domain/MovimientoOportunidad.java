package com.imagosur.domain;

import java.util.List;

public class MovimientoOportunidad {
    private Long idOportunidad;
    private String comentarioAuto;
    private String comentarioConjunto;
    private Long idEvaluacion;
    private Long idLegajoEvaluado;
    private List<Oportunidad> competenciasHabilidades;

    public Long getIdOportunidad() {
        return idOportunidad;
    }
    public void setIdOportunidad(Long idOportunidad) {
        this.idOportunidad = idOportunidad;
    }
    public String getComentarioAuto() {
        return comentarioAuto;
    }
    public void setComentarioAuto(String comentarioAuto) {
        this.comentarioAuto = comentarioAuto;
    }
    public String getComentarioConjunto() {
        return comentarioConjunto;
    }
    public void setComentarioConjunto(String comentarioConjunto) {
        this.comentarioConjunto = comentarioConjunto;
    }
    public Long getIdEvaluacion() {
        return idEvaluacion;
    }
    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }
    public Long getIdLegajoEvaluado() {
        return idLegajoEvaluado;
    }
    public void setIdLegajoEvaluado(Long idLegajoEvaluado) {
        this.idLegajoEvaluado = idLegajoEvaluado;
    }
    public List<Oportunidad> getCompetenciasHabilidades() {
        return competenciasHabilidades;
    }
    public void setCompetenciasHabilidades(List<Oportunidad> competenciasHabilidades) {
        this.competenciasHabilidades = competenciasHabilidades;
    }
}

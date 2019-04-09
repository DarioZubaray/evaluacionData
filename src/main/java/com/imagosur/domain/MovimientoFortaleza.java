package com.imagosur.domain;

import java.util.List;

public class MovimientoFortaleza {

    private Long idFortaleza;
    private String comentarioAuto;
    private String comentarioConjunto;
    private Long idEvaluacion;
    private Long idLegajoEvaluado;
    private List<Fortaleza> competenciasHabilidades;

    public Long getIdFortaleza() {
        return idFortaleza;
    }
    public void setIdFortaleza(Long idFortaleza) {
        this.idFortaleza = idFortaleza;
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
    public List<Fortaleza> getCompetenciasHabilidades() {
        return competenciasHabilidades;
    }
    public void setCompetenciasHabilidades(List<Fortaleza> competenciasHabilidades) {
        this.competenciasHabilidades = competenciasHabilidades;
    }
    
}

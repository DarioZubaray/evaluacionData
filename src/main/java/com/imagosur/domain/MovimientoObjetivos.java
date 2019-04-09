package com.imagosur.domain;

public class MovimientoObjetivos implements GetterValorEvaluacion {

    private Long idCalificacionAuto;
    private int puntajeAuto;
    private String descripcionPuntajeAuto;
    private Long idCalificacionConjunta;
    private int puntajeConjunta;
    private String descripcionPuntajeConjunta;
    private String autoevaluacionActual;
    private String autoevaluacionObjetivos;
    private String conjuntaActual;
    private String conjuntaObjetivos;

    private NivelObjetivo nivelObjetivoAuto;
    private NivelObjetivo nivelObjetivoConjunto;

    public int getPuntajeAuto() {
        return puntajeAuto;
    }

    public void setPuntajeAuto(int puntajeAuto) {
        this.puntajeAuto = puntajeAuto;
    }

    public String getDescripcionPuntajeAuto() {
        return descripcionPuntajeAuto;
    }

    public void setDescripcionPuntajeAuto(String descripcionPuntajeAuto) {
        this.descripcionPuntajeAuto = descripcionPuntajeAuto;
    }

    public int getPuntajeConjunta() {
        return puntajeConjunta;
    }

    public void setPuntajeConjunta(int puntajeConjunta) {
        this.puntajeConjunta = puntajeConjunta;
    }

    public String getDescripcionPuntajeConjunta() {
        return descripcionPuntajeConjunta;
    }

    public void setDescripcionPuntajeConjunta(String descripcionPuntajeConjunta) {
        this.descripcionPuntajeConjunta = descripcionPuntajeConjunta;
    }

    public String getAutoevaluacionActual() {
        return autoevaluacionActual;
    }

    public void setAutoevaluacionActual(String autoevaluacionActual) {
        this.autoevaluacionActual = autoevaluacionActual;
    }

    public String getAutoevaluacionObjetivos() {
        return autoevaluacionObjetivos;
    }

    public void setAutoevaluacionObjetivos(String autoevaluacionObjetivos) {
        this.autoevaluacionObjetivos = autoevaluacionObjetivos;
    }

    public String getConjuntaActual() {
        return conjuntaActual;
    }

    public void setConjuntaActual(String conjuntaActual) {
        this.conjuntaActual = conjuntaActual;
    }

    public String getConjuntaObjetivos() {
        return conjuntaObjetivos;
    }

    public void setConjuntaObjetivos(String conjuntaObjetivos) {
        this.conjuntaObjetivos = conjuntaObjetivos;
    }

    public Long getIdCalificacionAuto() {
        return idCalificacionAuto;
    }

    public void setIdCalificacionAuto(Long idCalificacionAuto) {
        this.idCalificacionAuto = idCalificacionAuto;
    }

    public Long getIdCalificacionConjunta() {
        return idCalificacionConjunta;
    }

    public void setIdCalificacionConjunta(Long idCalificacionConjunta) {
        this.idCalificacionConjunta = idCalificacionConjunta;
    }

    public String getValorConjunto() {
        return String.valueOf(puntajeConjunta);
    }

    public String getValorAutoEvaluacion() {
        return String.valueOf(puntajeAuto);
    }

    @Override
    public String toString() {
        return "idCalificacionAuto=" + idCalificacionAuto + ", idCalificacionConjunta="
                + idCalificacionConjunta + "]";
    }

    public NivelObjetivo getNivelObjetivoAuto() {
        return nivelObjetivoAuto;
    }

    public void setNivelObjetivoAuto(NivelObjetivo nivelObjetivoAuto) {
        this.nivelObjetivoAuto = nivelObjetivoAuto;
    }

    public NivelObjetivo getNivelObjetivoConjunto() {
        return nivelObjetivoConjunto;
    }

    public void setNivelObjetivoConjunto(NivelObjetivo nivelObjetivoConjunto) {
        this.nivelObjetivoConjunto = nivelObjetivoConjunto;
    }


}

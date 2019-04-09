package com.imagosur.domain;

public class LegajoExceptuado {

    private Long idLegajoExceptuado;
    private Long idEvaluacion;
    private String comentario;
    private Legajo legajo;

    public Long getIdLegajoExceptuado() {
        return idLegajoExceptuado;
    }

    public void setIdLegajoExceptuado(Long idLegajoExceptuado) {
        this.idLegajoExceptuado = idLegajoExceptuado;
    }

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Legajo getLegajo() {
        return legajo;
    }

    public void setLegajo(Legajo legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "LegajoExceptuado [idLegajoExceptuado=" + idLegajoExceptuado + ", idEvaluacion=" + idEvaluacion
                + ", comentario=" + comentario + ", legajo=" + legajo + "]";
    }
}
package com.imagosur.domain;

public class Pregunta {

    private Long idPregunta;
    private String descripcionPregunta;
    private Long inactivo;

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getDescripcionPregunta() {
        return descripcionPregunta;
    }

    public void setDescripcionPregunta(String descripcionPregunta) {
        this.descripcionPregunta = descripcionPregunta;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "Pregunta [idPregunta=" + idPregunta + ", descripcionPregunta=" + descripcionPregunta + ", inactivo=" + inactivo + "]";
    }

}

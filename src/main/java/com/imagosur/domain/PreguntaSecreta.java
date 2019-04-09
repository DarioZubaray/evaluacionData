package com.imagosur.domain;

public class PreguntaSecreta {
    private Long idPreguntaSecreta;
    private String descripcionPreguntaSecreta;
    private Long inactivo;

    public Long getIdPreguntaSecreta() {
        return idPreguntaSecreta;
    }

    public void setIdPreguntaSecreta(Long idPreguntaSecreta) {
        this.idPreguntaSecreta = idPreguntaSecreta;
    }

    public String getDescripcionPreguntaSecreta() {
        return descripcionPreguntaSecreta;
    }

    public void setDescripcionPreguntaSecreta(String descripcionPreguntaSecreta) {
        this.descripcionPreguntaSecreta = descripcionPreguntaSecreta;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "PreguntaSecreta [idPreguntaSecreta=" + idPreguntaSecreta + ", descripcionPreguntaSecreta="
                + descripcionPreguntaSecreta + ", inactivo=" + inactivo + "]";
    }
}
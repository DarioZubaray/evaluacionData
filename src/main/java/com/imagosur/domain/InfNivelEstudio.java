package com.imagosur.domain;

public class InfNivelEstudio {
    private String descripcionNivelEstudio;
    private String titulo;
    private String tituloEstado;

    public String getDescripcionNivelEstudio() {
        return descripcionNivelEstudio;
    }

    public void setDescripcionNivelEstudio(String descripcionNivelEstudio) {
        this.descripcionNivelEstudio = descripcionNivelEstudio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloEstado() {
        return tituloEstado;
    }

    public void setTituloEstado(String tituloEstado) {
        this.tituloEstado = tituloEstado;
    }

    @Override
    public String toString() {
        return "InfNivelEstudio [descripcionNivelEstudio=" + descripcionNivelEstudio + ", titulo=" + titulo
                + ", tituloEstado=" + tituloEstado + "]";
    }
}
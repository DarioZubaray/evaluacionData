package com.imagosur.domain;

public class LegajoTitulo {
    private String idLegajo;
    private Titulo titulo;
    private TituloEstado tituloEstado;
    private Legajo legajo;

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public TituloEstado getTituloEstado() {
        return tituloEstado;
    }

    public void setTituloEstado(TituloEstado tituloEstado) {
        this.tituloEstado = tituloEstado;
    }

    public String getIdLegajo() {
        return idLegajo;
    }

    public void setIdLegajo(String idLegajo) {
        this.idLegajo = idLegajo;
    }

    public Legajo getLegajo() {
        return legajo;
    }

    public void setLegajo(Legajo legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "LegajoTitulo [idLegajo=" + idLegajo + ", titulo=" + titulo + ", tituloEstado=" + tituloEstado + ", legajo=" + legajo + "]";
    }

}

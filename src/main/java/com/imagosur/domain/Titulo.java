package com.imagosur.domain;

public class Titulo {
    private Long idTitulo;
    private String descripcion;
    private NivelEstudio nivelEstudio;

    private TituloEstado estado;

    public Long getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Long idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(NivelEstudio nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    @Override
    public String toString() {
        return "Titulo [idTitulo=" + idTitulo + ", descripcion=" + descripcion + ", nivelEstudio=" + nivelEstudio + "]";
    }

    public TituloEstado getEstado() {
        return estado;
    }

    public void setEstado(TituloEstado estado) {
        this.estado = estado;
    }

}

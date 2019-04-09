package com.imagosur.domain;

public class TituloEstado {
    private Long idTituloEstado;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdTituloEstado() {
        return idTituloEstado;
    }

    public void setIdTituloEstado(Long idTituloEstado) {
        this.idTituloEstado = idTituloEstado;
    }

    @Override
    public String toString() {
        return "TituloEstado [idTituloEstado=" + idTituloEstado + ", descripcion=" + descripcion + "]";
    }

}

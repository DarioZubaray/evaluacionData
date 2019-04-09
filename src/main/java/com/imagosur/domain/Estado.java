package com.imagosur.domain;

import java.io.Serializable;

public class Estado implements Serializable {

    private static final long serialVersionUID = -541188342401681172L;
    private Long id;
    private String descripcion;
    private String codigo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estado [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
    }

}

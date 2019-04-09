package com.imagosur.domain;

public class EncabezadoCompetenciaJ {
    private Long id;
    private String descripcion;
    private String definicion;

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

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return "EncabezadoCompetenciaJ [id=" + id + ", descripcion=" + descripcion + ", definicion=" + definicion + "]";
    }
}
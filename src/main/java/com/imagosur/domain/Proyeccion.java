package com.imagosur.domain;

public class Proyeccion {
    private Long idProyeccion;
    private String descripcion;

    public Long getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Long idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Proyeccion [idProyeccion=" + idProyeccion + ", descripcion=" + descripcion + "]";
    }

}

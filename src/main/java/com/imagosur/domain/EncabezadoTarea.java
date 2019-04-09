package com.imagosur.domain;

public class EncabezadoTarea {
    private Long idTarea;
    private String descripcionTareas;

    public Long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Long idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcionTareas() {
        return descripcionTareas;
    }

    public void setDescripcionTareas(String descripcionTareas) {
        this.descripcionTareas = descripcionTareas;
    }

    @Override
    public String toString() {
        return "EncabezadoTarea [idTarea=" + idTarea + ", descripcionTareas=" + descripcionTareas + "]";
    }
}
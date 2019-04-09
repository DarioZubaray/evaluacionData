package com.imagosur.domain;

import java.util.List;

public class EncabezadoPotencialJ {
    private Long id;
    private String descripcion;

    private List<EncabezadoPotencialConcepto> conceptos;

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

    public List<EncabezadoPotencialConcepto> getConceptos() {
        return conceptos;
    }

    public void setConceptos(List<EncabezadoPotencialConcepto> conceptos) {
        this.conceptos = conceptos;
    }

    @Override
    public String toString() {
        return "EncabezadoPotencialJ [id=" + id + ", descripcion=" + descripcion + ", conceptos=" + conceptos + "]";
    }
}
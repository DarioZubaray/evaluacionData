package com.imagosur.domain;

public class NivelObjetivo {
    private Long idObjetivo; 
    private Long idNivel;
    private String descripcion;

    public Long getIdObjetivo() {
        return idObjetivo;
    }
    public void setIdObjetivo(Long idObjetivo) {
        this.idObjetivo = idObjetivo;
    }
    public Long getIdNivel() {
        return idNivel;
    }
    public void setIdNivel(Long idNivel) {
        this.idNivel = idNivel;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package com.imagosur.domain;

public class IdiomaNivel {

    private Short idIdiomaNivel;
    private String descripcion;

    public Short getIdIdiomaNivel() {
        return idIdiomaNivel;
    }

    public void setIdIdiomaNivel(Short idIdiomaNivel) {
        this.idIdiomaNivel = idIdiomaNivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "IdiomaNivel [idIdiomaNivel=" + idIdiomaNivel + ", descripcion=" + descripcion + "]";
    }
}

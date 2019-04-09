package com.imagosur.domain;

public class PotencialConcepto {
    private Long idPotencialConcepto;
    private String descripcion;
    private boolean posee;

    public Long getIdPotencialConcepto() {
        return idPotencialConcepto;
    }

    public void setIdPotencialConcepto(Long idPotencialConcepto) {
        this.idPotencialConcepto = idPotencialConcepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPosee() {
        return posee;
    }

    public void setPosee(boolean posee) {
        this.posee = posee;
    }

    @Override
    public String toString() {
        return "PotencialConcepto [idPotencialConcepto=" + idPotencialConcepto + ", descripcion=" + descripcion + ", posee=" + posee + "]";
    }

}

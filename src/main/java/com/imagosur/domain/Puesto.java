package com.imagosur.domain;

public class Puesto implements Cloneable {

    private Long idPuesto;
    private String categoria;
    private String descripcionPuesto;
    private Long inactivo;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Long idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public Object clone() {
        Puesto clon = null;
        try {
            clon = (Puesto) super.clone();
            clon.idPuesto = this.idPuesto;
            clon.categoria = this.categoria;
            clon.descripcionPuesto = this.descripcionPuesto;
            clon.inactivo = this.inactivo;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clon;
    }

    @Override
    public String toString() {
        return "Puesto [idPuesto=" + idPuesto + ", categoria=" + categoria + ", descripcionPuesto=" + descripcionPuesto + ", inactivo=" + inactivo
                + "]";
    }
}

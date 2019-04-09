package com.imagosur.domain;

public class Sector implements Cloneable {
    private Long idSector;
    private String ceCoste;
    private String descripcionSector;
    private Long inactivo;

    public String getCeCoste() {
        return ceCoste;
    }

    public void setCeCoste(String ceCoste) {
        this.ceCoste = ceCoste;
    }

    public Long getIdSector() {
        return idSector;
    }

    public void setIdSector(Long idSector) {
        this.idSector = idSector;
    }

    public String getDescripcionSector() {
        return descripcionSector;
    }

    public void setDescripcionSector(String descripcionSector) {
        this.descripcionSector = descripcionSector;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public Object clone() {
        Sector clon = null;
        try {
            clon = (Sector) super.clone();
            clon.idSector = this.idSector;
            clon.ceCoste = this.ceCoste;
            clon.descripcionSector = this.descripcionSector;
            clon.inactivo = this.inactivo;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clon;
    }

    @Override
    public String toString() {
        return "Sector [idSector=" + idSector + ", ceCoste=" + ceCoste + ", descripcionSector=" + descripcionSector + ", inactivo=" + inactivo + "]";
    }

}

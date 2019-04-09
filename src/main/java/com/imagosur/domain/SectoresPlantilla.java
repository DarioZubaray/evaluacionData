package com.imagosur.domain;

import java.io.Serializable;

public class SectoresPlantilla implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long idSector;
    private Long idPlantilla;

    public Long getIdSector() {
        return idSector;
    }
    public void setIdSector(Long idSector) {
        this.idSector = idSector;
    }
    public Long getIdPlantilla() {
        return idPlantilla;
    }
    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    @Override
    public String toString() {
        return "SectoresPlantilla ["
                + "idSector=" + idSector 
                + ", idPlantilla=" + idPlantilla + "]";
    }
}

package com.imagosur.domain;

import java.io.Serializable;

public class PuestosPlantilla implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long idPuesto;
    private Long idPlantilla;

    public Long getIdPuesto() {
        return idPuesto;
    }
    public void setIdPuesto(Long idPuesto) {
        this.idPuesto = idPuesto;
    }
    public Long getIdPlantilla() {
        return idPlantilla;
    }
    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    @Override
    public String toString() {
        return "PuestosPlantilla ["
                + "idPuesto=" + idPuesto 
                + ", idPlantilla=" + idPlantilla + "]";
    }
}

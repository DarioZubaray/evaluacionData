package com.imagosur.domain;

public class NivelEstudio {
    private Long idNivelEstudio;
    private String descripcion;
    private Long orden;

    public Long getIdNivelEstudio() {
        return idNivelEstudio;
    }

    public void setIdNivelEstudio(Long idNivelEstudio) {
        this.idNivelEstudio = idNivelEstudio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "NivelEstudio [idNivelEstudio=" + idNivelEstudio + ", descripcion=" + descripcion + ", orden=" + orden + "]";
    }

}

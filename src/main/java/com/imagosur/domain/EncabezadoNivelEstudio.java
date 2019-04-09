package com.imagosur.domain;

public class EncabezadoNivelEstudio {
    private Long idNivelEstudio;
    private String descripcionNivelEstudio;

    public Long getIdNivelEstudio() {
        return idNivelEstudio;
    }

    public void setIdNivelEstudio(Long idNivelEstudio) {
        this.idNivelEstudio = idNivelEstudio;
    }

    public String getDescripcionNivelEstudio() {
        return descripcionNivelEstudio;
    }

    public void setDescripcionNivelEstudio(String descripcionNivelEstudio) {
        this.descripcionNivelEstudio = descripcionNivelEstudio;
    }

    @Override
    public String toString() {
        return "EncabezadoNivelEstudio [idNivelEstudio=" + idNivelEstudio + ", descripcionNivelEstudio="
                + descripcionNivelEstudio + "]";
    }
}
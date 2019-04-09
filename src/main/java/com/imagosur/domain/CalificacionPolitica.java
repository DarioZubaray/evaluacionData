package com.imagosur.domain;

public class CalificacionPolitica {
    private Long idCalificacionPolitica;
    private Long idPlantilla;
    private Integer puntaje;
    private String descripcion;
    private String ubicacionMatriz;

    public Long getIdCalificacionPolitica() {
        return idCalificacionPolitica;
    }

    public void setIdCalificacionPolitica(Long idCalificacionPolitica) {
        this.idCalificacionPolitica = idCalificacionPolitica;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacionMatriz() {
        return ubicacionMatriz;
    }

    public void setUbicacionMatriz(String ubicacionMatriz) {
        this.ubicacionMatriz = ubicacionMatriz;
    }

    @Override
    public String toString() {
        return "CalificacionPolitica [idCalificacionPolitica=" + idCalificacionPolitica + ", puntaje=" + puntaje + ", descripcion=" + descripcion
                + ", ubicacionMatriz=" + ubicacionMatriz + "]";
    }
}
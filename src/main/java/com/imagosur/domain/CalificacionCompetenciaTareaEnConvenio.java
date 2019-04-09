package com.imagosur.domain;

public class CalificacionCompetenciaTareaEnConvenio {
    private Long id;
    private Integer idPlantilla;
    private String descripcion;
    private Float promedioMinimo;
    private Float promedioMaximo;
    private Integer posicionEjeMatriz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Integer idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPromedioMinimo() {
        return promedioMinimo;
    }

    public void setPromedioMinimo(Float promedioMinimo) {
        this.promedioMinimo = promedioMinimo;
    }

    public Float getPromedioMaximo() {
        return promedioMaximo;
    }

    public void setPromedioMaximo(Float promedioMaximo) {
        this.promedioMaximo = promedioMaximo;
    }

    public Integer getPosicionEjeMatriz() {
        return posicionEjeMatriz;
    }

    public void setPosicionEjeMatriz(Integer posicionEjeMatriz) {
        this.posicionEjeMatriz = posicionEjeMatriz;
    }

    @Override
    public String toString() {
        return "CalificacionCompetenciaTareaEnConvenio [id=" + id + ", idPlantilla=" + idPlantilla + ", descripcion=" + descripcion
                + ", promedioMinimo=" + promedioMinimo + ", promedioMaximo=" + promedioMaximo + ", posicionEjeMatriz=" + posicionEjeMatriz + "]";
    }
}
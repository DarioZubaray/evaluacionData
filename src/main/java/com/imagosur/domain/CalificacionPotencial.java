package com.imagosur.domain;

public class CalificacionPotencial {
    private Long idCalificacionPotencial;
    private Float minimo;
    private Float maximo;
    private String descripcion;
    private String ubicacionMatriz;
    private String definicion;

    public Long getIdCalificacionPotencial() {
        return idCalificacionPotencial;
    }

    public void setIdCalificacionPotencial(Long idCalificacionPotencial) {
        this.idCalificacionPotencial = idCalificacionPotencial;
    }

    public Float getMinimo() {
        return minimo;
    }

    public void setMinimo(Float minimo) {
        this.minimo = minimo;
    }

    public Float getMaximo() {
        return maximo;
    }

    public void setMaximo(Float maximo) {
        this.maximo = maximo;
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

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return "CalificacionPotencial [idCalificacionPotencial=" + idCalificacionPotencial + ", minimo=" + minimo + ", maximo=" + maximo
                + ", descripcion=" + descripcion + ", ubicacionMatriz=" + ubicacionMatriz + ", definicion=" + definicion + "]";
    }
}
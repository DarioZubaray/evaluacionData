package com.imagosur.domain;

public class CalificacionPotencialJ {
    private Long id;
    private Float minimo;
    private Float maximo;
    private String descripcion;
    private String ubicacionMatriz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "CalificacionPotencialJ [id=" + id + ", minimo=" + minimo + ", maximo=" + maximo + ", descripcion="
                + descripcion + ", ubicacionMatriz=" + ubicacionMatriz + "]";
    }
}
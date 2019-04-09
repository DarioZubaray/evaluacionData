package com.imagosur.domain;

public class Fortaleza implements Comparable<Fortaleza> {

    private Long idFortaleza;
    private Long idTipoFortaleza;
    private String descripcion;
    private Boolean poseeAutoevaluacion;
    private Boolean poseeConjunto;

    @Override
    public int compareTo(Fortaleza fortaleza) {
        if(this.getIdFortaleza() == null || fortaleza.getIdFortaleza() == null) {
            return 0;
        }
        return this.getIdFortaleza().compareTo(fortaleza.getIdFortaleza());
    }

    public Long getIdFortaleza() {
        return idFortaleza;
    }
    public void setIdFortaleza(Long idFortaleza) {
        this.idFortaleza = idFortaleza;
    }
    public Long getIdTipoFortaleza() {
        return idTipoFortaleza;
    }
    public void setIdTipoFortaleza(Long idTipoFortaleza) {
        this.idTipoFortaleza = idTipoFortaleza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getPoseeAutoevaluacion() {
        return poseeAutoevaluacion;
    }
    public void setPoseeAutoevaluacion(Boolean poseeAutoevaluacion) {
        this.poseeAutoevaluacion = poseeAutoevaluacion;
    }
    public Boolean getPoseeConjunto() {
        return poseeConjunto;
    }
    public void setPoseeConjunto(Boolean poseeConjunto) {
        this.poseeConjunto = poseeConjunto;
    }

}

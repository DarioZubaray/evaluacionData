package com.imagosur.domain;

public class Oportunidad implements Comparable<Oportunidad>{

    private Long idOportunidad;
    private Long idTipoOportunidad;
    private String descripcion;
    private Boolean poseeAutoevaluacion;
    private Boolean poseeConjunto;

    @Override
    public int compareTo(Oportunidad oportunidad) {
        if(this.getIdOportunidad() == null || oportunidad.getIdOportunidad() == null) {
            return 0;
        }
        return this.getIdOportunidad().compareTo(oportunidad.getIdOportunidad());
    }

    public Long getIdOportunidad() {
        return idOportunidad;
    }
    public void setIdOportunidad(Long idOportunidad) {
        this.idOportunidad = idOportunidad;
    }
    public Long getIdTipoOportunidad() {
        return idTipoOportunidad;
    }
    public void setIdTipoOportunidad(Long idTipoOportunidad) {
        this.idTipoOportunidad = idTipoOportunidad;
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

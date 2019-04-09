package com.imagosur.domain;

public class MovimientoFortalezaP {
    private Integer idFortaleza;
    private Integer idTipoFortaleza;
    private String descripcion;
    private boolean encendidoAutoevaluacion;
    private boolean encendidoConjunto;

    public Integer getIdFortaleza() {
        return idFortaleza;
    }
    public void setIdFortaleza(Integer idFortaleza) {
        this.idFortaleza = idFortaleza;
    }
    public Integer getIdTipoFortaleza() {
        return idTipoFortaleza;
    }
    public void setIdTipoFortaleza(Integer idTipoFortaleza) {
        this.idTipoFortaleza = idTipoFortaleza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isEncendidoAutoevaluacion() {
        return encendidoAutoevaluacion;
    }
    public void setEncendidoAutoevaluacion(boolean encendidoAutoevaluacion) {
        this.encendidoAutoevaluacion = encendidoAutoevaluacion;
    }
    public boolean isEncendidoConjunto() {
        return encendidoConjunto;
    }
    public void setEncendidoConjunto(boolean encendidoConjunto) {
        this.encendidoConjunto = encendidoConjunto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idFortaleza == null) ? 0 : idFortaleza.hashCode());
        result = prime * result + ((idTipoFortaleza == null) ? 0 : idTipoFortaleza.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MovimientoFortalezaP other = (MovimientoFortalezaP) obj;
        if (idFortaleza == null) {
            if (other.idFortaleza != null)
                return false;
        } else if (!idFortaleza.equals(other.idFortaleza))
            return false;
        if (idTipoFortaleza == null) {
            if (other.idTipoFortaleza != null)
                return false;
        } else if (!idTipoFortaleza.equals(other.idTipoFortaleza))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "idFortaleza=" + idFortaleza + ", idTipoFortaleza=" + idTipoFortaleza;
    }

}

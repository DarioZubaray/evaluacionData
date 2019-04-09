package com.imagosur.domain;

public class MovimientoOportunidadP {
    private Integer idOportunidad;
    private Integer idTipoOportunidad;
    private String descripcion;
    private boolean encendidoAutoevaluacion;
    private boolean encendidoConjunto;

    public Integer getIdOportunidad() {
        return idOportunidad;
    }
    public void setIdOportunidad(Integer idOportunidad) {
        this.idOportunidad = idOportunidad;
    }
    public Integer getIdTipoOportunidad() {
        return idTipoOportunidad;
    }
    public void setIdTipoOportunidad(Integer idTipoOportunidad) {
        this.idTipoOportunidad = idTipoOportunidad;
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
        result = prime * result + ((idOportunidad == null) ? 0 : idOportunidad.hashCode());
        result = prime * result + ((idTipoOportunidad == null) ? 0 : idTipoOportunidad.hashCode());
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
        MovimientoOportunidadP other = (MovimientoOportunidadP) obj;
        if (idOportunidad == null) {
            if (other.idOportunidad != null)
                return false;
        } else if (!idOportunidad.equals(other.idOportunidad))
            return false;
        if (idTipoOportunidad == null) {
            if (other.idTipoOportunidad != null)
                return false;
        } else if (!idTipoOportunidad.equals(other.idTipoOportunidad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "idOportunidad=" + idOportunidad + ", idTipoOportunidad=" + idTipoOportunidad;
    }
}

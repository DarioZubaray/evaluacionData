package com.imagosur.domain.composite;

import java.io.Serializable;

public class EvaluacionPdfCompositeId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idEvaluacion;
    private Integer idLegajoEvaluado;

    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public Integer getIdLegajoEvaluado() {
        return idLegajoEvaluado;
    }

    public void setIdLegajoEvaluado(Integer idLegajoEvaluado) {
        this.idLegajoEvaluado = idLegajoEvaluado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEvaluacion == null) ? 0 : idEvaluacion.hashCode());
        result = prime * result + ((idLegajoEvaluado == null) ? 0 : idLegajoEvaluado.hashCode());
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
        EvaluacionPdfCompositeId other = (EvaluacionPdfCompositeId) obj;
        if (idEvaluacion == null) {
            if (other.idEvaluacion != null)
                return false;
        } else if (!idEvaluacion.equals(other.idEvaluacion))
            return false;
        if (idLegajoEvaluado == null) {
            if (other.idLegajoEvaluado != null)
                return false;
        } else if (!idLegajoEvaluado.equals(other.idLegajoEvaluado))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "EvaluacionPdfCompositeId [idEvaluacion=" + idEvaluacion + ", idLegajoEvaluado=" + idLegajoEvaluado
                + "]";
    }
}

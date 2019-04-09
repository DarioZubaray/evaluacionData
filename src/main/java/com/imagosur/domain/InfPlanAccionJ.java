package com.imagosur.domain;

public class InfPlanAccionJ {
    private Long idCompetencia;
    private String descripcion;
    private String planAccion;

    public Long getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Long idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlanAccion() {
        return planAccion;
    }

    public void setPlanAccion(String planAccion) {
        this.planAccion = planAccion;
    }

    @Override
    public String toString() {
        return "InfPlanAccionJ [idCompetencia=" + idCompetencia + ", descripcion=" + descripcion + ", planAccion="
                + planAccion + "]";
    }
}
package com.imagosur.domain;

public class PlanAccionJ {
    private Long idmovimientosPlanesAccion;
    private Long idCompetencia;
    private String descripcionCompetencia;
    private String planAccion;

    public Long getIdmovimientosPlanesAccion() {
        return idmovimientosPlanesAccion;
    }

    public void setIdmovimientosPlanesAccion(Long idmovimientosPlanesAccion) {
        this.idmovimientosPlanesAccion = idmovimientosPlanesAccion;
    }

    public Long getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Long idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getDescripcionCompetencia() {
        return descripcionCompetencia;
    }

    public void setDescripcionCompetencia(String descripcionCompetencia) {
        this.descripcionCompetencia = descripcionCompetencia;
    }

    public String getPlanAccion() {
        return planAccion;
    }

    public void setPlanAccion(String planAccion) {
        this.planAccion = planAccion;
    }

    @Override
    public String toString() {
        return "PlanAccionJ [idmovimientosPlanesAccion=" + idmovimientosPlanesAccion + ", idCompetencia=" + idCompetencia
                + ", descripcionCompetencia=" + descripcionCompetencia + ", planAccion=" + planAccion + "]";
    }

    public String showCompetenciaYPlanAccion(){
        return "planAccionJ [idCompetencia= " + idCompetencia + ", planAccion=" + simplifyCompetencia(planAccion) + "]";
    }

    public String simplifyCompetencia(String competencia){
        if(competencia != null){
            if(competencia.length() > 50){
                String simply = competencia.substring(0, 50).replace("\n", "\t");
                return "\"" + simply + "...\" y " + (competencia.length() - 50) + " caracteres más.";
            }else{
                return competencia;
            }
        }else{
            return null;
        }
    }
}

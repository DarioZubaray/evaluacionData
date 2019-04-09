package com.imagosur.domain;

public class CompetenciaJ {
    private Long idCompetencia;
    private Long idPlantilla;
    private String descripcionCompetencia;
    private String definicion;
    private Long inactivo;
    private String fortalezas;
    private String oportunidades;

    public Long getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Long idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getDescripcionCompetencia() {
        return descripcionCompetencia;
    }

    public void setDescripcionCompetencia(String descripcionCompetencia) {
        this.descripcionCompetencia = descripcionCompetencia;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(String fortalezas) {
        this.fortalezas = fortalezas;
    }

    public String getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(String oportunidades) {
        this.oportunidades = oportunidades;
    }

    @Override
    public String toString() {
        return "CompetenciaJ [idCompetencia=" + idCompetencia + ", descripcionCompetencia=" + descripcionCompetencia + ", definicion=" + definicion
                + ", fortalezas=" + fortalezas + ", oportunidades=" + oportunidades + "]";
    }

    public String fortalezasOportunidadesToString(){
        return "CompetenciaJ [idCompetencia=" + idCompetencia 
                + ", fortalezas=" + simplifyCompetition(fortalezas) 
                + ", oportunidades=" + simplifyCompetition(oportunidades) + "]";
    }

    public String simplifyCompetition(String competencia){
        if(competencia != null){
            if(competencia.length() > 50){
                String simply = competencia.substring(0, 50).replaceAll("\n", "\t");
                return "\"" + simply + "\" y " + (competencia.length() - 50) + " caracteres más.";
            }else{
                return competencia;
            }
        }else{
            return null;
        }
    }

}

package com.imagosur.domain;

public class PlanAccionCompetencia {
    private Long idmovimientosPlanesAccionCompetencias;
    private Long idCompetencia;
    private String actividadAcordada;
    private String periodoDesde;
    private String periodoHasta;
    private String descripcionCompetencia;

    public static PlanAccionCompetencia obtenerIdYDatosRecibidos(PlanAccionCompetencia persistida, PlanAccionCompetencia recibida){
        if(persistida.getIdmovimientosPlanesAccionCompetencias() != null){
            recibida.setIdmovimientosPlanesAccionCompetencias(persistida.getIdmovimientosPlanesAccionCompetencias());
        }
        return recibida;
    }

    public Long getIdmovimientosPlanesAccionCompetencias() {
        return idmovimientosPlanesAccionCompetencias;
    }

    public void setIdmovimientosPlanesAccionCompetencias(Long idmovimientosPlanesAccionCompetencias) {
        this.idmovimientosPlanesAccionCompetencias = idmovimientosPlanesAccionCompetencias;
    }

    public String getDescripcionCompetencia() {
        return descripcionCompetencia;
    }

    public void setDescripcionCompetencia(String descripcionCompetencia) {
        this.descripcionCompetencia = descripcionCompetencia;
    }

    public Long getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Long idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getActividadAcordada() {
        return actividadAcordada;
    }

    public void setActividadAcordada(String actividadAcordada) {
        this.actividadAcordada = actividadAcordada;
    }

    public String getPeriodoDesde() {
        return periodoDesde;
    }

    public void setPeriodoDesde(String periodoDesde) {
        this.periodoDesde = periodoDesde;
    }

    public String getPeriodoHasta() {
        return periodoHasta;
    }

    public void setPeriodoHasta(String periodoHasta) {
        this.periodoHasta = periodoHasta;
    }

    @Override
    public String toString() {
        return "PlanAccionCompetencia [idmovimientosPlanesAccionCompetencias=" + idmovimientosPlanesAccionCompetencias + ", idCompetencia="
                + idCompetencia + ", actividadAcordada=" + actividadAcordada + ", periodoDesde=" + periodoDesde + ", periodoHasta=" + periodoHasta
                + ", descripcionCompetencia=" + descripcionCompetencia + "]";
    }

}

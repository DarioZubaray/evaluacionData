package com.imagosur.domain;

public class PlanAccionTarea {
    private Long idmovimientosPlanesAccionTareas;
    private Long idTarea;
    private String actividadAcordada;
    private String periodoDesde;
    private String periodoHasta;
    private String descripcionTarea;

    public static PlanAccionTarea obtenerIdYDatosRecibidos(PlanAccionTarea persistida, PlanAccionTarea enviada){
        if(persistida.getIdmovimientosPlanesAccionTareas() != null)
            enviada.setIdmovimientosPlanesAccionTareas(persistida.getIdmovimientosPlanesAccionTareas());
        return enviada;
    }

    public Long getIdmovimientosPlanesAccionTareas() {
        return idmovimientosPlanesAccionTareas;
    }

    public void setIdmovimientosPlanesAccionTareas(Long idmovimientosPlanesAccionTareas) {
        this.idmovimientosPlanesAccionTareas = idmovimientosPlanesAccionTareas;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public Long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Long idTarea) {
        this.idTarea = idTarea;
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
        return "PlanAccionTarea [idmovimientosPlanesAccionTareas=" + idmovimientosPlanesAccionTareas + ", idTarea=" + idTarea + ", actividadAcordada="
                + actividadAcordada + ", periodoDesde=" + periodoDesde + ", periodoHasta=" + periodoHasta + ", descripcionTarea=" + descripcionTarea
                + "]";
    }

}

package com.imagosur.domain;

public class ConclusionIndicadorConductual {

    private Long idConclusionIndicadorConductual;
    private Long idPlantilla;
    private Long cantidadItemAprobado;
    private String gradoPotencial;
    private String conclusionFinal;
    private Long inactivo;
    private Long cantidadItemAprobadoDesde;

    public Long getCantidadItemAprobadoDesde() {
        return cantidadItemAprobadoDesde;
    }

    public void setCantidadItemAprobadoDesde(Long cantidadItemAprobadoDesde) {
        this.cantidadItemAprobadoDesde = cantidadItemAprobadoDesde;
    }

    public Long getIdConclusionIndicadorConductual() {
        return idConclusionIndicadorConductual;
    }

    public void setIdConclusionIndicadorConductual(Long idConclusionIndicadorConductual) {
        this.idConclusionIndicadorConductual = idConclusionIndicadorConductual;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getCantidadItemAprobado() {
        return cantidadItemAprobado;
    }

    public void setCantidadItemAprobado(Long cantidadItemAprobado) {
        this.cantidadItemAprobado = cantidadItemAprobado;
    }

    public String getGradoPotencial() {
        return gradoPotencial;
    }

    public void setGradoPotencial(String gradoPotencial) {
        this.gradoPotencial = gradoPotencial;
    }

    public String getConclusionFinal() {
        return conclusionFinal;
    }

    public void setConclusionFinal(String conclusionFinal) {
        this.conclusionFinal = conclusionFinal;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "ConclusionIndicadorConductual [idConclusionIndicadorConductual=" + idConclusionIndicadorConductual
                + ", idPlantilla=" + idPlantilla + ", cantidadItemAprobado=" + cantidadItemAprobado
                + ", gradoPotencial=" + gradoPotencial + ", conclusionFinal=" + conclusionFinal + ", inactivo="
                + inactivo + ", cantidadItemAprobadoDesde=" + cantidadItemAprobadoDesde + "]";
    }
}
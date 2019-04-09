package com.imagosur.domain;

public class IndicadorConductual {
    private Long idIndicadorConductual;
    private String descripcionIndicadorConductual;
    private String valorIndicadorConductual;
    private Long idPlantilla;
    private Long inactivo;

    public Long getIdIndicadorConductual() {
        return idIndicadorConductual;
    }

    public void setIdIndicadorConductual(Long idIndicadorConductual) {
        this.idIndicadorConductual = idIndicadorConductual;
    }

    public String getDescripcionIndicadorConductual() {
        return descripcionIndicadorConductual;
    }

    public void setDescripcionIndicadorConductual(String descripcionIndicadorConductual) {
        this.descripcionIndicadorConductual = descripcionIndicadorConductual;
    }

    public String getValorIndicadorConductual() {
        return valorIndicadorConductual;
    }

    public void setValorIndicadorConductual(String valorIndicadorConductual) {
        this.valorIndicadorConductual = valorIndicadorConductual;
    }

    @Override
    public String toString() {
        return "IndicadorConductual [idIndicadorConductual=" + idIndicadorConductual + ", descripcionIndicadorConductual="
                + descripcionIndicadorConductual + ", valorIndicadorConductual=" + valorIndicadorConductual + "]";
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

}

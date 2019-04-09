package com.imagosur.domain;

public class InfIndicadorConductual {
    private Long idIndicadorConductual;
    private String descripcionIndicadorConductual;
    private String valorIndicadorConductual;

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
        return "InfIndicadorConductual [idIndicadorConductual=" + idIndicadorConductual
                + ", descripcionIndicadorConductual=" + descripcionIndicadorConductual + ", valorIndicadorConductual="
                + valorIndicadorConductual + "]";
    }
}
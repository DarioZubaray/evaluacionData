package com.imagosur.domain;

public class CumplimientoPorRegion {
    private Long idRegion;
    private String descripcionRegion;
    private Long idTienda;
    private String descripcionTienda;
    private Long dotacionTotal;
    private Long licencias;
    private Long evaluacionesTomadas;
    private String porcentajeRealizado;

    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public String getDescripcionRegion() {
        return descripcionRegion;
    }

    public void setDescripcionRegion(String descripcionRegion) {
        this.descripcionRegion = descripcionRegion;
    }

    public Long getDotacionTotal() {
        return dotacionTotal;
    }

    public void setDotacionTotal(Long dotacionTotal) {
        this.dotacionTotal = dotacionTotal;
    }

    public Long getLicencias() {
        return licencias;
    }

    public void setLicencias(Long licencias) {
        this.licencias = licencias;
    }

    public Long getEvaluacionesTomadas() {
        return evaluacionesTomadas;
    }

    public void setEvaluacionesTomadas(Long evaluacionesTomadas) {
        this.evaluacionesTomadas = evaluacionesTomadas;
    }

    public String getPorcentajeRealizado() {
        return porcentajeRealizado;
    }

    public void setPorcentajeRealizado(String porcentajeRealizado) {
        this.porcentajeRealizado = porcentajeRealizado;
    }

    public Long getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Long idTienda) {
        this.idTienda = idTienda;
    }

    public String getDescripcionTienda() {
        return descripcionTienda;
    }

    public void setDescripcionTienda(String descripcionTienda) {
        this.descripcionTienda = descripcionTienda;
    }

    @Override
    public String toString() {
        return "CumplimientoPorRegion [idRegion=" + idRegion + ", descripcionRegion=" + descripcionRegion
                + ", idTienda=" + idTienda + ", descripcionTienda=" + descripcionTienda + ", dotacionTotal="
                + dotacionTotal + ", licencias=" + licencias + ", evaluacionesTomadas=" + evaluacionesTomadas
                + ", porcentajeRealizado=" + porcentajeRealizado + "]";
    }
}
package com.imagosur.domain;

public class Reporte {
    private TipoReporte tipo;
    private Formato formato;
    private TipoConvenio tipoConvenio;
    private Evaluacion evaluacion;
    private RegionTienda region;

    public Reporte() {
        super();
    }

    public Reporte(TipoReporte tipo, Formato formato, TipoConvenio tipoConvenio, Evaluacion evaluacion,
            RegionTienda region) {
        super();
        this.tipo = tipo;
        this.formato = formato;
        this.tipoConvenio = tipoConvenio;
        this.evaluacion = evaluacion;
        this.region = region;
    }

    public TipoReporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoReporte tipo) {
        this.tipo = tipo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public TipoConvenio getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(TipoConvenio tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public RegionTienda getRegion() {
        return region;
    }

    public void setRegion(RegionTienda region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Reporte [tipo=" + tipo + ", formato=" + formato + ", tipoConvenio=" + tipoConvenio + ", evaluacion="
                + evaluacion + ", region=" + region == null ? "Todas" : region + "]";
    }
}
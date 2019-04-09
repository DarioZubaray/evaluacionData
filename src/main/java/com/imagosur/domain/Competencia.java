package com.imagosur.domain;

public class Competencia implements GetterValorEvaluacion {
    private Long idCompetencia;
    private String descripcionCompetencia;
    private Long idComportamientoCompetencia;
    private String descripcionComportamientoCompetencia;
    private String valorAutoEvaluacion;
    private String valorConjunto;
    private Long idPlantilla;
    private Long inactivo;

    public Competencia() {
        super();
    }

    public Competencia(Long idCompetencia) {
        super();
        this.idCompetencia = idCompetencia;
        this.descripcionCompetencia = "-- Seleccione una Competencia --";
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

    public Long getIdComportamientoCompetencia() {
        return idComportamientoCompetencia;
    }

    public void setIdComportamientoCompetencia(Long idComportamientoCompetencia) {
        this.idComportamientoCompetencia = idComportamientoCompetencia;
    }

    public String getDescripcionComportamientoCompetencia() {
        return descripcionComportamientoCompetencia;
    }

    public void setDescripcionComportamientoCompetencia(String descripcionComportamientoCompetencia) {
        this.descripcionComportamientoCompetencia = descripcionComportamientoCompetencia;
    }

    public String getValorAutoEvaluacion() {
        return valorAutoEvaluacion;
    }

    public void setValorAutoEvaluacion(String valorAutoEvaluacion) {
        this.valorAutoEvaluacion = valorAutoEvaluacion;
    }

    public String getValorConjunto() {
        return valorConjunto;
    }

    public void setValorConjunto(String valorConjunto) {
        this.valorConjunto = valorConjunto;
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

    @Override
    public String toString() {
        return "Competencia [idCompentencia=" + idCompetencia + ", descripcionCompetencia=" + descripcionCompetencia
                + ", idComportamientoCompetencia=" + idComportamientoCompetencia + ", descripcionComportamientoCompetencia="
                + descripcionComportamientoCompetencia + ", valorAutoEvaluacion=" + valorAutoEvaluacion + ", valorConjunto=" + valorConjunto + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCompetencia == null) ? 0 : idCompetencia.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Competencia other = (Competencia) obj;
        if (idCompetencia == null) {
            if (other.idCompetencia != null)
                return false;
        } else if (!idCompetencia.equals(other.idCompetencia))
            return false;
        return true;
    }

}
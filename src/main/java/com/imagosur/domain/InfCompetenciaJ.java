package com.imagosur.domain;

public class InfCompetenciaJ {
    private Long id;
    private String fortalezas;
    private String oportunidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "InfCompetenciaJ [id=" + id + ", fortalezas=" + fortalezas + ", oportunidades=" + oportunidades + "]";
    }
}
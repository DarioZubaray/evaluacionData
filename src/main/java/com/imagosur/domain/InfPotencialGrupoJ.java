package com.imagosur.domain;

import java.util.List;

public class InfPotencialGrupoJ {
    private Long id;
    private Long idMovimiento;
    private Float puntaje;
    private String descPuntaje;
    private List<InfPotencialConceptoJ> listaConceptos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Float puntaje) {
        this.puntaje = puntaje;
    }

    public String getDescPuntaje() {
        return descPuntaje;
    }

    public void setDescPuntaje(String descPuntaje) {
        this.descPuntaje = descPuntaje;
    }

    public List<InfPotencialConceptoJ> getListaConceptos() {
        return listaConceptos;
    }

    public void setListaConceptos(List<InfPotencialConceptoJ> listaConceptos) {
        this.listaConceptos = listaConceptos;
    }

    public Long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    @Override
    public String toString() {
        return "InfPotencialGrupoJ [id=" + id + ", idMovimiento=" + idMovimiento + ", puntaje=" + puntaje
                + ", descPuntaje=" + descPuntaje + ", listaConceptos=" + listaConceptos + "]";
    }
}
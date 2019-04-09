package com.imagosur.domain;

import java.util.List;

public class PotencialGrupo {
    private Long idPotencialGrupo;
    private String descripcion;
    private Long idCalificacionPotencial;
    private List<PotencialConcepto> potencialConceptos;

    public Long getIdPotencialGrupo() {
        return idPotencialGrupo;
    }

    public void setIdPotencialGrupo(Long idPotencialGrupo) {
        this.idPotencialGrupo = idPotencialGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdCalificacionPotencial() {
        return idCalificacionPotencial;
    }

    public void setIdCalificacionPotencial(Long idCalificacionPotencial) {
        this.idCalificacionPotencial = idCalificacionPotencial;
    }

    public List<PotencialConcepto> getPotencialConceptos() {
        return potencialConceptos;
    }

    public void setPotencialConceptos(List<PotencialConcepto> potencialConceptos) {
        this.potencialConceptos = potencialConceptos;
    }

    @Override
    public String toString() {
        return "PotencialGrupo [idPotencialGrupo=" + idPotencialGrupo + ", descripcion=" + descripcion + ", idCalificacionPotencial="
                + idCalificacionPotencial + ", potencialConceptos=" + potencialConceptos + "]";
    }

}

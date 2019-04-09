package com.imagosur.domain;

import java.util.List;

public class MovimientoPotencial {
    private Long idCalificacionPromedio;
    private List<PotencialGrupo> listaPotencialGrupo;
    private List<CalificacionPotencial> listaCalificacionPotencial;
    private String comentarios;
    private Puesto puestoPotencial;
    private Sector sectorPotencial;
    private TiempoEvolucion tiempoEvolucion;

    public Long getIdCalificacionPromedio() {
        return idCalificacionPromedio;
    }

    public void setIdCalificacionPromedio(Long idCalificacionPromedio) {
        this.idCalificacionPromedio = idCalificacionPromedio;
    }

    public List<PotencialGrupo> getListaPotencialGrupo() {
        return listaPotencialGrupo;
    }

    public void setListaPotencialGrupo(List<PotencialGrupo> listaPotencialGrupo) {
        this.listaPotencialGrupo = listaPotencialGrupo;
    }

    public List<CalificacionPotencial> getListaCalificacionPotencial() {
        return listaCalificacionPotencial;
    }

    public void setListaCalificacionPotencial(List<CalificacionPotencial> listaCalificacionPotencial) {
        this.listaCalificacionPotencial = listaCalificacionPotencial;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Puesto getPuestoPotencial() {
        return puestoPotencial;
    }

    public void setPuestoPotencial(Puesto puestoPotencial) {
        this.puestoPotencial = puestoPotencial;
    }

    public Sector getSectorPotencial() {
        return sectorPotencial;
    }

    public void setSectorPotencial(Sector sectorPotencial) {
        this.sectorPotencial = sectorPotencial;
    }

    public TiempoEvolucion getTiempoEvolucion() {
        return tiempoEvolucion;
    }

    public void setTiempoEvolucion(TiempoEvolucion tiempoEvolucion) {
        this.tiempoEvolucion = tiempoEvolucion;
    }

    @Override
    public String toString() {
        return "MovimientoPotencial [idCalificacionPromedio=" + idCalificacionPromedio + ", puestoPotencial=" + puestoPotencial + ", sectorPotencial="
                + sectorPotencial + ", tiempoEvolucion=" + tiempoEvolucion + "]";
    }
}

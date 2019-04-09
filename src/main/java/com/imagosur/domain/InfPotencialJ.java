package com.imagosur.domain;

public class InfPotencialJ {
    private String puestoPotencial;
    private String sectorPotencial;
    private String tiempoEvolucion;
    private String comentarios;

    public InfPotencialJ(){
        setPuestoPotencial("");
        setSectorPotencial("");
        setTiempoEvolucion("");
        setComentarios("");
    }

    public String getPuestoPotencial() {
        return puestoPotencial;
    }

    public void setPuestoPotencial(String puestoPotencial) {
        this.puestoPotencial = puestoPotencial;
    }

    public String getSectorPotencial() {
        return sectorPotencial;
    }

    public void setSectorPotencial(String sectorPotencial) {
        this.sectorPotencial = sectorPotencial;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getTiempoEvolucion() {
        return tiempoEvolucion;
    }

    public void setTiempoEvolucion(String tiempoEvolucion) {
        this.tiempoEvolucion = tiempoEvolucion;
    }

    @Override
    public String toString() {
        return "InfPotencialJ [puestoPotencial=" + puestoPotencial + ", sectorPotencial=" + sectorPotencial
                + ", comentarios=" + comentarios + "]";
    }
}
package com.imagosur.domain;

public class InfDeseoEvolucionC {
    private String puesto;
    private String sector;
    private String proyeccion;
    private String comentariosDeseos;
    private String comentariosPlan;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(String proyeccion) {
        this.proyeccion = proyeccion;
    }

    public String getComentariosDeseos() {
        return comentariosDeseos;
    }

    public void setComentariosDeseos(String comentariosDeseos) {
        this.comentariosDeseos = comentariosDeseos;
    }

    public String getComentariosPlan() {
        return comentariosPlan;
    }

    public void setComentariosPlan(String comentariosPlan) {
        this.comentariosPlan = comentariosPlan;
    }

    @Override
    public String toString() {
        return "InfDeseoEvolucionC [puesto=" + puesto + ", sector=" + sector + ", proyeccion=" + proyeccion
                + ", comentariosDeseos=" + comentariosDeseos + ", comentariosPlan=" + comentariosPlan + "]";
    }
}
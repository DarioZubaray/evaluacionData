package com.imagosur.domain;

public class Objetivo {

    private Long idNivel;
    private String descripcion;

    public Objetivo(Long idNivel, String descripcion) {
        super();
        this.idNivel = idNivel;
        this.descripcion = descripcion;
    }
    public Objetivo() {
    	super();    	
    }
    
    public Long getIdNivel() {
        return idNivel;
    }
    public void setIdNivel(Long idNivel) {
        this.idNivel = idNivel;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package com.imagosur.domain;

public class TiempoEvolucion {
    private Long idTiempo;
    private String descripcion;
    private Long inactivo;

    public TiempoEvolucion() {}

    public TiempoEvolucion(Long idTiempo) {
        super();
        this.idTiempo = idTiempo;
        this.descripcion = "No definido";
    }

    public Long getIdTiempo() {
        return idTiempo;
    }

    public void setIdTiempo(Long idTiempo) {
        this.idTiempo = idTiempo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String decripcion) {
        this.descripcion = decripcion;
    }

    public Long getInactivo() {
        return inactivo;
    }
    
    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "TiempoEvolucion [idTiempo=" + idTiempo 
                + ", descripcion=" + descripcion 
                + ", inactivo=" + inactivo +"]";
    }
}

package com.imagosur.domain;

public class DeseoEvolucionProyeccion {

    private Long idDeseosEvolucionProyeccion;
    private Integer idPlantilla;
    private Integer orden;
    private String descripcionDeseosEvolucion;
    private Integer inactivo;

    public Long getIdDeseosEvolucionProyeccion() {
        return idDeseosEvolucionProyeccion;
    }
    public void setIdDeseosEvolucionProyeccion(Long idDeseosEvolucionProyeccion) {
        this.idDeseosEvolucionProyeccion = idDeseosEvolucionProyeccion;
    }
    public Integer getIdPlantilla() {
        return idPlantilla;
    }
    public void setIdPlantilla(Integer idPlantilla) {
        this.idPlantilla = idPlantilla;
    }
    public Integer getOrden() {
        return orden;
    }
    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    public String getDescripcionDeseosEvolucion() {
        return descripcionDeseosEvolucion;
    }
    public void setDescripcionDeseosEvolucion(String descripcionDeseosEvolucion) {
        this.descripcionDeseosEvolucion = descripcionDeseosEvolucion;
    }
    public Integer getInactivo() {
        return inactivo;
    }
    public void setInactivo(Integer inactivo) {
        this.inactivo = inactivo;
    }

}

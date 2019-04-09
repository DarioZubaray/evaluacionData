package com.imagosur.domain;

public class DeseoEvolucion {
    private Long idDeseoEvolucion;
    private Long idPlantilla;
    private String descripcionDeseoEvolucion;
    private String valorDeseoEvolucion;
    // Deseo de evolucion
    private Puesto puestoActual;
    private Sector sectorActual;
    private Puesto puestoDeseado;
    private Sector sectorDeseado;
    private Long idDeseoEvolucionProyeccion;
    private String descripcionDeseoEvolucionProyeccion;
    private String comentariosDeseos;
    private String comentariosPlan;
    private String comentariosEvaluacion;
    private Long inactivo;

    public String getValorDeseoEvolucion() {
        return valorDeseoEvolucion;
    }

    public void setValorDeseoEvolucion(String valorDeseoEvolucion) {
        this.valorDeseoEvolucion = valorDeseoEvolucion;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Long getIdDeseoEvolucion() {
        return idDeseoEvolucion;
    }

    public void setIdDeseoEvolucion(Long idDeseoEvolucion) {
        this.idDeseoEvolucion = idDeseoEvolucion;
    }

    public String getDescripcionDeseoEvolucion() {
        return descripcionDeseoEvolucion;
    }

    public void setDescripcionDeseoEvolucion(String descripcionDeseoEvolucion) {
        this.descripcionDeseoEvolucion = descripcionDeseoEvolucion;
    }

    public Puesto getPuestoActual() {
        return puestoActual;
    }

    public void setPuestoActual(Puesto puestoActual) {
        this.puestoActual = puestoActual;
    }

    public Sector getSectorActual() {
        return sectorActual;
    }

    public void setSectorActual(Sector sectorActual) {
        this.sectorActual = sectorActual;
    }

    public Puesto getPuestoDeseado() {
        return puestoDeseado;
    }

    public void setPuestoDeseado(Puesto puestoDeseado) {
        this.puestoDeseado = puestoDeseado;
    }

    public Sector getSectorDeseado() {
        return sectorDeseado;
    }

    public void setSectorDeseado(Sector sectorDeseado) {
        this.sectorDeseado = sectorDeseado;
    }

    public Long getIdDeseoEvolucionProyeccion() {
        return idDeseoEvolucionProyeccion;
    }

    public void setIdDeseoEvolucionProyeccion(Long idDeseoEvolucionProyeccion) {
        this.idDeseoEvolucionProyeccion = idDeseoEvolucionProyeccion;
    }

    public String getDescripcionDeseoEvolucionProyeccion() {
        return descripcionDeseoEvolucionProyeccion;
    }

    public void setDescripcionDeseoEvolucionProyeccion(String descripcionDeseoEvolucionProyeccion) {
        this.descripcionDeseoEvolucionProyeccion = descripcionDeseoEvolucionProyeccion;
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

    public String getComentariosEvaluacion() {
        return comentariosEvaluacion;
    }

    public void setComentariosEvaluacion(String comentariosEvaluacion) {
        this.comentariosEvaluacion = comentariosEvaluacion;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "DeseoEvolucion [idDeseoEvolucion=" + idDeseoEvolucion + ", descripcionDeseoEvolucion=" + descripcionDeseoEvolucion
                + ", valorDeseoEvolucion=" + valorDeseoEvolucion + ", puestoActual=" + puestoActual + ", sectorActual=" + sectorActual
                + ", puestoDeseado=" + puestoDeseado + ", sectorDeseado=" + sectorDeseado + "]";
    }
}

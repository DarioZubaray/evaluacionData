package com.imagosur.domain;

public class MovimientosDeseosEvolucionP{
    private Long idMovimientosDeseosEvolucion;
    private Integer idEvaluacion;
    private Integer idLegajoEvaluado;
    private Integer idPuestoDeseado;
    private String descripcionPuestoDeseado;
    private Integer idSectorDeseado;
    private String descripcionSectorDeseado;
    private Long idDeseoEvolucionProyeccion;
    private String descripcionProyeccion;
    private String comentariosDeseos;
    private String comentariosPlan;
    private String comentariosEvaluacion;

    public MovimientosDeseosEvolucionP() {
        super();
    }

    public MovimientosDeseosEvolucionP(Integer idEvaluacion, Integer idLegajoEvaluado, Integer idPuestoActual, Integer idSectorActual) {
        this.idEvaluacion = idEvaluacion;
        this.idLegajoEvaluado = idLegajoEvaluado;
        this.idPuestoDeseado = idPuestoActual;
        this.idSectorDeseado = idSectorActual;
        this.idDeseoEvolucionProyeccion = 1L;
        this.comentariosDeseos = "";
        this.comentariosPlan = "";
        this.comentariosEvaluacion = "";
    }

    public void updateMovimiento(MovimientosDeseosEvolucionP update) {
        this.idPuestoDeseado = update.getIdPuestoDeseado();
        this.idSectorDeseado = update.getIdSectorDeseado();
        this.idDeseoEvolucionProyeccion = update.getIdDeseoEvolucionProyeccion();
        this.comentariosDeseos = update.getComentariosDeseos();
        this.comentariosPlan = update.getComentariosPlan();
        this.comentariosEvaluacion = update.getComentariosEvaluacion();
    }

    public Long getIdMovimientosDeseosEvolucion() {
        return idMovimientosDeseosEvolucion;
    }
    public void setIdMovimientosDeseosEvolucion(Long idMovimientosDeseosEvolucion) {
        this.idMovimientosDeseosEvolucion = idMovimientosDeseosEvolucion;
    }
    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }
    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }
    public Integer getIdLegajoEvaluado() {
        return idLegajoEvaluado;
    }
    public void setIdLegajoEvaluado(Integer idLegajoEvaluado) {
        this.idLegajoEvaluado = idLegajoEvaluado;
    }
    public Integer getIdPuestoDeseado() {
        return idPuestoDeseado;
    }
    public void setIdPuestoDeseado(Integer idPuestoDeseado) {
        this.idPuestoDeseado = idPuestoDeseado;
    }
    public Integer getIdSectorDeseado() {
        return idSectorDeseado;
    }
    public void setIdSectorDeseado(Integer idSectorDeseado) {
        this.idSectorDeseado = idSectorDeseado;
    }
    public Long getIdDeseoEvolucionProyeccion() {
        return idDeseoEvolucionProyeccion;
    }
    public void setIdDeseoEvolucionProyeccion(Long idDeseoEvolucionProyeccion) {
        this.idDeseoEvolucionProyeccion = idDeseoEvolucionProyeccion;
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

    public String getDescripcionPuestoDeseado() {
        return descripcionPuestoDeseado;
    }

    public void setDescripcionPuestoDeseado(String descripcionPuestoDeseado) {
        this.descripcionPuestoDeseado = descripcionPuestoDeseado;
    }

    public String getDescripcionSectorDeseado() {
        return descripcionSectorDeseado;
    }

    public void setDescripcionSectorDeseado(String descripcionSectorDeseado) {
        this.descripcionSectorDeseado = descripcionSectorDeseado;
    }

    public String getDescripcionProyeccion() {
        return descripcionProyeccion;
    }

    public void setDescripcionProyeccion(String descripcionProyeccion) {
        this.descripcionProyeccion = descripcionProyeccion;
    }
}

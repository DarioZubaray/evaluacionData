package com.imagosur.domain;

import java.util.Date;

public class MovimientoEvaluaciones {

    private Long idMovimientosEvaluaciones;
    private Integer idEvaluacion;
    private Integer idLegajoEvaluado;
    private Integer idLegajoEvaluador;
    private Date fechaPrimeraEdicion;
    private Date fechaUltimaEdicion;
    private Integer idPuestoEspectativaEvaluador;
    private Integer idSectorEspectativaEvaluador;
    private String comentarioEvaluado;
    private String comentarioEvaluador;
    private Integer idEstadoEvaluado;
    private Integer idEstadoEvaluador;

    public Long getIdMovimientosEvaluaciones() {
        return idMovimientosEvaluaciones;
    }

    public void setIdMovimientosEvaluaciones(Long idMovimientosEvaluaciones) {
        this.idMovimientosEvaluaciones = idMovimientosEvaluaciones;
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

    public Integer getIdLegajoEvaluador() {
        return idLegajoEvaluador;
    }

    public void setIdLegajoEvaluador(Integer idLegajoEvaluador) {
        this.idLegajoEvaluador = idLegajoEvaluador;
    }

    public Date getFechaPrimeraEdicion() {
        return fechaPrimeraEdicion;
    }

    public void setFechaPrimeraEdicion(Date fechaPrimeraEdicion) {
        this.fechaPrimeraEdicion = fechaPrimeraEdicion;
    }

    public Date getFechaUltimaEdicion() {
        return fechaUltimaEdicion;
    }

    public void setFechaUltimaEdicion(Date fechaUltimaEdicion) {
        this.fechaUltimaEdicion = fechaUltimaEdicion;
    }

    public Integer getIdPuestoEspectativaEvaluador() {
        return idPuestoEspectativaEvaluador;
    }

    public void setIdPuestoEspectativaEvaluador(Integer idPuestoEspectativaEvaluador) {
        this.idPuestoEspectativaEvaluador = idPuestoEspectativaEvaluador;
    }

    public Integer getIdSectorEspectativaEvaluador() {
        return idSectorEspectativaEvaluador;
    }

    public void setIdSectorEspectativaEvaluador(Integer idSectorEspectativaEvaluador) {
        this.idSectorEspectativaEvaluador = idSectorEspectativaEvaluador;
    }

    public String getComentarioEvaluado() {
        return comentarioEvaluado;
    }

    public void setComentarioEvaluado(String comentarioEvaluado) {
        this.comentarioEvaluado = comentarioEvaluado;
    }

    public String getComentarioEvaluador() {
        return comentarioEvaluador;
    }

    public void setComentarioEvaluador(String comentarioEvaluador) {
        this.comentarioEvaluador = comentarioEvaluador;
    }

    public Integer getIdEstadoEvaluado() {
        return idEstadoEvaluado;
    }

    public void setIdEstadoEvaluado(Integer idEstadoEvaluado) {
        this.idEstadoEvaluado = idEstadoEvaluado;
    }

    public Integer getIdEstadoEvaluador() {
        return idEstadoEvaluador;
    }

    public void setIdEstadoEvaluador(Integer idEstadoEvaluador) {
        this.idEstadoEvaluador = idEstadoEvaluador;
    }

    @Override
    public String toString() {
        return "MovimientoEvaluaciones [idMovimientosEvaluaciones=" + idMovimientosEvaluaciones + ", idEvaluacion=" + idEvaluacion
                + ", idLegajoEvaluado=" + idLegajoEvaluado + ", idLegajoEvaluador=" + idLegajoEvaluador + "]";
    }
}

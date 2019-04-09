package com.imagosur.domain;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ExportacionConsolidado {
    private Integer idExportacionConsolidado;
    private Integer idEvaluacion;
    private Integer idRegionTienda;
    private Boolean formato;
    private Date fecha;
    @Temporal(TemporalType.TIME)
    private Date hora;
    private Integer idEstadoExportacionConsolidado;
    private String nombreArchivo;

    public Integer getIdExportacionConsolidado() {
        return idExportacionConsolidado;
    }
    public void setIdExportacionConsolidado(Integer idExportacionConsolidado) {
        this.idExportacionConsolidado = idExportacionConsolidado;
    }
    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }
    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }
    public Integer getIdRegionTienda() {
        return idRegionTienda;
    }
    public void setIdRegionTienda(Integer idRegionTienda) {
        this.idRegionTienda = idRegionTienda;
    }
    public Boolean getFormato() {
        return formato;
    }
    public void setFormato(Boolean formato) {
        this.formato = formato;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public Integer getIdEstadoExportacionConsolidado() {
        return idEstadoExportacionConsolidado;
    }
    public void setIdEstadoExportacionConsolidado(Integer idEstadoExportacionConsolidado) {
        this.idEstadoExportacionConsolidado = idEstadoExportacionConsolidado;
    }
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    @Override
    public String toString() {
        return "EC [id=" + idExportacionConsolidado 
                + ", idEvaluacion=" + idEvaluacion 
                + "; idRegionTienda=" + idRegionTienda 
                + ", formato=" + formato 
                + ", fecha=" + fecha
                + ", hora=" + hora 
                + ", idEstado=" + idEstadoExportacionConsolidado 
                + ", nombreArchivo=" + nombreArchivo + "]";
    }
}

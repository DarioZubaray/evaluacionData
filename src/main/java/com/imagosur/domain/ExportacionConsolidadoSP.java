package com.imagosur.domain;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ExportacionConsolidadoSP {
    public static final String USP_EXPORTACION_CONSOLIDADO = "exec uspGetExportacionConsolidado ?,?";
    public static final String USP_COUNT_EXPORTACION_CONSOLIDADO = "exec uspCountExportacionConsolidado";
    private String idExportacionConsolidado;
    private String descripcionEvaluacion;
    private String descripcionRegionTienda;
    private String formatoDetalle;
    private Date fecha;
    @Temporal(TemporalType.TIME)
    private Date hora;
    private String descripcionEstado;
    private String nombreArchivo;

    public String getIdExportacionConsolidado(){
        return this.idExportacionConsolidado;
    }
    public void setIdExportacionConsolidado(String idExportacionConsolidado){
        this.idExportacionConsolidado = idExportacionConsolidado;
    }
    public String getDescripcionEvaluacion() {
        return descripcionEvaluacion;
    }
    public void setDescripcionEvaluacion(String descripcionEvaluacion) {
        this.descripcionEvaluacion = descripcionEvaluacion;
    }
    public String getDescripcionRegionTienda() {
        return descripcionRegionTienda;
    }
    public void setDescripcionRegionTienda(String descripcionRegionTienda) {
        this.descripcionRegionTienda = descripcionRegionTienda;
    }
    public String getFormatoDetalle() {
        return formatoDetalle;
    }
    public void setFormatoDetalle(String formatoDetalle) {
        this.formatoDetalle = formatoDetalle;
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
    public String getDescripcionEstado() {
        return descripcionEstado;
    }
    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    @Override
    public String toString() {
        return "ECSP [ idExportacion="+ idExportacionConsolidado 
                +", descripcion=" + descripcionEvaluacion 
                +", descripcionRegionTienda=" + descripcionRegionTienda
                + ", formato=" + formatoDetalle 
                + ", fecha=" + fecha 
                + ", hora=" + hora
                + ", estado=" + descripcionEstado 
                + ", nombreArchivo=" + nombreArchivo + "]";
    }
}

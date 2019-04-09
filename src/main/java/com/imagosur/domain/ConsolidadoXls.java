package com.imagosur.domain;

import org.apache.poi.ss.usermodel.Row;

public class ConsolidadoXls {
    private Row fila;
    private Integer celda;
    private MovimientoEvaluacion movimientoEvaluacion;

    public void incrementarCelda() {
        this.celda += 1;
    }

    public Row getFila() {
        return fila;
    }
    public void setFila(Row fila) {
        this.fila = fila;
    }
    public Integer getCelda() {
        return celda;
    }
    public void setCelda(Integer c) {
        this.celda = c;
    }
    public MovimientoEvaluacion getMovimientoEvaluacion() {
        return movimientoEvaluacion;
    }
    public void setMovimientoEvaluacion(MovimientoEvaluacion movimientoEvaluacion) {
        this.movimientoEvaluacion = movimientoEvaluacion;
    }
}

package com.imagosur.domain;

import java.util.List;

public class OportunidadGrupo {

    private String comentarioAuto;
    private String comentarioConjunto;
    private List<MovimientoOportunidadP> movimientoOportunidad;

    public String getComentarioAuto() {
        return comentarioAuto;
    }
    public void setComentarioAuto(String comentarioAuto) {
        this.comentarioAuto = comentarioAuto;
    }
    public String getComentarioConjunto() {
        return comentarioConjunto;
    }
    public void setComentarioConjunto(String comentarioConjunto) {
        this.comentarioConjunto = comentarioConjunto;
    }
    public List<MovimientoOportunidadP> getMovimientoOportunidad() {
        return movimientoOportunidad;
    }
    public void setMovimientoOportunidad(List<MovimientoOportunidadP> movimientoOportunidad) {
        this.movimientoOportunidad = movimientoOportunidad;
    }
}

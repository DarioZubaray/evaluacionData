package com.imagosur.domain;

import java.util.List;

public class FortalezaGrupo {

    private String comentarioAuto;
    private String comentarioConjunto;
    private List<MovimientoFortalezaP>  movimientoFortaleza;

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

    public List<MovimientoFortalezaP> getMovimientoFortaleza() {
        return movimientoFortaleza;
    }

    public void setMovimientoFortaleza(List<MovimientoFortalezaP> movimientoFortaleza) {
        this.movimientoFortaleza = movimientoFortaleza;
    }
}

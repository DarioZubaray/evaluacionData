package com.imagosur.domain;

public class ConceptoCalificacion {
    private String descripcionConcepto;
    private String valor;

    public String getDescripcionConcepto() {
        return descripcionConcepto;
    }

    public void setDescripcionConcepto(String descripcionConcepto) {
        this.descripcionConcepto = descripcionConcepto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ConceptoCalificacion [descripcionConcepto=" + descripcionConcepto + ", valor="
                + valor + "]";
    }
}

package com.imagosur.domain;

public class Parametro {

    public static String VIS_CAMP = "VIS_CAMP";
    public static String MAX_VENC = "MAX_VENC";
    public static String VIS_CAMP_SEDE = "VIS_CAMP_SEDE";

    private Integer id;
    private String codigo;
    private String descripcion;
    private String valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Parametro [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", valor=" + valor + "]";
    }

}

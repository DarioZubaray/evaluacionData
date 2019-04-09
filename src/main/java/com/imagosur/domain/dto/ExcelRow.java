package com.imagosur.domain.dto;

/**
 * 
 * @author Gabriel
 *
 *         Usado para representar las filas leidas del archivo excel usado para la carga de
 *         campañas. Se sobreescribe el metodo equals() para determinar si se han leido filas
 *         duplicadas
 * 
 */

public class ExcelRow {
    // Estado legajo Apellido Nombre Documento Convenio Categoria Tienda CeCoste

    private String estado;
    private String legajo;
    private String apellido;
    private String nombre;
    private String genero;
    private String documento;
    private String convenio;
    private String categoria;
    private String idTienda;
    private String ceCoste;


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getCeCoste() {
        return ceCoste;
    }

    public void setCeCoste(String ceCoste) {
        this.ceCoste = ceCoste;
    }

}

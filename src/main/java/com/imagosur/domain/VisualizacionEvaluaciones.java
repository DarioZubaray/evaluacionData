package com.imagosur.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisualizacionEvaluaciones {
    private Integer id;
    private Date fecha;
    private String descripcion;
    private Date vencimiento;
    private Integer legajo;
    private String nombre;
    private String tipo;
    private String estado;
    private Integer evaluador;
    private String imprimirEvaluacion;
    private Integer idlegajo;
    private Integer idEvaluacion;
    private Integer idMovimientosEvaluaciones;

    public static List<VisualizacionEvaluaciones> queryToListVisualizaciones(List<Object> listaQuery) throws ParseException {
        List<VisualizacionEvaluaciones> listaRetorno = new ArrayList<VisualizacionEvaluaciones>();
        VisualizacionEvaluaciones ve;
        Integer id = 0;
        for (Object o : listaQuery) {
            Object[] obj = (Object[]) o;

            ve = new VisualizacionEvaluaciones();
            ve.setId(id);
            ve.setFecha(string2Date(obj[1].toString()));
            ve.setDescripcion(obj[2].toString());
            ve.setVencimiento(string2Date(obj[3].toString()));
            ve.setLegajo(Integer.parseInt(obj[4].toString()));
            ve.setNombre(obj[5].toString());
            ve.setTipo(obj[6].toString());
            ve.setEstado(obj[7].toString());
            ve.setEvaluador((Integer) obj[8]);
            ve.setImprimirEvaluacion(obj[9].toString());
            ve.setIdLegajo(Integer.parseInt(obj[10].toString()));
            ve.setIdEvaluacion(Integer.parseInt(obj[11].toString()));
            ve.setIdMovimientosEvaluaciones(Integer.parseInt(obj[12].toString()));

            listaRetorno.add(ve);
            id++;
        }
        return listaRetorno;
    }

    private static Date string2Date(String source) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        return sdf.parse(source);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer obj) {
        this.id = obj;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Integer evaluador) {
        this.evaluador = evaluador;
    }

    public String getImprimirEvaluacion() {
        return imprimirEvaluacion;
    }

    public void setImprimirEvaluacion(String imprimirEvaluacion) {
        this.imprimirEvaluacion = imprimirEvaluacion;
    }

    @Override
    public String toString() {
        return "VisualizacionEvaluaciones [fecha=" + fecha + ", descripcion=" + descripcion + ", vencimiento="
                + vencimiento + ", legajo=" + legajo + ", nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado
                + ", evaluador=" + evaluador + ", imprimirEvaluacion=" + imprimirEvaluacion + "]";
    }

    public Integer getIdLegajo() {
        return idlegajo;
    }

    public void setIdLegajo(Integer idMovEvaluacion) {
        this.idlegajo = idMovEvaluacion;
    }

    public Integer getIdlegajo() {
        return idlegajo;
    }

    public void setIdlegajo(Integer idlegajo) {
        this.idlegajo = idlegajo;
    }

    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public Integer getIdMovimientosEvaluaciones() {
        return idMovimientosEvaluaciones;
    }

    public void setIdMovimientosEvaluaciones(Integer idMovimientosEvaluaciones) {
        this.idMovimientosEvaluaciones = idMovimientosEvaluaciones;
    }
}
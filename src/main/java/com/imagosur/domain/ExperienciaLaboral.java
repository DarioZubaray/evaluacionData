package com.imagosur.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExperienciaLaboral {
    public Long idExperienciaLaboral;
    public Puesto puesto; // XXX consultar: este puesto es de la base o se podra tipear?
    public Sector sector; // XXX idem anterior
    public String compania;
    public String fechaInicio;
    public Date fechaInicioDate;
    public String fechaFin;
    public Date fechaFinDate;
    public String responsabilidades;

    public Long getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public void setIdExperienciaLaboral(Long idExperienciaLaboral) {
        this.idExperienciaLaboral = idExperienciaLaboral;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public Date getFechaInicioDate() {
        return fechaInicioDate;
    }

    public void setFechaInicioDate(Date fechaInicioDate) {
        this.fechaInicioDate = fechaInicioDate;
    }

    public Date getFechaFinDate() {
        return fechaFinDate;
    }

    public void setFechaFinDate(Date fechaFinDate) {
        this.fechaFinDate = fechaFinDate;
    }

    @Override
    public String toString() {
        return "ExperienciaLaboral ["
                + "idExperienciaLaboral=" + idExperienciaLaboral 
                + ", puesto=" + puesto.getIdPuesto() 
                + ", sector=" + sector.getIdSector() 
                + ", compania=" + compania 
                + ", fechaInicio=" + fechaInicio 
                + ", fechaFin=" + fechaFin 
                + ", responsabilidades=" + responsabilidades
                + "]";
    }

    public void setDates() throws ParseException{
        Date fecha1 = new SimpleDateFormat("dd/MM/yyy").parse(this.getFechaInicio());
        this.setFechaInicioDate(fecha1);
        Date fecha2 = new SimpleDateFormat("dd/MM/yyy").parse(this.getFechaFin());
        this.setFechaInicioDate(fecha2);
    }
}

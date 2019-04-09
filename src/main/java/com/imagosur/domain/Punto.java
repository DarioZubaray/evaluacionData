package com.imagosur.domain;

public class Punto {

    private Long id;
    private String descripcion;
    private Usuario usuario;
    private String usuarios;
    private String fechaImpresionFicha;

    private String fechaImpresionCampana;

    public String getFechaImpresionFicha() {
        return fechaImpresionFicha;
    }

    public void setFechaImpresionFicha(String fechaImpresionFicha) {
        this.fechaImpresionFicha = fechaImpresionFicha;
    }

    public String getFechaImpresionCampana() {
        return fechaImpresionCampana;
    }

    public void setFechaImpresionCampana(String fechaImpresionCampana) {
        this.fechaImpresionCampana = fechaImpresionCampana;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public boolean equals(Object obj) {
        Punto p = (Punto) obj;
        if (id.equals(p.getId())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Punto [id=" + id + ", descripcion=" + descripcion + ", usuario=" + usuario + ", usuarios=" + usuarios + ", fechaImpresionFicha="
                + fechaImpresionFicha + ", fechaImpresionCampana=" + fechaImpresionCampana + "]";
    }
}

package com.imagosur.domain;

public class InfPolitica {
    private Long id;
    private Integer puntaje;
    private String descPuntaje;
    private String actual;
    private String objetivos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescPuntaje() {
        return descPuntaje;
    }

    public void setDescPuntaje(String descPuntaje) {
        this.descPuntaje = descPuntaje;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    @Override
    public String toString() {
        return "InfPolitica [id=" + id + ", puntaje=" + puntaje + ", descPuntaje=" + descPuntaje + ", actual=" + actual
                + ", objetivos=" + objetivos + "]";
    }
}
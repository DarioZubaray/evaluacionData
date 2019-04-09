package com.imagosur.domain;

public class LegajoIdioma {

    private Long idLegajoIdioma;
    private Legajo legajo;
    private Idioma idioma;
    private IdiomaNivel nivelIdioma;

    public Long getIdLegajoIdioma() {
        return idLegajoIdioma;
    }

    public void setIdLegajoIdioma(Long idLegajoIdioma) {
        this.idLegajoIdioma = idLegajoIdioma;
    }

    public Legajo getLegajo() {
        return legajo;
    }

    public void setLegajo(Legajo legajo) {
        this.legajo = legajo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public IdiomaNivel getNivelIdioma() {
        return nivelIdioma;
    }

    public void setNivelIdioma(IdiomaNivel nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idioma == null) ? 0 : idioma.hashCode());
        result = prime * result + ((legajo == null) ? 0 : legajo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LegajoIdioma other = (LegajoIdioma) obj;
        if (idioma == null) {
            if (other.idioma != null)
                return false;
        } else if (!idioma.equals(other.idioma))
            return false;
        if (legajo == null) {
            if (other.legajo != null)
                return false;
        } else if (!legajo.equals(other.legajo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "LegajoIdioma [idLegajoIdioma=" + idLegajoIdioma + ", legajo=" + legajo + ", idioma=" + idioma + ", nivelIdioma=" + nivelIdioma + "]";
    }
}

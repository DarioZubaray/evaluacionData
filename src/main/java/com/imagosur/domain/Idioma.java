package com.imagosur.domain;

public class Idioma {

    private Integer idIdioma;
    private String descripcion;

    public Integer getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idIdioma == null) ? 0 : idIdioma.hashCode());
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
        Idioma other = (Idioma) obj;
        if (idIdioma == null) {
            if (other.idIdioma != null)
                return false;
        } else if (!idIdioma.equals(other.idIdioma))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Idioma [idIdioma=" + idIdioma + ", descripcion=" + descripcion + "]";
    }
}

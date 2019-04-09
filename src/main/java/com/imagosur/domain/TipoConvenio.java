package com.imagosur.domain;

public enum TipoConvenio {

    EN_CONVENIO("En convenio", 0),
    JERARQUICO("Jerárquico", 1),
    BSF("BSF", 2),
    IMAGO("Imago", 5),
    CORPORATIVA("Corporativa", 6);

    private Long id;
    private String descripcion;

    TipoConvenio(String desc, int id) {
        this.descripcion = desc;
        this.id = Long.valueOf(id);
    }

    public String toString() {
        return this.descripcion;
    }

    public Long getId() {
        return this.id;
    }

    public static TipoConvenio getTipoConvenio(String desc) {
        for (TipoConvenio t : TipoConvenio.values()) {
            if (t.descripcion.toLowerCase().contains(desc.toLowerCase()))
                return t;
        }
        return null;
    }

    public static TipoConvenio getById(Long id) {
        for (TipoConvenio t : TipoConvenio.values()) {
            if (t.getId().equals(id))
                return t;
        }
        return null;
    }
}

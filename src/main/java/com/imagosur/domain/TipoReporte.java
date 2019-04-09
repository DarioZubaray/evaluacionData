package com.imagosur.domain;

public enum TipoReporte {
    CONSOLIDADO(0L, "Consolidado"), MATRIZ(1L, "Matriz");

    private final Long id;
    private final String descripcion;

    TipoReporte(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return this.id;
    }

    public String toString() {
        return this.descripcion;
    }

    public static TipoReporte getById(Long id) {
        for (TipoReporte r : TipoReporte.values()) {
            if (r.getId().equals(id))
                return r;
        }
        return null;
    }
}

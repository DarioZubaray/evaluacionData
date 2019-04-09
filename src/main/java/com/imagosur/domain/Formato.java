package com.imagosur.domain;

public enum Formato {
    XLS(0L, "xls"), TXT(1L, "txt");

    private final Long id;
    private final String descripcion;

    Formato(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return this.id;
    }

    public String toString() {
        return this.descripcion;
    }

    public static Formato getById(Long id) {
        for (Formato f : Formato.values()) {
            if (f.getId().equals(id))
                return f;
        }
        return null;
    }
}
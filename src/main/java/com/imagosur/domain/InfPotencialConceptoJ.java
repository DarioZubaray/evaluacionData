package com.imagosur.domain;

public class InfPotencialConceptoJ {
    private Long id;
    private boolean posee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPosee() {
        return posee;
    }

    public void setPosee(boolean posee) {
        this.posee = posee;
    }

    @Override
    public String toString() {
        return "InfPotencialConceptoJ [id=" + id + ", posee=" + posee + "]";
    }
}
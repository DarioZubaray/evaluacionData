package com.imagosur.domain;

public class UserKey {
    private Legajo legajo;
    private String key;

    public UserKey(Legajo legajo, String key) {
        this.legajo = legajo;
        this.key = key;
    }

    public Legajo getLegajo() {
        return legajo;
    }

    public void setLegajo(Legajo legajo) {
        this.legajo = legajo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "UserKey [legajo=" + legajo + ", key=" + key + "]";
    }

}
package com.imagosur.domain;

public class RegionTienda {
    private Long idRegionTienda;
    private String descripcionRegionTienda;

    public Long getIdRegionTienda() {
        return idRegionTienda;
    }

    public void setIdRegionTienda(Long idRegionTienda) {
        this.idRegionTienda = idRegionTienda;
    }

    public String getDescripcionRegionTienda() {
        return descripcionRegionTienda;
    }

    public void setDescripcionRegionTienda(String descripcionRegionTienda) {
        this.descripcionRegionTienda = descripcionRegionTienda;
    }

    @Override
    public String toString() {
        return "RegionTienda [idRegionTienda=" + idRegionTienda + ", descripcionRegionTienda=" + descripcionRegionTienda
                + "]";
    }
}
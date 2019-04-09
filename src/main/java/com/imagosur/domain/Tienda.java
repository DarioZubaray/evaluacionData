package com.imagosur.domain;

public class Tienda {

    private Long idTienda;
    private String descripcionTiendas;
    private Explotacion explotacion;
    private RegionTienda regionTienda;
    private Long inactivo;

    public Long getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Long idTienda) {
        this.idTienda = idTienda;
    }

    public String getDescripcionTiendas() {
        return descripcionTiendas;
    }

    public void setDescripcionTiendas(String descripcionTiendas) {
        this.descripcionTiendas = descripcionTiendas;
    }

    public Explotacion getExplotacion() {
        return explotacion;
    }

    public void setExplotacion(Explotacion explotacion) {
        this.explotacion = explotacion;
    }

    public RegionTienda getRegionTienda() {
        return regionTienda;
    }

    public void setRegionTienda(RegionTienda regionTienda) {
        this.regionTienda = regionTienda;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "Tienda [idTienda=" + idTienda + ", descripcionTiendas=" + descripcionTiendas + ", explotacion=" + explotacion + ", region=" + regionTienda
                + ", inactivo=" + inactivo + "]";
    }

}

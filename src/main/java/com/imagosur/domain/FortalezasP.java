package com.imagosur.domain;

public class FortalezasP {
    private Long idFortaleza;
    private String descripcionFortaleza;
    private Integer idTipoFortaleza;
    private String nombreTipo;

    public Long getIdFortaleza() {
		return idFortaleza;
	}

	public void setIdFortaleza(Long idFortaleza) {
		this.idFortaleza = idFortaleza;
	}

	public Integer getIdTipoFortaleza() {
		return idTipoFortaleza;
	}

	public void setIdTipoFortaleza(Integer idTipoFortaleza) {
		this.idTipoFortaleza = idTipoFortaleza;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public String getDescripcionFortaleza() {
		return descripcionFortaleza;
	}

	public void setDescripcionFortaleza(String descripcionFortaleza) {
		this.descripcionFortaleza = descripcionFortaleza;
	}

}

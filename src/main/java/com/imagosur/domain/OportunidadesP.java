package com.imagosur.domain;

public class OportunidadesP {
    private Long idOportunidad;
    private String descripcionOportunidad;
    private Integer idTipoOportunidad;
    private String nombreTipo;
  
    
	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public Long getIdOportunidad() {
		return idOportunidad;
	}

	public void setIdOportunidad(Long idOportunidad) {
		this.idOportunidad = idOportunidad;
	}

	public String getDescripcionOportunidad() {
		return descripcionOportunidad;
	}

	public void setDescripcionOportunidad(String descripcionOportunidad) {
		this.descripcionOportunidad = descripcionOportunidad;
	}

	public Integer getIdTipoOportunidad() {
		return idTipoOportunidad;
	}

	public void setIdTipoOportunidad(Integer idTipoOportunidad) {
		this.idTipoOportunidad = idTipoOportunidad;
	}


	@Override
    public String toString() {
        return "FortalezaJ [idOportunidad=" + idOportunidad + ", descripcionOportunidad=" + descripcionOportunidad + ", nombreTipo=" + nombreTipo
                + "]";
    }

	/*
	 * public String fortalezasOportunidadesToString(){ return
	 * "CompetenciaJ [idCompetencia=" + idCompetencia + ", fortalezas=" +
	 * simplifyCompetition(fortalezas) + ", oportunidades=" +
	 * simplifyCompetition(oportunidades) + "]"; }
	 * 
	 * public String simplifyCompetition(String competencia){ if(competencia !=
	 * null){ if(competencia.length() > 50){ String simply =
	 * competencia.substring(0, 50).replaceAll("\n", "\t"); return "\"" + simply +
	 * "\" y " + (competencia.length() - 50) + " caracteres más."; }else{ return
	 * competencia; } }else{ return null; } }
	 */

}

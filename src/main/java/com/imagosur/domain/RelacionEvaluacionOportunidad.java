package com.imagosur.domain;

public class RelacionEvaluacionOportunidad {

    private Integer idOportunidad;
    private String posicion;
    private Integer encendido;
    private Integer idEvaluacion;
    private Integer idLegajoEvaluado;
    

	public Integer getIdOportunidad() {
		return idOportunidad;
	}

	public void setIdOportunidad(Integer idOportunidad) {
		this.idOportunidad = idOportunidad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Integer getEncendido() {
		return encendido;
	}

	public void setEncendido(Integer encendido) {
		this.encendido = encendido;
	}

	public Integer getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Integer idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}


	public Integer getIdLegajoEvaluado() {
		return idLegajoEvaluado;
	}

	public void setIdLegajoEvaluado(Integer idLegajoEvaluado) {
		this.idLegajoEvaluado = idLegajoEvaluado;
	}

	@Override
    public String toString() {
        return "EvaluacionFortaleza [ idEvaluacion=" + idOportunidad +" Posicion="+ posicion +"]";
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

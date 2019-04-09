package com.imagosur.domain;

public class RelacionEvaluacionFortaleza {

    private Integer idFortaleza;
    private String posicion;
    private Integer encendido;
    private Integer idEvaluacion;
    private Integer idLegajoEvaluado;


	public Integer getIdFortaleza() {
		return idFortaleza;
	}


	public void setIdFortaleza(Integer idFortaleza) {
		this.idFortaleza = idFortaleza;
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


	public Integer getIdLegajoEvaluado() {
		return idLegajoEvaluado;
	}

	public void setIdLegajoEvaluado(Integer idLegajoEvaluado) {
		this.idLegajoEvaluado = idLegajoEvaluado;
	}

	public Integer getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Integer idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	@Override
    public String toString() {
        return "EvaluacionFortaleza [ idEvaluacion=" + idFortaleza +" Posicion="+ posicion +" ]";
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

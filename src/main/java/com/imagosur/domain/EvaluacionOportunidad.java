package com.imagosur.domain;

public class EvaluacionOportunidad {

    private Long idEvaluacionOportunida;
    private String comentarioAuto;
    private String comentarioConjunto;
    private Integer idEvaluacion;
    private Integer idLegajoEvaluado;
    
    public EvaluacionOportunidad() {
    	super();
    }
    
	public Long getIdEvaluacionOportunida() {
		return idEvaluacionOportunida;
	}

	public void setIdEvaluacionOportunida(Long idEvaluacionOportunida) {
		this.idEvaluacionOportunida = idEvaluacionOportunida;
	}

	public String getComentarioAuto() {
		return comentarioAuto;
	}

	public void setComentarioAuto(String comentarioAuto) {
		this.comentarioAuto = comentarioAuto;
	}

	public String getComentarioConjunto() {
		return comentarioConjunto;
	}

	public void setComentarioConjunto(String comentarioConjunto) {
		this.comentarioConjunto = comentarioConjunto;
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
        return "EvaluacionFortaleza [idEvaluacionFortaleza=" + idEvaluacionOportunida + ", comentarioAuto=" + comentarioAuto + ", comentarioConjunto=" + comentarioConjunto
                + " idEvaluacion=" + idEvaluacion +"]";
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

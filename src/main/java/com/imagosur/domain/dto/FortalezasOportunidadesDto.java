package com.imagosur.domain.dto;

import java.util.ArrayList;
import java.util.List;
import com.imagosur.domain.Constants;
import com.imagosur.domain.EvaluacionFortaleza;
import com.imagosur.domain.EvaluacionOportunidad;
import com.imagosur.domain.FortalezaGrupo;
import com.imagosur.domain.MovimientoFortalezaP;
import com.imagosur.domain.MovimientoOportunidadP;
import com.imagosur.domain.OportunidadGrupo;
import com.imagosur.domain.RelacionEvaluacionFortaleza;
import com.imagosur.domain.RelacionEvaluacionOportunidad;

public class FortalezasOportunidadesDto {

    private String idEvaluacion;
    private String idEvaluado;
    private FortalezaGrupo fortalezaGrupo;
    private OportunidadGrupo oportunidadGrupo;

    public EvaluacionFortaleza getEvaluacionFortaleza() {
        EvaluacionFortaleza eFortaleza = new EvaluacionFortaleza();
        eFortaleza.setComentarioAuto(this.getFortalezaGrupo().getComentarioAuto());
        eFortaleza.setComentarioConjunto(this.getFortalezaGrupo().getComentarioConjunto());
        eFortaleza.setIdEvaluacion(Integer.parseInt(getIdEvaluacion()));
        eFortaleza.setIdLegajoEvaluado(Integer.parseInt(getIdEvaluado()));
        return eFortaleza;
    }

    public EvaluacionOportunidad getEvaluacionOportunidad() {
        EvaluacionOportunidad eOportunidad = new EvaluacionOportunidad();
        eOportunidad.setComentarioAuto(this.getOportunidadGrupo().getComentarioAuto());
        eOportunidad.setComentarioConjunto(this.getOportunidadGrupo().getComentarioConjunto());
        eOportunidad.setIdEvaluacion(Integer.parseInt(this.getIdEvaluacion()));
        eOportunidad.setIdLegajoEvaluado(Integer.parseInt(this.getIdEvaluado()));
        return eOportunidad;
    }

    public List<RelacionEvaluacionFortaleza> getRelacionEvaluacionFortaleza() {
        List<RelacionEvaluacionFortaleza> listFortaleza = new ArrayList<RelacionEvaluacionFortaleza>();
        for(MovimientoFortalezaP movFortaleza : this.getFortalezaGrupo().getMovimientoFortaleza()) {
            RelacionEvaluacionFortaleza relacionFortalezaAuto = new RelacionEvaluacionFortaleza();
            relacionFortalezaAuto.setIdEvaluacion(Integer.parseInt(this.idEvaluacion));
            relacionFortalezaAuto.setIdLegajoEvaluado(Integer.parseInt(this.getIdEvaluado()));
            relacionFortalezaAuto.setIdFortaleza(movFortaleza.getIdFortaleza());

            if(Constants.ID_FORTALEZA_COMPETENCIAS.equals(movFortaleza.getIdTipoFortaleza())) {
                relacionFortalezaAuto.setPosicion(Constants.FORTALEZA_COMPETENCIA_AUTOEVALUACION);
            } else if(Constants.ID_FORTALEZA_HABILIDADES.equals(movFortaleza.getIdTipoFortaleza())) {
                relacionFortalezaAuto.setPosicion(Constants.FORTALEZA_HABILIDAD_AUTOEVALUACION);
            }
            relacionFortalezaAuto.setEncendido(movFortaleza.isEncendidoAutoevaluacion() ? 1 : 0);

            listFortaleza.add(relacionFortalezaAuto);

            RelacionEvaluacionFortaleza relacionFortalezaConjunto = new RelacionEvaluacionFortaleza();
            relacionFortalezaConjunto.setIdEvaluacion(Integer.parseInt(this.idEvaluacion));
            relacionFortalezaConjunto.setIdLegajoEvaluado(Integer.parseInt(this.getIdEvaluado()));
            relacionFortalezaConjunto.setIdFortaleza(movFortaleza.getIdFortaleza());

            if(Constants.ID_FORTALEZA_COMPETENCIAS.equals(movFortaleza.getIdTipoFortaleza())) {
                relacionFortalezaConjunto.setPosicion(Constants.FORTALEZA_COMPETENCIA_CONJUNTA);
            } else if(Constants.ID_FORTALEZA_HABILIDADES.equals(movFortaleza.getIdTipoFortaleza())) {
                relacionFortalezaConjunto.setPosicion(Constants.FORTALEZA_HABILIDAD_CONJUNTA);
            }
            relacionFortalezaConjunto.setEncendido(movFortaleza.isEncendidoConjunto() ? 1 : 0);

            listFortaleza.add(relacionFortalezaConjunto);
        }
        return listFortaleza;
    }

    public List<RelacionEvaluacionOportunidad> getRelacionEvaluacionOportunidad() {
        List<RelacionEvaluacionOportunidad> listOportunidad = new ArrayList<RelacionEvaluacionOportunidad>();
        for(MovimientoOportunidadP movOportunidad : this.getOportunidadGrupo().getMovimientoOportunidad()) {
            RelacionEvaluacionOportunidad relacionOportunidadAuto = new RelacionEvaluacionOportunidad();
            relacionOportunidadAuto.setIdEvaluacion(Integer.parseInt(this.idEvaluacion));
            relacionOportunidadAuto.setIdLegajoEvaluado(Integer.parseInt(this.getIdEvaluado()));
            relacionOportunidadAuto.setIdOportunidad(movOportunidad.getIdOportunidad());

            if(Constants.ID_OPORTUNIDADES_COMPETENCIAS.equals(movOportunidad.getIdTipoOportunidad())) {
                relacionOportunidadAuto.setPosicion(Constants.OPORTUNIDAD_COMPETENCIA_AUTOEVALUACION);
            } else if(Constants.ID_OPORTUNIDADES_HABILIDADES.equals(movOportunidad.getIdTipoOportunidad())) {
                relacionOportunidadAuto.setPosicion(Constants.OPORTUNIDAD_HABILIDAD_AUTOEVALUACION);
            }
            relacionOportunidadAuto.setEncendido(movOportunidad.isEncendidoAutoevaluacion() ? 1 : 0);

            listOportunidad.add(relacionOportunidadAuto);

            RelacionEvaluacionOportunidad relacionOportunidadConjunta = new RelacionEvaluacionOportunidad();
            relacionOportunidadConjunta.setIdEvaluacion(Integer.parseInt(this.idEvaluacion));
            relacionOportunidadConjunta.setIdLegajoEvaluado(Integer.parseInt(this.getIdEvaluado()));
            relacionOportunidadConjunta.setIdOportunidad(movOportunidad.getIdOportunidad());

            if(Constants.ID_OPORTUNIDADES_COMPETENCIAS.equals(movOportunidad.getIdTipoOportunidad())) {
                relacionOportunidadConjunta.setPosicion(Constants.OPORTUNIDAD_COMPETENCIA_CONJUNTA);
            } else if(Constants.ID_OPORTUNIDADES_HABILIDADES.equals(movOportunidad.getIdTipoOportunidad())) {
                relacionOportunidadConjunta.setPosicion(Constants.OPORTUNIDAD_HABILIDAD_CONJUNTA);
            }
            relacionOportunidadConjunta.setEncendido(movOportunidad.isEncendidoConjunto() ? 1 : 0);

            listOportunidad.add(relacionOportunidadConjunta);
        }
        return listOportunidad;
    }

    public String getIdEvaluacion() {
        return idEvaluacion;
    }
    public void setIdEvaluacion(String idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }
    public String getIdEvaluado() {
        return idEvaluado;
    }
    public void setIdEvaluado(String idEvaluado) {
        this.idEvaluado = idEvaluado;
    }
    public FortalezaGrupo getFortalezaGrupo() {
        return fortalezaGrupo;
    }
    public void setFortalezaGrupo(FortalezaGrupo fortalezaGrupo) {
        this.fortalezaGrupo = fortalezaGrupo;
    }
    public OportunidadGrupo getOportunidadGrupo() {
        return oportunidadGrupo;
    }
    public void setOportunidadGrupo(OportunidadGrupo oportunidadGrupo) {
        this.oportunidadGrupo = oportunidadGrupo;
    }
}

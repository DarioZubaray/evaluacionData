package com.imagosur.domain.dto;

import java.util.List;

import com.imagosur.domain.Competencia;
import com.imagosur.domain.PlanAccionCompetencia;
import com.imagosur.domain.PlanAccionTarea;
import com.imagosur.domain.Tarea;

public class PlanAccionDto {
    private List<Tarea> comboTarea;
    private PlanAccionTarea tarea1;
    private PlanAccionTarea tarea2;
    private List<Competencia> comboCompetencia;
    private PlanAccionCompetencia competencia1;
    private PlanAccionCompetencia competencia2;
    private String comentario;

    public PlanAccionTarea getTarea1() {
        return tarea1;
    }
    public void setTarea1(PlanAccionTarea tarea1) {
        this.tarea1 = tarea1;
    }
    public PlanAccionTarea getTarea2() {
        return tarea2;
    }
    public void setTarea2(PlanAccionTarea tarea2) {
        this.tarea2 = tarea2;
    }
    public PlanAccionCompetencia getCompetencia1() {
        return competencia1;
    }
    public void setCompetencia1(PlanAccionCompetencia competencia1) {
        this.competencia1 = competencia1;
    }
    public PlanAccionCompetencia getCompetencia2() {
        return competencia2;
    }
    public void setCompetencia2(PlanAccionCompetencia competencia2) {
        this.competencia2 = competencia2;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public List<Tarea> getComboTarea() {
        return comboTarea;
    }
    public void setComboTarea(List<Tarea> comboTarea) {
        this.comboTarea = comboTarea;
    }
    public List<Competencia> getComboCompetencia() {
        return comboCompetencia;
    }
    public void setComboCompetencia(List<Competencia> comboCompetencia) {
        this.comboCompetencia = comboCompetencia;
    }

}

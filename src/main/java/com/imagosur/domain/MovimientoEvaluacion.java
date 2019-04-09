package com.imagosur.domain;

import java.util.List;

public class MovimientoEvaluacion {
    private Long idMovimientoEvaluacion;
    private Evaluacion evaluacion;
    private Legajo legajoEvaluado;
    private Legajo legajoEvaluador;
    private Puesto puesto;
    private Sector sector;
    private String comentarioEvaluado;
    private String comentarioEvaluador;
    private EstadoEvaluador estadoEvaluador;
    private EstadoEvaluado estadoEvaluado;

    private List<InfTarea> listaInfTarea;
    private Float totalTarea;
    private String calificacionTarea;

    private List<InfCompetencia> listaInfCompetencia;
    private Float totalCompetencia;
    private String calificacionCompetencia;

    private List<InfDeseoEvolucion> listaInfDeseoEvolucion;
    private boolean otros;

    private InfNivelEstudio infNivelEstudio;

    private List<InfIndicadorConductual> listaInfIndicadorConductual;
    private String totalIndicadorConductual;

    private Float totalEvaluacion;
    private String calificacionEvaluacion;

    // jerárquicos
    private List<InfPolitica> listaInfPolitica;
    private Long idCalificacionPolitica;
    private Float totalPolitica;
    private String calificacionPolitica;
    private String ubicacionMatrizPolitica;

    private List<InfPotencialGrupoJ> listaInfPotencialGrupoJ;
    private InfPotencialJ infPotencialJ;
    private Float totalPotencialJ;
    private String calificacionPotencialJ;
    private String ubicacionMatrizPotencial;

    private List<InfCompetenciaJ> listaInfCompetenciaJ;
    private List<InfPlanAccionJ> listaInfPlanAccionJ;
    private InfDeseoEvolucionC infDeseoEvolucionC;
    private InfDeseoEvolucionJ infDeseoEvolucion;

    // Corporativos
    private MovimientoObjetivos movimientoObjetivos;
    private List<Fortaleza> fortalezaCompetenciasHabildades;
    private MovimientoFortaleza movimientoFortaleza;
    private List<Oportunidad> oportunidadCompetenciasHabildades;
    private MovimientoOportunidad movimientoOportunidad;
    private MovimientosDeseosEvolucionP movimientosDeseosEvolucionP;
    private MovimientoPotencialP movimientoPotencialP;

    public String getCalificacionEvaluacion() {
        return calificacionEvaluacion;
    }

    public void setCalificacionEvaluacion(String calificacionEvaluacion) {
        this.calificacionEvaluacion = calificacionEvaluacion;
    }

    public String getTotalIndicadorConductual() {
        return totalIndicadorConductual;
    }

    public void setTotalIndicadorConductual(String totalIndicadorConductual) {
        this.totalIndicadorConductual = totalIndicadorConductual;
    }

    public List<InfIndicadorConductual> getListaInfIndicadorConductual() {
        return listaInfIndicadorConductual;
    }

    public void setListaInfIndicadorConductual(List<InfIndicadorConductual> listaInfIndicadorConductual) {
        this.listaInfIndicadorConductual = listaInfIndicadorConductual;
    }

    public InfNivelEstudio getInfNivelEstudio() {
        return infNivelEstudio;
    }

    public void setInfNivelEstudio(InfNivelEstudio infNivelEstudio) {
        this.infNivelEstudio = infNivelEstudio;
    }

    public List<InfDeseoEvolucion> getListaInfDeseoEvolucion() {
        return listaInfDeseoEvolucion;
    }

    public void setListaInfDeseoEvolucion(List<InfDeseoEvolucion> listaInfDeseoEvolucion) {
        this.listaInfDeseoEvolucion = listaInfDeseoEvolucion;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public List<InfTarea> getListaInfTarea() {
        return listaInfTarea;
    }

    public void setListaInfTarea(List<InfTarea> listaInfTarea) {
        this.listaInfTarea = listaInfTarea;
    }

    public String getCalificacionTarea() {
        return calificacionTarea;
    }

    public void setCalificacionTarea(String calificacionTarea) {
        this.calificacionTarea = calificacionTarea;
    }

    public String getCalificacionCompetencia() {
        return calificacionCompetencia;
    }

    public void setCalificacionCompetencia(String calificacionCompetencia) {
        this.calificacionCompetencia = calificacionCompetencia;
    }

    public Long getIdMovimientoEvaluacion() {
        return idMovimientoEvaluacion;
    }

    public void setIdMovimientoEvaluacion(Long idMovimientoEvaluacion) {
        this.idMovimientoEvaluacion = idMovimientoEvaluacion;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Legajo getLegajoEvaluado() {
        return legajoEvaluado;
    }

    public void setLegajoEvaluado(Legajo legajoEvaluado) {
        this.legajoEvaluado = legajoEvaluado;
    }

    public Legajo getLegajoEvaluador() {
        return legajoEvaluador;
    }

    public void setLegajoEvaluador(Legajo legajoEvaluador) {
        this.legajoEvaluador = legajoEvaluador;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getComentarioEvaluador() {
        return comentarioEvaluador;
    }

    public void setComentarioEvaluador(String comentarioEvaluador) {
        this.comentarioEvaluador = comentarioEvaluador;
    }

    public List<InfCompetencia> getListaInfCompetencia() {
        return listaInfCompetencia;
    }

    public void setListaInfCompetencia(List<InfCompetencia> listaInfCompetencia) {
        this.listaInfCompetencia = listaInfCompetencia;
    }

    public String getComentarioEvaluado() {
        return comentarioEvaluado;
    }

    public void setComentarioEvaluado(String comentarioEvaluado) {
        this.comentarioEvaluado = comentarioEvaluado;
    }

    public Float getTotalTarea() {
        return totalTarea;
    }

    public void setTotalTarea(Float totalTarea) {
        this.totalTarea = totalTarea;
    }

    public Float getTotalCompetencia() {
        return totalCompetencia;
    }

    public void setTotalCompetencia(Float totalCompetencia) {
        this.totalCompetencia = totalCompetencia;
    }

    public Float getTotalEvaluacion() {
        return totalEvaluacion;
    }

    public void setTotalEvaluacion(Float totalEvaluacion) {
        this.totalEvaluacion = totalEvaluacion;
    }

    public EstadoEvaluador getEstadoEvaluador() {
        return estadoEvaluador;
    }

    public void setEstadoEvaluador(EstadoEvaluador estadoEvaluador) {
        this.estadoEvaluador = estadoEvaluador;
    }

    public EstadoEvaluado getEstadoEvaluado() {
        return estadoEvaluado;
    }

    public void setEstadoEvaluado(EstadoEvaluado estadoEvaluado) {
        this.estadoEvaluado = estadoEvaluado;
    }

    public List<InfPolitica> getListaInfPolitica() {
        return listaInfPolitica;
    }

    public void setListaInfPolitica(List<InfPolitica> listaInfPolitica) {
        this.listaInfPolitica = listaInfPolitica;
    }

    public Float getTotalPolitica() {
        return totalPolitica;
    }

    public void setTotalPolitica(Float totalPolitica) {
        this.totalPolitica = totalPolitica;
    }

    public String getCalificacionPolitica() {
        return calificacionPolitica;
    }

    public void setCalificacionPolitica(String calificacionPolitica) {
        this.calificacionPolitica = calificacionPolitica;
    }

    public List<InfPotencialGrupoJ> getListaInfPotencialGrupoJ() {
        return listaInfPotencialGrupoJ;
    }

    public List<InfPotencialGrupoJ> getListaInfPotencialGrupoC() {
        return listaInfPotencialGrupoJ;
    }

    public void setListaInfPotencialGrupoJ(List<InfPotencialGrupoJ> listaInfPotencialGrupoJ) {
        this.listaInfPotencialGrupoJ = listaInfPotencialGrupoJ;
    }

    public void setListaInfPotencialGrupoC(List<InfPotencialGrupoJ> listaInfPotencialGrupoC) {
        this.listaInfPotencialGrupoJ = listaInfPotencialGrupoC;
    }

    public Float getTotalPotencialJ() {
        return totalPotencialJ;
    }

    public void setTotalPotencialJ(Float totalPotencialJ) {
        this.totalPotencialJ = totalPotencialJ;
    }

    public String getCalificacionPotencialJ() {
        return calificacionPotencialJ;
    }

    public void setCalificacionPotencialJ(String calificacionPotencialJ) {
        this.calificacionPotencialJ = calificacionPotencialJ;
    }

    public Long getIdCalificacionPolitica() {
        return idCalificacionPolitica;
    }

    public void setIdCalificacionPolitica(Long idCalificacionPolitica) {
        this.idCalificacionPolitica = idCalificacionPolitica;
    }

    public String getUbicacionMatrizPolitica() {
        return ubicacionMatrizPolitica;
    }

    public void setUbicacionMatrizPolitica(String ubicacionMatrizPolitica) {
        this.ubicacionMatrizPolitica = ubicacionMatrizPolitica;
    }

    public String getUbicacionMatrizPotencial() {
        return ubicacionMatrizPotencial;
    }

    public void setUbicacionMatrizPotencial(String ubicacionMatrizPotencial) {
        this.ubicacionMatrizPotencial = ubicacionMatrizPotencial;
    }

    public List<InfCompetenciaJ> getListaInfCompetenciaJ() {
        return listaInfCompetenciaJ;
    }

    public void setListaInfCompetenciaJ(List<InfCompetenciaJ> listaInfCompetenciaJ) {
        this.listaInfCompetenciaJ = listaInfCompetenciaJ;
    }

    public List<InfPlanAccionJ> getListaInfPlanAccionJ() {
        return listaInfPlanAccionJ;
    }

    public void setListaInfPlanAccionJ(List<InfPlanAccionJ> listaInfPlanAccionJ) {
        this.listaInfPlanAccionJ = listaInfPlanAccionJ;
    }

    public InfDeseoEvolucionJ getInfDeseoEvolucionJ() {
        return infDeseoEvolucion;
    }

    public void setInfDeseoEvolucionJ(InfDeseoEvolucionJ infDeseoEvolucion) {
        this.infDeseoEvolucion = infDeseoEvolucion;
    }

    public InfPotencialJ getInfPotencialJ() {
        return infPotencialJ;
    }

    public void setInfPotencialJ(InfPotencialJ infPotencialJ) {
        this.infPotencialJ = infPotencialJ;
    }

    public void setInfPotencialC(InfPotencialJ infPotencialC) {
        this.infPotencialJ = infPotencialC;
    }

    @Override
    public String toString() {
        return "MovimientoEvaluacion [idMovimientoEvaluacion=" + idMovimientoEvaluacion + ", evaluacion=" + evaluacion
                + ", legajoEvaluado=" + legajoEvaluado + ", legajoEvaluador=" + legajoEvaluador + "]";
    }

    public InfDeseoEvolucionC getInfDeseoEvolucionC() {
        return infDeseoEvolucionC;
    }

    public void setInfDeseoEvolucionC(InfDeseoEvolucionC infDeseoEvolucionC) {
        this.infDeseoEvolucionC = infDeseoEvolucionC;
    }

    public InfDeseoEvolucionJ getInfDeseoEvolucion() {
        return infDeseoEvolucion;
    }

    public void setInfDeseoEvolucion(InfDeseoEvolucionJ infDeseoEvolucion) {
        this.infDeseoEvolucion = infDeseoEvolucion;
    }

    public MovimientoObjetivos getMovimientoObjetivos() {
        return movimientoObjetivos;
    }

    public void setMovimientoObjetivos(MovimientoObjetivos movimientoObjetivos) {
        this.movimientoObjetivos = movimientoObjetivos;
    }

    public MovimientoFortaleza getMovimientoFortaleza() {
        return movimientoFortaleza;
    }

    public void setMovimientoFortaleza(MovimientoFortaleza movimientoFortaleza) {
        this.movimientoFortaleza = movimientoFortaleza;
    }

    public MovimientosDeseosEvolucionP getMovimientosDeseosEvolucionP() {
        return movimientosDeseosEvolucionP;
    }

    public void setMovimientosDeseosEvolucionP(MovimientosDeseosEvolucionP movimientosDeseosEvolucionP) {
        this.movimientosDeseosEvolucionP = movimientosDeseosEvolucionP;
    }

    public MovimientoPotencialP getMovimientoPotencialP() {
        return movimientoPotencialP;
    }

    public void setMovimientoPotencialP(MovimientoPotencialP movimientoPotencialP) {
        this.movimientoPotencialP = movimientoPotencialP;
    }

    public MovimientoOportunidad getMovimientoOportunidad() {
        return movimientoOportunidad;
    }

    public void setMovimientoOportunidad(MovimientoOportunidad movimientoOportunidad) {
        this.movimientoOportunidad = movimientoOportunidad;
    }

    public List<Fortaleza> getFortalezaCompetenciasHabildades() {
        return fortalezaCompetenciasHabildades;
    }

    public void setFortalezaCompetenciasHabildades(List<Fortaleza> fortalezaCompetenciasHabildades) {
        this.fortalezaCompetenciasHabildades = fortalezaCompetenciasHabildades;
    }

    public List<Oportunidad> getOportunidadCompetenciasHabildades() {
        return oportunidadCompetenciasHabildades;
    }

    public void setOportunidadCompetenciasHabildades(List<Oportunidad> oportunidadCompetneciasHabildades) {
        this.oportunidadCompetenciasHabildades = oportunidadCompetneciasHabildades;
    }

}
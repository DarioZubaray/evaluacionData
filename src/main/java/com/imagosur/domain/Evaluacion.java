package com.imagosur.domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Evaluacion {
    private Long idEvaluacion;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private Long idPlantilla;
    private String tipoConvenio;
    private String descripcionEvaluacion;
    private Long inactivo;
    private Long idEvaluador;
    private String evaluador;
    private Long idEvaluado;
    private String evaluado;
    private Boolean antiguo;

    private Plantilla plantilla;
    private String estado;
    private Long idPuestoEspectativaEvaluador;
    private Long idSectorEspectativaEvaluador;
    private String descripcionPuestoEspectativaEvaluador;
    private String descripcionSectorEspectativaEvaluador;
    private Long idEstadoEvaluado;
    private String EstadoEvaluado;
    private Long idEstadoEvaluador;
    private String EstadoEvaluador;
    private String comentarioEvaluado;
    private String comentarioEvaluador;
    private List<Competencia> listaCompetencia;
    private List<CalificacionCompetencia> listaCalificacionCompetencia;
    private List<Tarea> listaTarea;
    private List<CalificacionTarea> listaCalificacionTarea;
    private List<DeseoEvolucion> listaDeseoEvolucion;
    private List<PlanAccionTarea> listaPlanAccionTarea;
    private List<PlanAccionCompetencia> listaPlanAccionCompetencia;
    private List<IndicadorConductual> listaIndicadoresConductuales;
    private List<ConclusionIndicadorConductual> listaConclusionIndicadoresConductuales;
    private List<Puesto> listaPuestos;
    private List<Sector> listaSectores;
    private List<Tarea> comboTarea;
    private List<Competencia> comboCompetencia;
    private String promedioEvaluadoCompetencias;
    private String promedioEvaluadoTareas;
    private String promedioEvaluadorCompetencias;
    private String promedioEvaluadorTareas;
    private Long idMovimientosEvaluaciones;
    private boolean tieneAccionesPendientes;
    private Collection<ConceptoCalificacion> conceptosCalificacion;
    // Convenio
    private DeseoEvolucion deseoEvolucion;

    // Jerarquicos
    private List<CompetenciaJ> listaCompetenciaJ;
    private List<PoliticaJ> listaPolitica;
    private List<PlanAccionJ> listaPlanAccionJ;
    private DeseoEvolucionJ deseoEvolucionJ;
    private List<Proyeccion> listaProyeccion;
    private MovimientoPotencial movimientoPotencial;
    private Long idTipoConvenio;
    private List<CalificacionPolitica> listCalificacionPolitica;
    private TipoConvenio tipoConvenioEnum;
    private String ubicacionMatriz;

    //Corporativo
    private List<Objetivo> objetivos;
    private MovimientoObjetivos movimientoObjetivos;
    private FortalezaGrupo fortalezaGrupo;
    private OportunidadGrupo oportunidadGrupo;
    private MovimientosDeseosEvolucionP movimientoDeseosEvolucionP;
    private List<DeseoEvolucionProyeccion> deseoEvolucionProyeccion;
    private MovimientoPotencialP movimientoPotencialP;

    // Para imprimir evaluacion
    private String nombreEvaluado;
    private String apellidoEvaluado;
    private String legajoEvaluado;
    private String puestoEvaluado;
    private String sectorEvaluado;
    private String dniEvaluado;
    private String promedioPoliticaAuto;
    private String promedioPoliticaConjunto;

    private DeseoEvolucionC deseoEvolucionC;

    public Long getIdMovimientosEvaluaciones() {
        return idMovimientosEvaluaciones;
    }

    public void setIdMovimientosEvaluaciones(Long idMovimientosEvaluaciones) {
        this.idMovimientosEvaluaciones = idMovimientosEvaluaciones;
    }

    public String getDescripcionPuestoEspectativaEvaluador() {
        return descripcionPuestoEspectativaEvaluador;
    }

    public void setDescripcionPuestoEspectativaEvaluador(String descripcionPuestoEspectativaEvaluador) {
        this.descripcionPuestoEspectativaEvaluador = descripcionPuestoEspectativaEvaluador;
    }

    public String getDescripcionSectorEspectativaEvaluador() {
        return descripcionSectorEspectativaEvaluador;
    }

    public void setDescripcionSectorEspectativaEvaluador(String descripcionSectorEspectativaEvaluador) {
        this.descripcionSectorEspectativaEvaluador = descripcionSectorEspectativaEvaluador;
    }

    public String getPromedioEvaluadoCompetencias() {
        return promedioEvaluadoCompetencias;
    }

    public void setPromedioEvaluadoCompetencias(String promedioEvaluadoCompetencias) {
        this.promedioEvaluadoCompetencias = promedioEvaluadoCompetencias;
    }

    public String getPromedioEvaluadoTareas() {
        return promedioEvaluadoTareas;
    }

    public void setPromedioEvaluadoTareas(String promedioEvaluadoTareas) {
        this.promedioEvaluadoTareas = promedioEvaluadoTareas;
    }

    public String getPromedioEvaluadorCompetencias() {
        return promedioEvaluadorCompetencias;
    }

    public void setPromedioEvaluadorCompetencias(String promedioEvaluadorCompetencias) {
        this.promedioEvaluadorCompetencias = promedioEvaluadorCompetencias;
    }

    public String getPromedioEvaluadorTareas() {
        return promedioEvaluadorTareas;
    }

    public void setPromedioEvaluadorTareas(String promedioEvaluadorTareas) {
        this.promedioEvaluadorTareas = promedioEvaluadorTareas;
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

    public String getComentarioEvaluador() {
        return comentarioEvaluador;
    }

    public void setComentarioEvaluador(String comentarioEvaluador) {
        this.comentarioEvaluador = comentarioEvaluador;
    }

    public List<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(List<Puesto> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }

    public List<Sector> getListaSectores() {
        return listaSectores;
    }

    public void setListaSectores(List<Sector> listaSectores) {
        this.listaSectores = listaSectores;
    }

    public List<ConclusionIndicadorConductual> getListaConclusionIndicadoresConductuales() {
        return listaConclusionIndicadoresConductuales;
    }

    public void setListaConclusionIndicadoresConductuales(List<ConclusionIndicadorConductual> listaConclusionIndicadoresConductuales) {
        this.listaConclusionIndicadoresConductuales = listaConclusionIndicadoresConductuales;
    }

    public List<IndicadorConductual> getListaIndicadoresConductuales() {
        return listaIndicadoresConductuales;
    }

    public void setListaIndicadoresConductuales(List<IndicadorConductual> listaIndicadoresConductuales) {
        this.listaIndicadoresConductuales = listaIndicadoresConductuales;
    }

    public List<PlanAccionTarea> getListaPlanAccionTarea() {
        return listaPlanAccionTarea;
    }

    public void setListaPlanAccionTarea(List<PlanAccionTarea> listaPlanAccionTarea) {
        this.listaPlanAccionTarea = listaPlanAccionTarea;
    }

    public List<PlanAccionCompetencia> getListaPlanAccionCompetencia() {
        return listaPlanAccionCompetencia;
    }

    public void setListaPlanAccionCompetencia(List<PlanAccionCompetencia> listaPlanAccionCompetencia) {
        this.listaPlanAccionCompetencia = listaPlanAccionCompetencia;
    }

    public List<DeseoEvolucion> getListaDeseoEvolucion() {
        return listaDeseoEvolucion;
    }

    public void setListaDeseoEvolucion(List<DeseoEvolucion> listaDeseoEvolucion) {
        this.listaDeseoEvolucion = listaDeseoEvolucion;
    }

    public List<Tarea> getListaTarea() {
        return listaTarea;
    }

    public void setListaTarea(List<Tarea> listaTarea) {
        this.listaTarea = listaTarea;
    }

    public List<CalificacionTarea> getListaCalificacionTarea() {
        return listaCalificacionTarea;
    }

    public void setListaCalificacionTarea(List<CalificacionTarea> listaCalificacionTarea) {
        this.listaCalificacionTarea = listaCalificacionTarea;
    }

    public Long getIdEvaluador() {
        return idEvaluador;
    }

    public void setIdEvaluador(Long idEvaluador) {
        this.idEvaluador = idEvaluador;
    }

    public String getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(String evaluador) {
        this.evaluador = evaluador;
    }

    public String getComentarioEvaluado() {
        return comentarioEvaluado;
    }

    public void setComentarioEvaluado(String comentarioEvaluado) {
        this.comentarioEvaluado = comentarioEvaluado;
    }

    public Long getIdEstadoEvaluado() {
        return idEstadoEvaluado;
    }

    public void setIdEstadoEvaluado(Long idEstadoEvaluado) {
        this.idEstadoEvaluado = idEstadoEvaluado;
    }

    public String getEstadoEvaluado() {
        return EstadoEvaluado;
    }

    public void setEstadoEvaluado(String estadoEvaluado) {
        EstadoEvaluado = estadoEvaluado;
    }

    public Long getIdEstadoEvaluador() {
        return idEstadoEvaluador;
    }

    public void setIdEstadoEvaluador(Long idEstadoEvaluador) {
        this.idEstadoEvaluador = idEstadoEvaluador;
    }

    public String getEstadoEvaluador() {
        return EstadoEvaluador;
    }

    public void setEstadoEvaluador(String estadoEvaluador) {
        EstadoEvaluador = estadoEvaluador;
    }

    public Long getIdPuestoEspectativaEvaluador() {
        return idPuestoEspectativaEvaluador;
    }

    public void setIdPuestoEspectativaEvaluador(Long idPuestoEspectativaEvaluador) {
        this.idPuestoEspectativaEvaluador = idPuestoEspectativaEvaluador;
    }

    public Long getIdSectorEspectativaEvaluador() {
        return idSectorEspectativaEvaluador;
    }

    public void setIdSectorEspectativaEvaluador(Long idSectorEspectativaEvaluador) {
        this.idSectorEspectativaEvaluador = idSectorEspectativaEvaluador;
    }

    public List<CalificacionCompetencia> getListaCalificacionCompetencia() {
        return listaCalificacionCompetencia;
    }

    public void setListaCalificacionCompetencia(List<CalificacionCompetencia> listaCalificacionCompetencia) {
        this.listaCalificacionCompetencia = listaCalificacionCompetencia;
    }

    public List<Competencia> getListaCompetencia() {
        return listaCompetencia;
    }

    public void setListaCompetencia(List<Competencia> listaCompetencia) {
        this.listaCompetencia = listaCompetencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getDescripcionEvaluacion() {
        return descripcionEvaluacion;
    }

    public void setDescripcionEvaluacion(String descripcionEvaluacion) {
        this.descripcionEvaluacion = descripcionEvaluacion;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    public Long getIdEvaluado() {
        return idEvaluado;
    }

    public void setIdEvaluado(Long idEvaluado) {
        this.idEvaluado = idEvaluado;
    }

    public String getEvaluado() {
        return evaluado;
    }

    public void setEvaluado(String evaluado) {
        this.evaluado = evaluado;
    }

    public List<CompetenciaJ> getListaCompetenciaJ() {
        return listaCompetenciaJ;
    }

    public void setListaCompetenciaJ(List<CompetenciaJ> listaCompetenciaJ) {
        this.listaCompetenciaJ = listaCompetenciaJ;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public void setTipoConvenioEnum(TipoConvenio tipo) {
        this.tipoConvenioEnum = tipo;
    }

    public TipoConvenio getTipoConvenioEnum() {
        return this.tipoConvenioEnum;
    }

    public List<PoliticaJ> getListaPolitica() {
        return listaPolitica;
    }

    public void setListaPolitica(List<PoliticaJ> listaPolitica) {
        this.listaPolitica = listaPolitica;
    }

    public List<PlanAccionJ> getListaPlanAccionJ() {
        return listaPlanAccionJ;
    }

    public void setListaPlanAccionJ(List<PlanAccionJ> listaPlanAccionJ) {
        this.listaPlanAccionJ = listaPlanAccionJ;
    }

    public DeseoEvolucionJ getDeseoEvolucionJ() {
        return deseoEvolucionJ;
    }

    public void setDeseoEvolucionJ(DeseoEvolucionJ deseoEvolucionJ) {
        this.deseoEvolucionJ = deseoEvolucionJ;
    }

    public List<Proyeccion> getListaProyeccion() {
        return listaProyeccion;
    }

    public void setListaProyeccion(List<Proyeccion> listaProyeccion) {
        this.listaProyeccion = listaProyeccion;
    }

    public MovimientoPotencial getMovimientoPotencial() {
        return movimientoPotencial;
    }

    public void setMovimientoPotencial(MovimientoPotencial movimientoPotencial) {
        this.movimientoPotencial = movimientoPotencial;
    }

    public Long getIdTipoConvenio() {
        return idTipoConvenio;
    }

    public void setIdTipoConvenio(Long idTipoConvenio) {
        this.idTipoConvenio = idTipoConvenio;
    }

    public List<CalificacionPolitica> getListCalificacionPolitica() {
        return listCalificacionPolitica;
    }

    public void setListCalificacionPolitica(List<CalificacionPolitica> listCalificacionPolitica) {
        this.listCalificacionPolitica = listCalificacionPolitica;
    }

    public String getUbicacionMatriz() {
        return ubicacionMatriz;
    }

    public void setUbicacionMatriz(String ubicacionMatriz) {
        this.ubicacionMatriz = ubicacionMatriz;
    }

    public boolean isTieneAccionesPendientes() {
        return tieneAccionesPendientes;
    }

    public void setTieneAccionesPendientes(boolean tieneAccionesPendientes) {
        this.tieneAccionesPendientes = tieneAccionesPendientes;
    }

    public String getNombreEvaluado() {
        return nombreEvaluado;
    }

    public void setNombreEvaluado(String nombreEvaluado) {
        this.nombreEvaluado = nombreEvaluado;
    }

    public String getApellidoEvaluado() {
        return apellidoEvaluado;
    }

    public void setApellidoEvaluado(String apellidoEvaluado) {
        this.apellidoEvaluado = apellidoEvaluado;
    }

    public String getLegajoEvaluado() {
        return legajoEvaluado;
    }

    public void setLegajoEvaluado(String legajoEvaluado) {
        this.legajoEvaluado = legajoEvaluado;
    }

    public String getPuestoEvaluado() {
        return puestoEvaluado;
    }

    public void setPuestoEvaluado(String puestoEvaluado) {
        this.puestoEvaluado = puestoEvaluado;
    }

    public String getSectorEvaluado() {
        return sectorEvaluado;
    }

    public void setSectorEvaluado(String sectorEvaluado) {
        this.sectorEvaluado = sectorEvaluado;
    }

    public String getDniEvaluado() {
        return dniEvaluado;
    }

    public void setDniEvaluado(String dniEvaluado) {
        this.dniEvaluado = dniEvaluado;
    }

    public Boolean getAntiguo() {
        return antiguo;
    }

    public void setAntiguo(Boolean antiguo) {
        this.antiguo = antiguo;
    }

    public Boolean isAntiguo() {
        return getAntiguo();
    }

    public Collection<ConceptoCalificacion> getConceptosCalificacion() {
        return conceptosCalificacion;
    }

    public void setConceptosCalificacion(Collection<ConceptoCalificacion> conceptosCalificacion) {
        this.conceptosCalificacion = conceptosCalificacion;
    }

    public String getPromedioPoliticaAuto() {
        return promedioPoliticaAuto;
    }

    public void setPromedioPoliticaAuto(String promedioPoliticaAuto) {
        this.promedioPoliticaAuto = promedioPoliticaAuto;
    }

    public String getPromedioPoliticaConjunto() {
        return promedioPoliticaConjunto;
    }

    public void setPromedioPoliticaConjunto(String promedioPoliticaConjunto) {
        this.promedioPoliticaConjunto = promedioPoliticaConjunto;
    }

    public DeseoEvolucion getDeseoEvolucion() {
        return deseoEvolucion;
    }

    public void setDeseoEvolucion(DeseoEvolucion deseoEvolucion) {
        this.deseoEvolucion = deseoEvolucion;
    }

    public MovimientoPotencialP getMovimientoPotencialP() {
        return movimientoPotencialP;
    }
    
    public void setMovimientoPotencialP(MovimientoPotencialP movimientoPotencialP) {
        this.movimientoPotencialP = movimientoPotencialP;
    }

    @Override
    public String toString() {
        return "Evaluacion [idEvaluacion=" + idEvaluacion + ", idPlantilla=" + idPlantilla + ", tipoConvenio=" + tipoConvenio + ", idEvaluador="
                + idEvaluador + ", evaluador=" + evaluador + ", idEvaluado=" + idEvaluado + "]";
    }

    public List<Objetivo> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<Objetivo> objetivos) {
        this.objetivos = objetivos;
    }

    public MovimientoObjetivos getMovimientoObjetivos() {
        return movimientoObjetivos;
    }

    public void setMovimientoObjetivos(MovimientoObjetivos movimientoObjetivos) {
        this.movimientoObjetivos = movimientoObjetivos;
    }

    public MovimientosDeseosEvolucionP getMovimientoDeseosEvolucionP() {
        return movimientoDeseosEvolucionP;
    }

    public void setMovimientoDeseosEvolucionP(MovimientosDeseosEvolucionP movimientoDeseosEvolucionP) {
        this.movimientoDeseosEvolucionP = movimientoDeseosEvolucionP;
    }

    public List<DeseoEvolucionProyeccion> getDeseoEvolucionProyeccion() {
        return deseoEvolucionProyeccion;
    }

    public void setDeseoEvolucionProyeccion(List<DeseoEvolucionProyeccion> deseoEvolucionProyeccion) {
        this.deseoEvolucionProyeccion = deseoEvolucionProyeccion;
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

    public Plantilla getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Plantilla plantilla) {
        this.plantilla = plantilla;
    }

    public DeseoEvolucionC getDeseoEvolucionC() {
        return deseoEvolucionC;
    }

    public void setDeseoEvolucionC(DeseoEvolucionC deseoEvolucionC) {
        this.deseoEvolucionC = deseoEvolucionC;
    }

}
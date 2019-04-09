package com.imagosur.domain;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("legajo")
public class Legajo implements Serializable{
    private static final long serialVersionUID = -3545723165947753817L;
    private String legajoId;
    private String legajo;
    private String nombre;
    private String apellido;
    private String dni;
    private String contrasena;
    private String cContrasena;
    private String respuestaSecreta; // cContrasena
    private Long fueraConvenio;
    private Long primerIngreso;
    private Long inactivo;
    private Tienda tienda;
    private Long idPregunta;
    private Sector sector;
    private Puesto puesto;
    private PreguntaSecreta preguntaSecreta;
    private String respuesta;
    private Long idNivelEstudio;
    private String tituloObtenido;
    private String establecimiento;
    private String maximoNivelEstudio;
    private String key;
    private Titulo titulo;
    private TituloEstado tituloEstado;

    private LegajoTitulo legajoTitulo;
    private LegajoTitulo legajoTituloEvaluado;
    private String genero;

    private Long idEvaluacion;
    private Evaluacion evaluacion;
    private Long legajoIdEvaluador;
    private Long legajoIdEvaluado;
    private List<Tarea> comboTarea;
    private List<Competencia> comboCompetencia;
    private List<NivelEstudio> listaNivelEstudio;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMaximoNivelEstudio() {
        return maximoNivelEstudio;
    }

    public void setMaximoNivelEstudio(String maximoNivelEstudio) {
        this.maximoNivelEstudio = maximoNivelEstudio;
    }

    public List<Competencia> getComboCompetencia() {
        return comboCompetencia;
    }

    public void setComboCompetencia(List<Competencia> comboCompetencia) {
        this.comboCompetencia = comboCompetencia;
    }

    public List<Tarea> getComboTarea() {
        return comboTarea;
    }

    public void setComboTarea(List<Tarea> comboTarea) {
        this.comboTarea = comboTarea;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String getLegajoId() {
        return legajoId;
    }

    public void setLegajoId(String legajoId) {
        this.legajoId = legajoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Long getFueraConvenio() {
        return fueraConvenio;
    }

    public void setFueraConvenio(Long fueraConvenio) {
        this.fueraConvenio = fueraConvenio;
    }

    public Long getPrimerIngreso() {
        return primerIngreso;
    }

    public void setPrimerIngreso(Long primerIngreso) {
        this.primerIngreso = primerIngreso;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getcContrasena() {
        return cContrasena;
    }

    public void setcContrasena(String cContrasena) {
        this.cContrasena = cContrasena;
    }

    public Long getIdNivelEstudio() {
        return idNivelEstudio;
    }

    public void setIdNivelEstudio(Long idNivelEstudio) {
        this.idNivelEstudio = idNivelEstudio;
    }

    public String getTituloObtenido() {
        return tituloObtenido;
    }

    public void setTituloObtenido(String tituloObtenido) {
        this.tituloObtenido = tituloObtenido;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Long getLegajoIdEvaluador() {
        return legajoIdEvaluador;
    }

    public void setLegajoIdEvaluador(Long legajoIdEvaluador) {
        this.legajoIdEvaluador = legajoIdEvaluador;
    }

    public Long getLegajoIdEvaluado() {
        return legajoIdEvaluado;
    }

    public void setLegajoIdEvaluado(Long legajoIdEvaluado) {
        this.legajoIdEvaluado = legajoIdEvaluado;
    }

    public List<NivelEstudio> getListaNivelEstudio() {
        return listaNivelEstudio;
    }

    public void setListaNivelEstudio(List<NivelEstudio> listaNivelEstudio) {
        this.listaNivelEstudio = listaNivelEstudio;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public TituloEstado getTituloEstado() {
        return tituloEstado;
    }

    public void setTituloEstado(TituloEstado tituloEstado) {
        this.tituloEstado = tituloEstado;
    }

    public LegajoTitulo getLegajoTitulo() {
        return legajoTitulo;
    }

    public void setLegajoTitulo(LegajoTitulo legajoTitulo) {
        this.legajoTitulo = legajoTitulo;
    }

    public LegajoTitulo getLegajoTituloEvaluado() {
        return legajoTituloEvaluado;
    }

    public void setLegajoTituloEvaluado(LegajoTitulo legajoTituloEvaluado) {
        this.legajoTituloEvaluado = legajoTituloEvaluado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((legajoId == null) ? 0 : legajoId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Legajo other = (Legajo) obj;
        if (legajoId == null) {
            if (other.legajoId != null)
                return false;
        } else if (!legajoId.equals(other.legajoId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Legajo [legajoId=" + legajoId + ", legajo=" + legajo + ", fueraConvenio=" + fueraConvenio + ", idEvaluacion=" + idEvaluacion
                + ", legajoIdEvaluador=" + legajoIdEvaluador + ", legajoIdEvaluado=" + legajoIdEvaluado + "]";
    }

    public String getRespuestaSecreta() {
        return respuestaSecreta;
    }

    public void setRespuestaSecreta(String respuestaSecreta) {
        this.respuestaSecreta = respuestaSecreta;
    }

    public PreguntaSecreta getPreguntaSecreta() {
        return preguntaSecreta;
    }

    public void setPreguntaSecreta(PreguntaSecreta preguntaSecreta) {
        this.preguntaSecreta = preguntaSecreta;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
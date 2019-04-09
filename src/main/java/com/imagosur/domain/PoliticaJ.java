package com.imagosur.domain;

public class PoliticaJ implements GetterValorEvaluacion {
    private Long idPolitica;
    private String descripcionPolitica;
    private Long idCalificacionAuto;
    private int puntajeAuto;
    private String descripcionPuntajeAuto;
    private Long idCalificacionConjunta;
    private int puntajeConjunta;
    private String descripcionPuntajeConjunta;
    private String autoevaluacionActual;
    private String autoevaluacionObjetivos;
    private String conjuntaActual;
    private String conjuntaObjetivos;
    private String ejemploActual;
    private String ejemploObjetivos;

    public Long getIdPolitica() {
        return idPolitica;
    }

    public void setIdPolitica(Long idPolitica) {
        this.idPolitica = idPolitica;
    }

    public String getDescripcionPolitica() {
        return descripcionPolitica;
    }

    public void setDescripcionPolitica(String descripcionPolitica) {
        this.descripcionPolitica = descripcionPolitica;
    }

    public int getPuntajeAuto() {
        return puntajeAuto;
    }

    public void setPuntajeAuto(int puntajeAuto) {
        this.puntajeAuto = puntajeAuto;
    }

    public String getDescripcionPuntajeAuto() {
        return descripcionPuntajeAuto;
    }

    public void setDescripcionPuntajeAuto(String descripcionPuntajeAuto) {
        this.descripcionPuntajeAuto = descripcionPuntajeAuto;
    }

    public int getPuntajeConjunta() {
        return puntajeConjunta;
    }

    public void setPuntajeConjunta(int puntajeConjunta) {
        this.puntajeConjunta = puntajeConjunta;
    }

    public String getDescripcionPuntajeConjunta() {
        return descripcionPuntajeConjunta;
    }

    public void setDescripcionPuntajeConjunta(String descripcionPuntajeConjunta) {
        this.descripcionPuntajeConjunta = descripcionPuntajeConjunta;
    }

    public String getAutoevaluacionActual() {
        return autoevaluacionActual;
    }

    public void setAutoevaluacionActual(String autoevaluacionActual) {
        this.autoevaluacionActual = autoevaluacionActual;
    }

    public String getAutoevaluacionObjetivos() {
        return autoevaluacionObjetivos;
    }

    public void setAutoevaluacionObjetivos(String autoevaluacionObjetivos) {
        this.autoevaluacionObjetivos = autoevaluacionObjetivos;
    }

    public String getConjuntaActual() {
        return conjuntaActual;
    }

    public void setConjuntaActual(String conjuntaActual) {
        this.conjuntaActual = conjuntaActual;
    }

    public String getConjuntaObjetivos() {
        return conjuntaObjetivos;
    }

    public void setConjuntaObjetivos(String conjuntaObjetivos) {
        this.conjuntaObjetivos = conjuntaObjetivos;
    }

    public String getEjemploActual() {
        return ejemploActual;
    }

    public void setEjemploActual(String ejemploActual) {
        this.ejemploActual = ejemploActual;
    }

    public String getEjemploObjetivos() {
        return ejemploObjetivos;
    }

    public void setEjemploObjetivos(String ejemploObjetivos) {
        this.ejemploObjetivos = ejemploObjetivos;
    }

    public Long getIdCalificacionAuto() {
        return idCalificacionAuto;
    }

    public void setIdCalificacionAuto(Long idCalificacionAuto) {
        this.idCalificacionAuto = idCalificacionAuto;
    }

    public Long getIdCalificacionConjunta() {
        return idCalificacionConjunta;
    }

    public void setIdCalificacionConjunta(Long idCalificacionConjunta) {
        this.idCalificacionConjunta = idCalificacionConjunta;
    }

    public String getValorConjunto() {
        return String.valueOf(puntajeConjunta);
    }

    public String getValorAutoEvaluacion() {
        return String.valueOf(puntajeAuto);
    }

    @Override
    public String toString() {
        return "Politica [idPolitica=" + idPolitica + ", idCalificacionAuto=" + idCalificacionAuto + ", idCalificacionConjunta="
                + idCalificacionConjunta + "]";
    }

    public String politicaActualToString() {
        return "Politica [idPolitica=" + this.getIdPolitica()
                        +", idCalificacionAuto=" + this.getIdCalificacionAuto()
                        +", autoEvaluacionActual=" + simplifyPolitics(this.getAutoevaluacionActual())
                        +", idCalificacionConjunta=" + this.getIdCalificacionConjunta()
                        +", conjuntaActual=" + simplifyPolitics(this.getConjuntaActual())
                        +"]";
    }

    public String politicaObjetivosToString() {
        return "Politica [idPolitica=" + this.getIdPolitica()
                        +",autoevaluacionObjetivos=" + simplifyPolitics(this.getAutoevaluacionObjetivos())
                        +", conjuntaObjetivos=" + simplifyPolitics(this.getConjuntaObjetivos())
                        +"]";
    }

    public String simplifyPolitics(String politica){
        if(politica != null){
            if(politica.length() > 50){
                String simply = politica.substring(0, 50).replaceAll("\n", "\t");
                return "\"" + simply + " ...\" y " + (politica.length()-50) + " caracteres más.";
            }else{
                return politica;
            }
        }
        return null;
    }
}

package com.imagosur.domain;

public class DeseoEvolucionJ {
    private Puesto puestoActual;
    private Sector sectorActual;
    private Puesto puestoDeseado;
    private Long idPuestoDeseado;
    private Sector sectorDeseado;
    private Long idSectorDeseado;
    private Long idDeseoEvolucionProyeccion;
    private String descripcionDeseoEvolucionProyeccion;
    private String comentariosDeseos;
    private String comentariosPlan;
    private String comentariosEvaluacion;

    public Puesto getPuestoDeseado() {
        return puestoDeseado;
    }

    public void setPuestoDeseado(Puesto puestoDeseado) {
        this.puestoDeseado = puestoDeseado;
    }

    public Sector getSectorDeseado() {
        return sectorDeseado;
    }

    public void setSectorDeseado(Sector sectorDeseado) {
        this.sectorDeseado = sectorDeseado;
    }

    public Long getIdDeseoEvolucionProyeccion() {
        return idDeseoEvolucionProyeccion;
    }

    public void setIdDeseoEvolucionProyeccion(Long idDeseoEvolucionProyeccion) {
        this.idDeseoEvolucionProyeccion = idDeseoEvolucionProyeccion;
    }

    public String getDescripcionDeseoEvolucionProyeccion() {
        return descripcionDeseoEvolucionProyeccion;
    }

    public void setDescripcionDeseoEvolucionProyeccion(String descripcionDeseoEvolucionProyeccion) {
        this.descripcionDeseoEvolucionProyeccion = descripcionDeseoEvolucionProyeccion;
    }

    public String getComentariosDeseos() {
        return comentariosDeseos;
    }

    public void setComentariosDeseos(String comentariosDeseos) {
        this.comentariosDeseos = comentariosDeseos;
    }

    public String getComentariosPlan() {
        return comentariosPlan;
    }

    public void setComentariosPlan(String comentariosPlan) {
        this.comentariosPlan = comentariosPlan;
    }

    public Puesto getPuestoActual() {
        return puestoActual;
    }

    public void setPuestoActual(Puesto puestoActual) {
        this.puestoActual = puestoActual;
    }

    public Sector getSectorActual() {
        return sectorActual;
    }

    public void setSectorActual(Sector sectorActual) {
        this.sectorActual = sectorActual;
    }

    public String getComentariosEvaluacion() {
        return comentariosEvaluacion;
    }

    public void setComentariosEvaluacion(String comentariosEvaluacion) {
        this.comentariosEvaluacion = comentariosEvaluacion;
    }

    public Long getIdPuestoDeseado() {
        return idPuestoDeseado;
    }

    public void setIdPuestoDeseado(Long idPuestoDeseado) {
        this.idPuestoDeseado = idPuestoDeseado;
    }

    public Long getIdSectorDeseado() {
        return idSectorDeseado;
    }

    public void setIdSectorDeseado(Long idSectorDeseado) {
        this.idSectorDeseado = idSectorDeseado;
    }

    @Override
    public String toString() {
        return "DeseoEvolucionJ [puestoActual=" + puestoActual + ", sectorActual=" + sectorActual + ", puestoDeseado=" + puestoDeseado
                + ", sectorDeseado=" + sectorDeseado + ", idDeseoEvolucionProyeccion=" + idDeseoEvolucionProyeccion + "]";
    }

    public String DeseoEvolucionForLog(){
        return "DeseoEvolucionJ [idPuestoDeseado=" + idPuestoDeseado + ", idSectorDeseado=" + idSectorDeseado 
                + ", idDeseoEvolucionProyeccion=" + idDeseoEvolucionProyeccion
                + ", comentariosDeseos=" + simplifyEvolutionWish(comentariosDeseos) + ", comentariosPlan=" + simplifyEvolutionWish(comentariosPlan) + "]";
    }

    public String simplifyEvolutionWish(String deseo){
        if(deseo != null){
            if(deseo.length() > 50){
                String simply = deseo.substring(0, 50).replaceAll("\n", "\t");
                return "\"" + simply + "...\" y " + (deseo.length() - 50) + " caracteres más.";
            }else{
                return deseo;
            }
        }else{
            return null;
        }
    }
}

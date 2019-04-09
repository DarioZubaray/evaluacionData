package com.imagosur.domain;

public class EstadoEvaluado {
    private Long idEstadoEvaluado;
    private String descripcion;

    public enum EstadoEvaluadoEnum {
        AUTOEVALUACION_EN_CURSO(0L), 
        AUTOEVALUACION_FINALIZADA(1L), 
        EXCEPTUADO(2L);

        private Long idEstado;

        EstadoEvaluadoEnum(Long idEstado) {
            this.idEstado = idEstado;
        }

        public Long getIdEstado(){
            return this.idEstado;
        }

        public static EstadoEvaluadoEnum getEstadoEvaluado(Long idEstado){
            for(EstadoEvaluadoEnum t : EstadoEvaluadoEnum.values()){
                if(t.getIdEstado().equals(idEstado)) return t;
            }
            return null;
        }
    }

    public Long getIdEstadoEvaluado() {
        return idEstadoEvaluado;
    }

    public void setIdEstadoEvaluado(Long idEstadoEvaluado) {
        this.idEstadoEvaluado = idEstadoEvaluado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "EstadoEvaluado [idEstadoEvaluado=" + idEstadoEvaluado + ", descripcion=" + descripcion + "]";
    }
}


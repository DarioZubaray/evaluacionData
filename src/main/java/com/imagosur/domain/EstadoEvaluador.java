package com.imagosur.domain;

public class EstadoEvaluador {
    private Long idEstadoEvaluador;
    private String descripcion;

    public enum EstadoEvaluadorEnum {
        AUTOEVALUACION_EN_CURSO(0L), 
        EVALUACION_CONJUNTA_PENDIENTE(1L), 
        EVALUACION_CONJUNTA_EN_CURSO(2L),
        EVALUACION_POTENCIAL_PENDIENTE(3L),
        EVALUACION_POTENCIAL_EN_CURSO(4L),
        EVALUACION_FINALIZADA(5L);

        private Long idEstado;

        EstadoEvaluadorEnum(Long idEstado) {
            this.idEstado = idEstado;
        }

        public Long getIdEstado(){
            return this.idEstado;
        }

        public static EstadoEvaluadorEnum getEstadoEvaluador(Long idEstado){
            for(EstadoEvaluadorEnum t : EstadoEvaluadorEnum.values()){
                if(t.getIdEstado().equals(idEstado)) return t;
            }
            return null;
        }
    }

    public Long getIdEstadoEvaluador() {
        return idEstadoEvaluador;
    }

    public void setIdEstadoEvaluador(Long idEstadoEvaluador) {
        this.idEstadoEvaluador = idEstadoEvaluador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "EstadoEvaluador [idEstadoEvaluador=" + idEstadoEvaluador + ", descripcion=" + descripcion + "]";
    }
}


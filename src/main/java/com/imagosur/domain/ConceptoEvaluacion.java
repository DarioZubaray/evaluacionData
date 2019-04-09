package com.imagosur.domain;

public enum ConceptoEvaluacion {
    TAREA(TipoConvenio.EN_CONVENIO), COMPETENCIA(TipoConvenio.EN_CONVENIO);

    private TipoConvenio tipoConvenio;

    ConceptoEvaluacion(TipoConvenio tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public TipoConvenio getTipoConvenio() {
        return tipoConvenio;
    }
}

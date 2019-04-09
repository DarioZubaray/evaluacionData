package com.imagosur.domain;

public enum TemplateXsl {
    EVALUADO_CONVENIO("evaluado.xsl"),
    EVALUADOR_CONVENIO("evaluador.xsl"),
    POTENCIAL_CONVENIO("evaluadoCPotencial.xsl"),
    EVALUADO_JERARQUICO("evaluadoJ.xsl"),
    EVALUADOR_JERARQUICO("evaluadoJ.xsl"),
    POTENCIAL_JERARQUICO("evaluadoJPotencial.xsl"),
    EVALUADO_JERARQUICO_BSF("evaluadoJ.xsl"),
    EVALUADOR_JERARQUICO_BSF("evaluadoJ.xsl"),
    POTENCIAL_JERARQUICO_BSF("evaluadoJPotencial.xsl"),
    EVALUADO_CORPORATIVO("evaluadoCorporativo.xsl"),
    EVALUADOR_CORPORATIVO("evaluadoCorporativo.xsl"),
    POTENCIAL_CORPORATIVO("evaluadoPotencialCorporativo.xsl");

    private String template;

    TemplateXsl(String t){
        this.template = t;
    }

    public String get() {
        return template;
    }
}

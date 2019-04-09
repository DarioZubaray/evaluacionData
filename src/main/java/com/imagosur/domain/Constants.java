package com.imagosur.domain;

public class Constants {

    public static final String SESS_LOGGED_USER = "LoggedUser";
    public static final String SESS_LOGGED_USER_KEY = "LoggedUserKey";
    public static final String USUARIO_NO_LOGUEADO = "usuarioNoLogueado";
    public static final String CONTROLADO = "controlado";

    public static final String PLANTILLA_CONVENIO = "1";
    public static final String PLANTILLA_JERARQUICO = "2";
    public static final String PLANTILLA_BSF = "4";
    public static final String PLANTILLA_CORPORATIVA = "6";
    public static final int IDPLANTILLA_CONVENIO = 1;
    public static final int IDPLANTILLA_JERARQUICO = 2;
    public static final int IDPLANTILLA_BSF = 4;
    public static final int IDPLANTILLA_CORPORATIVA = 6;

    public static final int TIPO_EVALUADO = 0;
    public static final int TIPO_EVALUADOR = 1;
    public static final int TIPO_POTENCIAL = 2;
    public static final int EVALUADO_CONVENIO = 0;
    public static final int EVALUADO_JERARQUICO = 1;
    public static final String EVALUACION_ACTIVA = "0";
    public static final String EVALUACION_INACTIVA= "1";
    public static final String POTENCIAL = "potencial";
    public static final String SIN_POTENCIAL = "sin potencial";

    public static final int TIPO_EVALUACION_EVALUADO = 1;
    public static final int TIPO_EVALUACION_EVALUADOR = 2;
    public static final int TIPO_EVALUACION_POTENCIAL = 3;
    public static final int TIPO_EVALUACION_EVALUADO_JERARQUICO = 4;
    public static final int TIPO_EVALUACION_EVALUADOR_JERARQUICO = 5;
    public static final int TIPO_EVALUACION_POTENCIAL_JERARQUICO = 6;
    public static final int TIPO_EVALUACION_EVALUADO_JERARQUICO_BSF = 7;
    public static final int TIPO_EVALUACION_EVALUADOR_JERARQUICO_BSF = 8;
    public static final int TIPO_EVALUACION_POTENCIAL_JERARQUICO_BSF = 9;
    public static final int TIPO_EVALUACION_EVALUADO_CORPORATIVO = 10;
    public static final int TIPO_EVALUACION_EVALUADOR_CORPORATIVO = 11;
    public static final int TIPO_EVALUACION_POTENCIAL_CORPORATIVO = 12;

    public static final String FILTRO_ACTIVO = "0";
    public static final String FILTRO_CATEGORIA_INACTIVO = "";
    public static final String FILTRO_CATEGORIA_ACTIVO = "1";
    public static final String FILTRO_CECOSTE_ACTIVO = "1";
    public static final String FILTRO_CECOSTE_INACTIVO = "";
    public static final String FILTRO_DESCRIPCION_INACTIVO = "";
    public static final String FILTRO_DESCRIPCION_PUESTO_ACTIVO = "2";
    public static final String FILTRO_DESCRIPCION_SECTOR_ACTIVO = "2";
    public static final String FILTRO_CATEGORIA_DESCRIPCION_PUESTO_ACTIVO = "3";
    public static final String FILTRO_CECOSTE_DESCRIPCION_SECTOR_ACTIVO = "3";

    public static final String ASTERISK_DELIMITER = "[*]";
    public static final String PIPE_DELIMITER = "[|]";
    public static final String NUMBER_DELIMITER = "[#]";

    public static final String ROL_EVALUADO = "evaluado";
    public static final String ROL_EVALUADOR = "evaluador";
    public static final String LADO_AUTOEVALUACION = "AutoEvaluacion";
    public static final String LADO_AUTOEVALUADO = "autoEvaluado";
    public static final String LADO_CONJUNTO = "conjunto";
    public static final String ORIGEN_INICIO = "inicio";
    public static final String ORIGEN_LIST_EVALUACIONES = "listEvaluaciones";
    public static final Boolean AUTOEVALUACION_EVALUADO = true;
    public static final Boolean EVALUADOR_CONJUNTO = false;

    public static final String FORTALEZA_COMPETENCIAS = "1";
    public static final String FORTALEZA_HABILIDADES = "2";
    public static final String OPORTUNIDADES_COMPETENCIAS = "1";
    public static final String OPORTUNIDADES_HABILIDADES = "2";
    public static final Integer ID_FORTALEZA_COMPETENCIAS = 1;
    public static final Integer ID_FORTALEZA_HABILIDADES = 2;
    public static final Integer ID_OPORTUNIDADES_COMPETENCIAS = 1;
    public static final Integer ID_OPORTUNIDADES_HABILIDADES = 2;

    public static final Long MOVIMIENTO_POTENCIAL_INACTIVO = 0L;

    public class EvaluacionEnConvenio {
        private EvaluacionEnConvenio() {}

        public static final int MIN_PROMEDIO_COMPETENCIATAREA = 1;
        public static final int MAX_PROMEDIO_COMPETENCIATAREA = 3;
        public static final int CANTIDAD_VALORES_COMPETENCIATAREA = 3;
    }

    public static final Long TIPO_FORTALEZA_COMPETENCIA = 1L;
    public static final Long TIPO_FORTALEZA_HABILIDAD = 2L;
    public static final Long TIPO_OPORTUNIDAD_COMPETENCIA = 1L;
    public static final Long TIPO_OPORTUNIDAD_HABILIDAD = 2L;
    public static final String FORTALEZA_COMPETENCIA_AUTOEVALUACION = "fcauto";
    public static final String FORTALEZA_COMPETENCIA_CONJUNTA = "fcconj";
    public static final String FORTALEZA_HABILIDAD_AUTOEVALUACION = "fhauto";
    public static final String FORTALEZA_HABILIDAD_CONJUNTA = "fhconj";
    public static final String OPORTUNIDAD_COMPETENCIA_AUTOEVALUACION = "ocauto";
    public static final String OPORTUNIDAD_COMPETENCIA_CONJUNTA = "occonj";
    public static final String OPORTUNIDAD_HABILIDAD_AUTOEVALUACION = "ohauto";
    public static final String OPORTUNIDAD_HABILIDAD_CONJUNTA = "ohconj";


    public static final boolean EXPORTACION_CONSOLIDADO_FORMATO_EXCEL = false;
    public static final boolean EXPORTACION_CONSOLIDADO_FORMATO_TXT = true;
    public static final String EXPORTACION_CONSOLIDADO_EN_PROCESO = "EN PROCESO";
    public static final String EXPORTACION_CONSOLIDADO_DESCARGAR = "DESCARGAR";
    public static final String EXPORTACION_CONSOLIDADO_FINALIZADO = "FINALIZADO";
    public static final String EXPORTACION_CONSOLIDADO_ERROR = "ERROR";
    public static final int EXPORTACION_EN_PROCESO = 1;
    public static final int EXPORTACION_DESCARGAR = 2;
    public static final int EXPORTACION_FINALIZADO = 3;
    public static final int EXPORTACION_ERROR = 4;

    public static final String MSG_ERROR_LINEA = "<div>Se ha producido un error  al procesar la linea ";
    public static final String MSG_INFO_INCONSISTENTE = "<div>Exite información inconsistente en el Excel:</div>";
    public static final String MSG_ERROR_GRAL = "<div>Error General de importación:</div><div>";
}

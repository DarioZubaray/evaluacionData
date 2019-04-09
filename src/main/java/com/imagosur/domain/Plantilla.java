package com.imagosur.domain;

public class Plantilla {
    public static final Long CONVENIO = 1L;
    public static final Long JERARQUICO = 2L;
    public static final Long BSF = 4L;
    public static final Long CORPORATIVO = 6L;

    private Long idPlantilla;
    private String descripcionPlantilla;
    private Long inactivo;
    private Long fueraConvenio;

    public Long getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getDescripcionPlantilla() {
        return descripcionPlantilla;
    }

    public void setDescripcionPlantilla(String descripcionPlantilla) {
        this.descripcionPlantilla = descripcionPlantilla;
    }

    public Long getInactivo() {
        return inactivo;
    }

    public void setInactivo(Long inactivo) {
        this.inactivo = inactivo;
    }

    public Long getFueraConvenio() {
        return fueraConvenio;
    }
    
    public void setFueraConvenio(Long fueraConvenio) {
        this.fueraConvenio = fueraConvenio;
    }

    public TipoConvenio getTipoConvenio() {
        TipoConvenio tipo = null ;
        if ( this.fueraConvenio == 0L ) {
            tipo = TipoConvenio.EN_CONVENIO; 
        }
        if ( this.fueraConvenio == 1L ) {
            tipo = TipoConvenio.JERARQUICO ; 
        }
        if ( this.fueraConvenio == 2L ) {
            tipo = TipoConvenio.BSF ;
        }
         if ( this.fueraConvenio == 5L ){ 
            tipo = TipoConvenio.IMAGO ;
         } 
         if ( this.fueraConvenio == 6L) {
              tipo = TipoConvenio.CORPORATIVA ; 
         }
         
         return tipo;
     }

    @Override
    public String toString() {
        return "Plantilla [idPlantilla=" + idPlantilla + ", descriptcionPlantilla=" + descripcionPlantilla + ", inactivo=" + inactivo + "]";
    }

}

package com.imagosur.domain;

import com.imagosur.domain.composite.EvaluacionPdfCompositeId;

public class EvaluacionPdf {

    private EvaluacionPdfCompositeId idEvaluacionPdf;
    private Integer idLegajoEvaluador;
    private byte[] archivoEvaluadoPdf;
    private byte[] archivoEvaluadorPdf;
    private byte[] archivoPotencialPdf;

    public Integer getIdLegajoEvaluador() {
        return idLegajoEvaluador;
    }

    public void setIdLegajoEvaluador(Integer idLegajoEvaluador) {
        this.idLegajoEvaluador = idLegajoEvaluador;
    }

    public byte[] getArchivoEvaluadoPdf() {
        return archivoEvaluadoPdf;
    }

    public void setArchivoEvaluadoPdf(byte[] archivoEvaluadoPdf) {
        this.archivoEvaluadoPdf = archivoEvaluadoPdf;
    }

    public byte[] getArchivoEvaluadorPdf() {
        return archivoEvaluadorPdf;
    }

    public void setArchivoEvaluadorPdf(byte[] archivoEvaluadorPdf) {
        this.archivoEvaluadorPdf = archivoEvaluadorPdf;
    }

    public EvaluacionPdfCompositeId getIdEvaluacionPdf() {
        return idEvaluacionPdf;
    }

    public void setIdEvaluacionPdf(EvaluacionPdfCompositeId idEvaluacionPdf) {
        this.idEvaluacionPdf = idEvaluacionPdf;
    }

    public byte[] getArchivoPotencialPdf() {
        return archivoPotencialPdf;
    }

    public void setArchivoPotencialPdf(byte[] archivoPotencialPdf) {
        this.archivoPotencialPdf = archivoPotencialPdf;
    }

    @Override
    public String toString() {
        return "EvaluacionPdf [idEvaluacionPdf=" + idEvaluacionPdf + ", idLegajoEvaluador="
                + idLegajoEvaluador + "]";
    }
}

package com.tsystems.ecrono.dto;

public class Competitor {

    private Long idCorredor;
    private String nombreCorredor;
    private int dorsalNumber;

    public Long getIdCorredor() {
	return idCorredor;
    }

    public void setIdCorredor(Long idCorredor) {
	this.idCorredor = idCorredor;
    }

    public String getNombreCorredor() {
	return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
	this.nombreCorredor = nombreCorredor;
    }

    public int getDorsalNumber() {
	return dorsalNumber;
    }

    public void setDorsalNumber(int dorsalNumber) {
	this.dorsalNumber = dorsalNumber;
    }

}

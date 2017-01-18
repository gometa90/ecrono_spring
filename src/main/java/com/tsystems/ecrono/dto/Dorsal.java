package com.tsystems.ecrono.dto;

public class Dorsal {

    private Long raceId;
    private Long runnerId;
    private String chipCode;
    private int dorsalNumber;

    public Long getRaceId() {
	return raceId;
    }

    public void setRaceId(Long raceId) {
	this.raceId = raceId;
    }

    public Long getRunnerId() {
	return runnerId;
    }

    public void setRunnerId(Long runnerId) {
	this.runnerId = runnerId;
    }

    public String getChipCode() {
	return chipCode;
    }

    public void setChipCode(String chipCode) {
	this.chipCode = chipCode;
    }

    public int getDorsalNumber() {
	return dorsalNumber;
    }

    public void setDorsalNumber(int dorsalNumber) {
	this.dorsalNumber = dorsalNumber;
    }

}

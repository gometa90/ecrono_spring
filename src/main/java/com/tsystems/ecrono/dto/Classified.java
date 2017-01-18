package com.tsystems.ecrono.dto;

import java.time.Instant;

public class Classified {

    private Long runnerId;
    private String runnerName;
    private Instant runnerTime;
    private int dorsalNumber;

    public Long getRunnerId() {
	return runnerId;
    }

    public void setRunnerId(Long runnerId) {
	this.runnerId = runnerId;
    }

    public String getRunnerName() {
	return runnerName;
    }

    public void setRunnerName(String runnerName) {
	this.runnerName = runnerName;
    }

    public Instant getRunnerTime() {
	return runnerTime;
    }

    public void setRunnerTime(Instant runnerTime) {
	this.runnerTime = runnerTime;
    }

    public int getDorsalNumber() {
	return dorsalNumber;
    }

    public void setDorsalNumber(int dorsalNumber) {
	this.dorsalNumber = dorsalNumber;
    }

}

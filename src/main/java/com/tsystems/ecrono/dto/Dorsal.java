package com.tsystems.ecrono.dto;

import com.tsystems.ecrono.domain.RunnerEntity;

public class Dorsal {

    private Long raceId;
    private RunnerEntity runner;

    public Long getRaceId() {
	return raceId;
    }

    public void setRaceId(Long raceId) {
	this.raceId = raceId;
    }

    public RunnerEntity getRunner() {
	return runner;
    }

    public void setRunner(RunnerEntity runner) {
	this.runner = runner;
    }

}

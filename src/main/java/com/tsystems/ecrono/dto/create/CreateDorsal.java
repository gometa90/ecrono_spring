package com.tsystems.ecrono.dto.create;

import com.tsystems.ecrono.domain.RunnerEntity;

public class CreateDorsal {

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

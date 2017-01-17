package com.tsystems.ecrono.dto.create;

import java.time.Instant;

import com.tsystems.ecrono.domain.component.RaceType;

public class CreateRace {

    private Long id;
    private String name;
    private RaceType type;
    private Instant initTime;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public RaceType getType() {
	return type;
    }

    public void setType(RaceType type) {
	this.type = type;
    }

    public Instant getInitTime() {
	return initTime;
    }

    public void setInitTime(Instant initTime) {
	this.initTime = initTime;
    }

}

package com.tsystems.ecrono.dto;

import com.tsystems.ecrono.domain.component.RaceType;

public class Race {

    private Long id;
    private String name;
    private RaceType type;
    private String initTime;
    private int distanceInMeters;

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

    public String getInitTime() {
	return initTime;
    }

    public void setInitTime(String formatDate) {
	this.initTime = formatDate;
    }

    public int getDistanceInMeters() {
	return distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters) {
	this.distanceInMeters = distanceInMeters;
    }

}

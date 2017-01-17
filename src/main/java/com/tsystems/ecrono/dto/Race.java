package com.tsystems.ecrono.dto;

import com.tsystems.ecrono.domain.component.RaceType;

public class Race {

    private Long id;
    private String name;
    private RaceType type;
    private String init_time;

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

    public String getInit_time() {
	return init_time;
    }

    public void setInit_time(String formatDate) {
	this.init_time = formatDate;
    }

}

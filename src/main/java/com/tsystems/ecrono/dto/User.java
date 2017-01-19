package com.tsystems.ecrono.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("user_name")
    private Long id;
    private String userName;
    // Es un dato privado que no debe mostrarse por la API o UI: private String
    // password;
    private Set<String> role;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public Set<String> getRole() {
	return role;
    }

    public void setRole(Set<String> role) {
	this.role = role;
    }
}

package com.tsystems.ecrono.dto.create;

import java.util.Set;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CreateUser {

    @NotEmpty
    @JsonProperty("user_name")
    private String userName;
    @NotEmpty
    private String password;
    @NotEmpty
    @Size(min = 1)
    private Set<String> role;

}

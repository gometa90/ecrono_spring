package com.tsystems.ecrono.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.dto.User;
import com.tsystems.ecrono.dto.create.CreateUser;
import com.tsystems.ecrono.usercase.CrudUserUserCase;

@RestController
@RequestMapping("users")
public class UserController {

    private final CrudUserUserCase crudUserUserCase;

    @Autowired
    public UserController(CrudUserUserCase crudUseruserCase) {
	super();
	this.crudUserUserCase = crudUseruserCase;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> createNewUser(@RequestBody @Valid CreateUser createUser) {

	return new ResponseEntity<User>(crudUserUserCase.createUser(createUser), HttpStatus.CREATED);
    }

}

package com.tsystems.ecrono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.dto.Classified;
import com.tsystems.ecrono.usercase.GetClassificationUserCase;

@RestController
@RequestMapping("races")
public class HClassificationController {

    private final GetClassificationUserCase getClassificationUserCase;

    @Autowired
    public HClassificationController(GetClassificationUserCase getClassificationUserCase) {
	super();
	this.getClassificationUserCase = getClassificationUserCase;
    }

    @RequestMapping(value = "/classified/{id:\\d+}", method = RequestMethod.GET)
    public List<Classified> getClassified(@PathVariable("id") Long raceId) {

	return getClassificationUserCase.getClassified(raceId);

    }

}

package com.tsystems.ecrono.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.dto.Competitor;
import com.tsystems.ecrono.usercase.ClassificationInRaceUserCase;

@RestController
@RequestMapping("races")
public class CompetitorController {

    private final ClassificationInRaceUserCase classificationInRaceUserCase;

    public CompetitorController(ClassificationInRaceUserCase classificationInRaceUserCase) {
	super();
	this.classificationInRaceUserCase = classificationInRaceUserCase;
    }

    @RequestMapping(value = "{id:\\d+}/competitors", method = RequestMethod.GET)
    public List<Competitor> getRunnersInRace(@PathVariable("id") Long raceId, Principal usuario) {

	return classificationInRaceUserCase.getCompetitorsInRace(raceId);
    }

}

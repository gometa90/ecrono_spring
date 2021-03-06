package com.tsystems.ecrono.controller.races;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.domain.component.RaceType;
import com.tsystems.ecrono.dto.Race;
import com.tsystems.ecrono.dto.create.CreateRace;
import com.tsystems.ecrono.dto.update.UpdateRace;
import com.tsystems.ecrono.usercase.CrudRaceUserCase;

@RestController
@RequestMapping("races")
public class RaceController {

    private final CrudRaceUserCase crudRaceUserCase;

    @Autowired
    public RaceController(CrudRaceUserCase crudRaceUserCase) {
	super();
	this.crudRaceUserCase = crudRaceUserCase;
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<Race> getRaces() {

	return crudRaceUserCase.findAll();

    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.GET)
    public Race getRacesById(@PathVariable("id") Long raceId) {

	return crudRaceUserCase.getRaceById(raceId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Race createRace(@RequestBody CreateRace createRace) {
	return crudRaceUserCase.createNewRace(createRace);
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.PUT)
    public Race editRace(@PathVariable("id") Long runnerId, @RequestBody UpdateRace updateRace) {
	return crudRaceUserCase.updateRace(runnerId, updateRace);
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.DELETE)
    public void deleteRace(@PathVariable("id") Long raceId) {
	crudRaceUserCase.delete(raceId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Race> getRacesByTypeAndPreviousDate(
	    @RequestParam(value = "racetype", required = false) RaceType raceType,
	    @RequestParam(value = "date") Instant previousDate) {

	return crudRaceUserCase.getRaceByTypeAndPreviousDate(raceType, previousDate);

    }

}

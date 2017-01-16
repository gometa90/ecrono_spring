package com.tsystems.ecrono.controller.races;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.dto.Race;

@RestController
@RequestMapping("races")
public class RaceController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Race> getRaces() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.GET)
    public Race getRacesById(@PathVariable("id") Long raceId) {

	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(method = RequestMethod.POST)
    public Race createRace() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.PUT)
    public Race editRace() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.DELETE)
    public void deleteRace() {
	throw new IllegalArgumentException("Not implemented yet");
    }
}

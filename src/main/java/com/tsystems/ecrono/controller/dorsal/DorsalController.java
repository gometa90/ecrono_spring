package com.tsystems.ecrono.controller.dorsal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.dto.Dorsal;

@RestController
@RequestMapping("dorsals")
public class DorsalController {

    @RequestMapping(method = RequestMethod.POST)
    public Dorsal createDorsal(@PathVariable("id") Long raceId, @PathVariable("id") Long runnerId) {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.DELETE)
    public void deleteDorsal() {
	throw new IllegalArgumentException("Not implemented yet");
    }

}

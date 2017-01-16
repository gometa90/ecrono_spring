package com.tsystems.ecrono.controller.runner;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.dto.Runner;

@RestController
@RequestMapping("runners")
public class RunnerController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Runner> getRunners() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.GET)
    public Runner getRunnersById(@PathVariable("id") Long raceId) {

	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(method = RequestMethod.POST)
    public Runner createRunners() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.PUT)
    public Runner editRunners() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.DELETE)
    public void deleteRunners() {
	throw new IllegalArgumentException("Not implemented yet");
    }
}

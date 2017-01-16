package com.tsystems.ecrono.controller.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.domain.RunnerEntity;
import com.tsystems.ecrono.repository.RunnerRepository;

@RestController
@RequestMapping("runners")
public class RunnerController {

    private final RunnerRepository runnerRepository;

    @Autowired
    public RunnerController(RunnerRepository runnerRepository) {
	super();
	this.runnerRepository = runnerRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RunnerEntity> getRunners() {
	return runnerRepository.findAll();
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.GET)
    public RunnerEntity getRunnersById(@PathVariable("id") Long runnerId) {

	return runnerRepository.findOne(runnerId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public RunnerEntity createRunners(@RequestParam(name = "fullname", required = true) String fullName) {
	RunnerEntity runnerEntity = new RunnerEntity();
	runnerEntity.setFullName(fullName);
	runnerRepository.save(runnerEntity);
	return runnerEntity;
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.PUT)
    public RunnerEntity editRunners() {
	throw new IllegalArgumentException("Not implemented yet");
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.DELETE)
    public void deleteRunners() {
	throw new IllegalArgumentException("Not implemented yet");
    }
}

package com.tsystems.ecrono.usercase;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.ecrono.domain.RunnerEntity;
import com.tsystems.ecrono.dto.Runner;
import com.tsystems.ecrono.dto.create.CreateRunner;
import com.tsystems.ecrono.dto.update.UpdateRunner;
import com.tsystems.ecrono.mapper.RunnerMapper;
import com.tsystems.ecrono.repository.RunnerRepository;

@Service
public class CrudRunnerUserCase {

    private final RunnerRepository runnerRepository;
    private final RunnerMapper mapper;

    @Autowired
    public CrudRunnerUserCase(RunnerRepository runnerRepository, RunnerMapper mapper) {
	super();
	this.runnerRepository = runnerRepository;
	this.mapper = mapper;
    }

    public Runner getRunnerById(Long runnerId) {
	RunnerEntity runnerToReturn = runnerRepository.findOne(runnerId);

	return mapper.toRunner(runnerToReturn);
    }

    public Runner createNewRunner(CreateRunner createRunner) {

	RunnerEntity runnerToCreate = mapper.toRunnerEntity(createRunner);
	runnerRepository.save(runnerToCreate);
	return mapper.toRunner(runnerToCreate);

    }

    public Runner updateRunner(Long idRunner, UpdateRunner updateRunner) {

	RunnerEntity runnerToUpdate = runnerRepository.findOne(idRunner);
	mapper.updateRunnerEntity(updateRunner, runnerToUpdate);
	return mapper.toRunner(runnerToUpdate);
    }

    public List<Runner> findAll() {
	List<RunnerEntity> runnerList = runnerRepository.findAll();
	List<Runner> listToReturn = new LinkedList<>();
	for (RunnerEntity runner : runnerList) {
	    listToReturn.add(mapper.toRunner(runner));
	}

	// Nueva forma de hacer lo mismo pero en java8
	// return runnerList.parallelStream()//
	// .map(r-> mapper.toRunner(r)).collect(Collectors.toList());

	return listToReturn;
    }

    public void delete(Long runnerId) {
	runnerRepository.delete(runnerId);
    }

    // Método que lista los runners que contengan cierta cadena en su nombre
    public List<Runner> findBySubString(String subString) {
	List<RunnerEntity> runnerList = runnerRepository.findByFullNameContains(subString);
	List<Runner> listToReturn = new LinkedList<>();
	for (RunnerEntity runner : runnerList) {

	    listToReturn.add(mapper.toRunner(runner));

	}
	return listToReturn;
    }

}

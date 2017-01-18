package com.tsystems.ecrono.controller.dorsal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.ecrono.DuplicatedEntityException;
import com.tsystems.ecrono.dto.Dorsal;
import com.tsystems.ecrono.dto.create.CreateDorsal;
import com.tsystems.ecrono.usercase.CrudDorsalUserCase;

@RestController
@RequestMapping("dorsals")
public class DorsalController {

    private final CrudDorsalUserCase crudDorsalUserCase;

    public DorsalController(CrudDorsalUserCase crudDorsalUserCase) {
	super();
	this.crudDorsalUserCase = crudDorsalUserCase;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Dorsal> createDorsal(@RequestBody CreateDorsal createDorsal) {

	try {
	    return new ResponseEntity<Dorsal>(crudDorsalUserCase.createDorsal(createDorsal), HttpStatus.CREATED);
	} catch (DuplicatedEntityException e) {
	    return new ResponseEntity<Dorsal>(HttpStatus.CONFLICT);
	}
    }

    @RequestMapping(value = "{raceid:\\d+}/{runnerid:\\d+}", method = RequestMethod.DELETE)
    public void deleteDorsal(@RequestParam(value = "raceid") Long raceId,
	    @RequestParam(value = "runnerid") Long runnerId) {
	crudDorsalUserCase.delete(raceId, runnerId);
    }

}

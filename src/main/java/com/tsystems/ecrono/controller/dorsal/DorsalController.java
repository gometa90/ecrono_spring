package com.tsystems.ecrono.controller.dorsal;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public Dorsal createDorsal(@RequestBody CreateDorsal createDorsal) {

	return crudDorsalUserCase.createDorsal(createDorsal);
    }

    @RequestMapping(value = "{id:\\d+}", method = RequestMethod.DELETE)
    public void deleteDorsal() {
	throw new IllegalArgumentException("Not implemented yet");
    }

}

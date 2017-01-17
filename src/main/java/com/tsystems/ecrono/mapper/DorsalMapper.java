package com.tsystems.ecrono.mapper;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.dto.Dorsal;
import com.tsystems.ecrono.dto.create.CreateDorsal;
import com.tsystems.ecrono.dto.update.UpdateDorsal;

public class DorsalMapper {

    public Dorsal toDorsal(DorsalEntity dorsalToReturn) {
	Dorsal target = new Dorsal();
	target.setRaceId(dorsalToReturn.getRaceId());
	target.setRunner(dorsalToReturn.getRunner());
	;

	return target;
    }

    public DorsalEntity toDorsalEntity(CreateDorsal createDorsal) {
	DorsalEntity dorsalToCreate = new DorsalEntity();
	dorsalToCreate.setRaceId(createDorsal.getRaceId());
	dorsalToCreate.setRunner(createDorsal.getRunner());
	return dorsalToCreate;
    }

    public DorsalEntity updateDorsalEntity(UpdateDorsal updateDorsal, DorsalEntity dorsalToCreate) {
	dorsalToCreate.setRaceId(updateDorsal.getRaceId());
	dorsalToCreate.setRunner(updateDorsal.getRunner());
	return dorsalToCreate;
    }
}

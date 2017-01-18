package com.tsystems.ecrono.mapper;

import org.springframework.stereotype.Component;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.RunnerEntity;
import com.tsystems.ecrono.dto.Competitor;
import com.tsystems.ecrono.dto.Dorsal;
import com.tsystems.ecrono.dto.create.CreateDorsal;
import com.tsystems.ecrono.dto.update.UpdateDorsal;

@Component
public class DorsalMapper {

    public DorsalEntity toDorsalEntity(CreateDorsal source) {
	DorsalEntity target = new DorsalEntity();
	target.setRaceId(source.getRaceId());
	target.setChipCode(source.getChipCode());

	RunnerEntity runner = new RunnerEntity();
	runner.setId(source.getRunnerId());
	target.setRunner(runner);
	return target;
    }

    public Dorsal toDorsal(DorsalEntity source) {
	Dorsal target = new Dorsal();
	target.setRaceId(source.getRaceId());
	target.setChipCode(source.getChipCode());

	// RunnerEntity runner = new RunnerEntity();
	// runner.setId(source.getRunnerId());

	target.setRunnerId(source.getRunner().id);

	return target;
    }

    public DorsalEntity updateDorsalEntity(UpdateDorsal updateDorsal, DorsalEntity dorsalToCreate) {
	dorsalToCreate.setRaceId(updateDorsal.getRaceId());
	dorsalToCreate.setRunner(updateDorsal.getRunner());
	return dorsalToCreate;
    }

    public Competitor toCompetitor(DorsalEntity dorsalEntity) {
	Competitor competitor = new Competitor();
	competitor.setDorsalNumber(dorsalEntity.getDorsalNumber());
	competitor.setIdCorredor(dorsalEntity.getRunner().getId());
	competitor.setNombreCorredor(dorsalEntity.getRunner().getFullName());
	return competitor;
    }
}

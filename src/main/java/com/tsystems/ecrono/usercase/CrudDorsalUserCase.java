package com.tsystems.ecrono.usercase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.ecrono.DuplicatedEntityException;
import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.RunnerEntity;
import com.tsystems.ecrono.dto.Dorsal;
import com.tsystems.ecrono.dto.create.CreateDorsal;
import com.tsystems.ecrono.mapper.DorsalMapper;
import com.tsystems.ecrono.repository.DorsalRepository;

@Service
public class CrudDorsalUserCase {

    private final DorsalRepository dorsalRepository;
    private final DorsalMapper mapper;

    @Autowired
    public CrudDorsalUserCase(DorsalRepository dorsalRepository, DorsalMapper mapper) {
	super();
	this.dorsalRepository = dorsalRepository;
	this.mapper = mapper;
    }

    public Dorsal createDorsal(CreateDorsal createDorsal) throws DuplicatedEntityException {
	// TODO: Si el corredor está dado de alta, cómo lo soluciono?
	RunnerEntity runner = new RunnerEntity();
	runner.setId(createDorsal.getRunnerId());
	DorsalEntity dorsalInDb = dorsalRepository.findByRaceIdAndRunner(createDorsal.getRaceId(), runner);
	if (dorsalInDb == null) {
	    DorsalEntity dorsal = mapper.toDorsalEntity(createDorsal);
	    dorsalRepository.save(dorsal);
	    return mapper.toDorsal(dorsal);
	} else {
	    throw new DuplicatedEntityException("Ya existe un dorsal para ese par raceId-runnerId");
	}

    }

    // TODO: Delete

}

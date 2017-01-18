package com.tsystems.ecrono.usercase;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.dto.Competitor;
import com.tsystems.ecrono.mapper.DorsalMapper;
import com.tsystems.ecrono.repository.DorsalRepository;
import com.tsystems.ecrono.repository.RaceRepository;

@Service
public class ClassificationInRaceUserCase {

    private final DorsalMapper mapper;
    private final DorsalRepository dorsalRepository;

    @Autowired
    public ClassificationInRaceUserCase(RaceRepository raceRepository, DorsalMapper mapper,
	    DorsalRepository dorsalRepository) {
	super();
	this.mapper = mapper;
	this.dorsalRepository = dorsalRepository;
    }

    public List<Competitor> getCompetitorsInRace(Long raceId) {

	List<DorsalEntity> dorsalEntitiesInRaceList = dorsalRepository.findByRaceId(raceId);

	List<Competitor> competitorsInRaceList = new LinkedList<>();
	for (DorsalEntity dorsalEntity : dorsalEntitiesInRaceList) {
	    competitorsInRaceList.add(mapper.toCompetitor(dorsalEntity));
	}
	return competitorsInRaceList;

    }
}

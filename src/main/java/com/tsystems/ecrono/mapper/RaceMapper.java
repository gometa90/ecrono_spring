package com.tsystems.ecrono.mapper;

import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import com.tsystems.ecrono.domain.RaceEntity;
import com.tsystems.ecrono.domain.component.RaceType;
import com.tsystems.ecrono.dto.Race;
import com.tsystems.ecrono.dto.create.CreateRace;
import com.tsystems.ecrono.dto.update.UpdateRace;

@Component
public class RaceMapper {

    public Race toRace(RaceEntity raceToReturn) {
	Race target = new Race();
	target.setId(raceToReturn.getId());
	target.setName(raceToReturn.getName());
	target.setType(raceToReturn.getType());
	String formatDate = DateTimeFormatter.ISO_DATE_TIME.format(raceToReturn.getInit_time());
	target.setInit_time(formatDate);
	return target;
    }

    public RaceEntity toRaceEntity(CreateRace createRace) {
	RaceEntity raceToCreate = new RaceEntity();
	raceToCreate.setName(createRace.getName());
	raceToCreate.setType(createRace.getType());
	raceToCreate.setInit_time(createRace.getInitTime());
	return raceToCreate;
    }

    public RaceEntity updateRaceEntity(UpdateRace updateRace, RaceEntity raceToCreate) {
	raceToCreate.setName(updateRace.getName());
	raceToCreate.setType(updateRace.getType());
	raceToCreate.setInit_time(updateRace.getInitTime());
	return raceToCreate;
    }

    private int typeToMeters(RaceType raceType) {

	if (racetype = RaceType.HALF_MARATHON) {
	}
    }

}

package com.tsystems.ecrono.mapper;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Component;

import com.tsystems.ecrono.domain.RaceEntity;
import com.tsystems.ecrono.domain.component.RaceType;
import com.tsystems.ecrono.dto.Race;
import com.tsystems.ecrono.dto.create.CreateRace;
import com.tsystems.ecrono.dto.update.UpdateRace;

@Component
public class RaceMapper {

    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME.withLocale(Locale.UK)
	    .withZone(ZoneId.systemDefault());

    public Race toRace(RaceEntity raceToReturn) {
	Race target = new Race();
	target.setId(raceToReturn.getId());
	target.setName(raceToReturn.getName());
	target.setType(raceToReturn.getType());
	target.setDistanceInMeters(typeToMeters(raceToReturn.getType()));

	String formatDate = formatter.format(raceToReturn.getInitTime());
	target.setInitTime(formatDate);
	return target;
    }

    public RaceEntity toRaceEntity(CreateRace createRace) {
	RaceEntity raceToCreate = new RaceEntity();
	raceToCreate.setName(createRace.getName());
	raceToCreate.setType(createRace.getType());
	raceToCreate.setInitTime(createRace.getInitTime());
	return raceToCreate;
    }

    public RaceEntity updateRaceEntity(UpdateRace updateRace, RaceEntity raceToCreate) {
	raceToCreate.setName(updateRace.getName());
	raceToCreate.setType(updateRace.getType());
	raceToCreate.setInitTime(updateRace.getInitTime());
	return raceToCreate;
    }

    private int typeToMeters(RaceType raceType) {

	if (raceType.equals(RaceType.HALF_MARATHON)) {
	    return 21000;
	} else {
	    if (raceType.equals(RaceType.MARATHON)) {
		return 42000;
	    } else {
		if (raceType.equals(RaceType.SPRINT)) {
		    return 100;
		} else {
		    if (raceType.equals(RaceType.IRON_MAN)) {
			return 50000;
		    } else {
			throw new IllegalArgumentException("Argumento erróneo");
		    }
		}

	    }
	}

    }
}
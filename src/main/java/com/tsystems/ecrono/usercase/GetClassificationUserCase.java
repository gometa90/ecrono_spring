package com.tsystems.ecrono.usercase;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.dto.Classified;
import com.tsystems.ecrono.repository.ClassificationRepository;

@Service
public class GetClassificationUserCase {

    private final ClassificationRepository classificationRepository;

    @Autowired
    public GetClassificationUserCase(ClassificationRepository classificationRepository) {
	super();
	this.classificationRepository = classificationRepository;
    }

    public List<Classified> getClassified(Long raceId) {
	List<DorsalEntity> dorsalClassification = classificationRepository.getClassificationForRace(raceId);
	List<Classified> result = new LinkedList<>();

	for (DorsalEntity dorsalEntity : dorsalClassification) {
	    Classified classified = new Classified();
	    classified.setDorsalNumber(dorsalEntity.getDorsalNumber());
	    classified.setRunnerId(dorsalEntity.getRunner().getId());
	    classified.setRunnerName(dorsalEntity.getRunner().getFullName());
	    classified.setRunnerTime(dorsalEntity.getTimeStamp().iterator().next().getTimeStamp());

	    result.add(classified);
	}
	return result;
    }
}

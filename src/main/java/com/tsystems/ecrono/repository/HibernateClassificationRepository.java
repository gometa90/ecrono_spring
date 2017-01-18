package com.tsystems.ecrono.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsystems.ecrono.domain.DorsalEntity;

@Repository
@Transactional
public class HibernateClassificationRepository implements ClassificationRepository {

    private final EntityManager entityManager;

    @Autowired
    public HibernateClassificationRepository(EntityManager entityManager) {
	super();
	this.entityManager = entityManager;
    }

    @Override
    public List<DorsalEntity> getClassificationForRace(Long raceId) {

	return (List<DorsalEntity>) entityManager.unwrap(Session.class).createCriteria(DorsalEntity.class)//
		.add(Restrictions.eq("raceId", raceId))//
		.setFetchMode("runner", FetchMode.JOIN)//
		.setFetchMode("timeStamp", FetchMode.JOIN)//
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)//
		.list();
    }

}

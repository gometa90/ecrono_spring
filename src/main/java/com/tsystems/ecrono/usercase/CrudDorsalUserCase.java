package com.tsystems.ecrono.usercase;

import org.springframework.stereotype.Service;

import com.tsystems.ecrono.mapper.DorsalMapper;
import com.tsystems.ecrono.repository.DorsalRepository;

@Service
public class CrudDorsalUserCase {

    private final DorsalRepository dorsalRepository;
    private final DorsalMapper mapper;

    public CrudDorsalUserCase(DorsalRepository dorsalRepository, DorsalMapper mapper) {
	super();
	this.dorsalRepository = dorsalRepository;
	this.mapper = mapper;
    }

}

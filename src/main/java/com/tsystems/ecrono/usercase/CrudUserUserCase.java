package com.tsystems.ecrono.usercase;

import org.springframework.stereotype.Service;

import com.tsystems.ecrono.domain.UserEntity;
import com.tsystems.ecrono.dto.User;
import com.tsystems.ecrono.dto.create.CreateUser;
import com.tsystems.ecrono.mapper.UserMapper;
import com.tsystems.ecrono.repository.UserRepository;

@Service
public class CrudUserUserCase {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    public CrudUserUserCase(UserRepository userRepository, UserMapper mapper) {
	super();
	this.userRepository = userRepository;
	this.mapper = mapper;
    }

    public User createUser(CreateUser createUser) {
	UserEntity userToCreate = mapper.toUserEntity(createUser);
	userRepository.save(userToCreate);
	return mapper.toUser(userToCreate);

    }
}

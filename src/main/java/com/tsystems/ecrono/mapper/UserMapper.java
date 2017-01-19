package com.tsystems.ecrono.mapper;

import org.springframework.stereotype.Component;

import com.tsystems.ecrono.domain.UserEntity;
import com.tsystems.ecrono.dto.User;
import com.tsystems.ecrono.dto.create.CreateUser;

@Component
public class UserMapper {

    public UserEntity toUserEntity(CreateUser createUser) {

	UserEntity userEntityToReturn = new UserEntity();
	userEntityToReturn.setPassword(createUser.getPassword());
	userEntityToReturn.setRole(createUser.getRole());
	userEntityToReturn.setUserName(createUser.getUserName());
	return userEntityToReturn;
    }

    public User toUser(UserEntity userEntity) {

	User userToReturn = new User();
	userToReturn.setId(userEntity.getId());
	userToReturn.setRole(userEntity.getRole());
	userToReturn.setUserName(userEntity.getUserName());
	return userToReturn;
    }

}

package com.tsystems.ecrono.configuration;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tsystems.ecrono.configuration.component.MyUserDetails;
import com.tsystems.ecrono.domain.UserEntity;
import com.tsystems.ecrono.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
	super();
	this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

	UserEntity userInDb = userRepository.findByUserName(userName);

	if (userInDb != null) {
	    return new MyUserDetails(userInDb);
	} else {
	    throw new UsernameNotFoundException("Usuario no encontrado");
	}
    }

}

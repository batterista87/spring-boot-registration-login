package it.andrea.springboot.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import it.andrea.springboot.model.Role;
import it.andrea.springboot.model.User;
import it.andrea.springboot.repository.UserRepository;
import it.andrea.springboot.service.UserService;
import it.andrea.springboot.web.dto.UserRegistrationDTO;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDTO userRegistrationDTO) {
		User user = new User(userRegistrationDTO.getFirstName(), userRegistrationDTO.getLastName(), userRegistrationDTO.getEmail(), userRegistrationDTO.getPassword(), Arrays.asList(new Role("USER_ROLE")));
		
		return userRepository.save(user);
	}

}

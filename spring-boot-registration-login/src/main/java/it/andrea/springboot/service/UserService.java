package it.andrea.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import it.andrea.springboot.model.User;
import it.andrea.springboot.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDTO userRegistrationDTO);

}

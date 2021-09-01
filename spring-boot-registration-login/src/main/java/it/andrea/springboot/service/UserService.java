package it.andrea.springboot.service;

import it.andrea.springboot.model.User;
import it.andrea.springboot.web.dto.UserRegistrationDTO;

public interface UserService {
	
	User save(UserRegistrationDTO userRegistrationDTO);

}

package it.andrea.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import it.andrea.springboot.service.UserService;
import it.andrea.springboot.web.dto.UserRegistrationDTO;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO userRegistrationDTO) {
		userService.save(userRegistrationDTO);
		return "redirect:/registration?success";
	}
	
}

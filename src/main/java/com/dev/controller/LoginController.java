package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String showLogin() {
		System.out.println("Fuck Happened.");
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcome(ModelMap model, @RequestParam String name, @RequestParam String password) {

		boolean isValid = name.equalsIgnoreCase("test") && password.equalsIgnoreCase("test");
		
		if(!isValid) {
			model.put("errorMsg" , "Invalid creds");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}

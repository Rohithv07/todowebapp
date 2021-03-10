package com.rohith.webapp.service;

import org.springframework.stereotype.Component;

@Component // creates a bean automatically
public class LoginService {
	public boolean validateUser(String userId, String password) {
		return userId.equalsIgnoreCase("Rohith") && password.equals("mypassword");
	}
}

package com.rohith.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rohith.webapp.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// @ResponseBody - used to display the texts inside the return
	public String loginMessage(ModelMap model) {
		// model.put("name", name);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// @ResponseBody - used to display the texts inside the return
	public String showWelcomePage(@RequestParam String name, ModelMap model, @RequestParam String password) {
		boolean isValid = loginService.validateUser(name, password);
		if (!isValid) {
			model.put("errorMessage", "lets rethink about login");
			return "login";
		}
		model.put("name", name);
		// model.put("password", password);
		return "welcome";
	}
}

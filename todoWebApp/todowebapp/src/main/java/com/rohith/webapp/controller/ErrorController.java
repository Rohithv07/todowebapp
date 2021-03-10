package com.rohith.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(HttpServletRequest request, Exception exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", exception.getStackTrace());
		modelAndView.addObject("url", request.getRequestURL());
		modelAndView.setViewName("error");
		return modelAndView;
	}

}

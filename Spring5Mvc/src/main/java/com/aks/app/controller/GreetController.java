package com.aks.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetController {
	
	@Autowired
	private Environment env;
	
	@RequestMapping(path = "/greet", method = RequestMethod.GET)
	public String greet(ModelMap model) {
		model.addAttribute("greet", "Welcome Abhishek");
		System.out.println(env.getProperty("com.test.value"));
		model.addAttribute("propt", env.getProperty("com.test.value"));
		//model.setViewName("welcome");
		return "welcome";
	}
}

package com.aks.app.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyContoller {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String indexPage(Model model, Principal principal) {
		model.addAttribute("message", "You are logged in as " + principal.getName());
		return "index";
	}
}

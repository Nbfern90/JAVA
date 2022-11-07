package com.codingdojo.tester.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/demo")
	public String demo() {
	return "demo.jsp";
	}
	
	@RequestMapping("/apple")
	public String index(Model model) {	
		String firstName = "Nick";
		String lastName = "Smith";
		String email = "NSmith@gmail.com";
		Integer age = 54;
		
		model.addAttribute("first", firstName);
		model.addAttribute("last", lastName);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		
		model.addAttribute("fruit", "apple");
		return "demo.jsp";
	}
}

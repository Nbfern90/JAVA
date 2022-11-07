package com.codingdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";		
	}
	
	@PostMapping("/")
	public String enterInfo(HttpSession session, @RequestParam("number") int number,
			@RequestParam("city") String city, @RequestParam("name") String name,
			@RequestParam("hobby") String hobby,@RequestParam("living") String living,
			@RequestParam("nice") String nice) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
		
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("nice", session.getAttribute("nice"));
		
		
		return "show.jsp";
	}
	

}

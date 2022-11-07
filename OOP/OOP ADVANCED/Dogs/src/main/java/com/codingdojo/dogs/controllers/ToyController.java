package com.codingdojo.dogs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.codingdojo.dogs.models.Toy;
import com.codingdojo.dogs.services.ToyService;

@Controller
public class ToyController {
	
	@Autowired
	private ToyService tServ;
	
	@GetMapping("/toys/new")
	public String allToys(Model model) {
		model.addAttribute("allToys", tServ.getAll());
		model.addAttribute("toy", new Toy());
		return "toys/toys.jsp";
	}
	
	@PostMapping("/toys/create")
	public String createToy(@ModelAttribute("toy") Toy toy) {
		tServ.save(toy);
		
		return "redirect:/toys/new";
	}

}

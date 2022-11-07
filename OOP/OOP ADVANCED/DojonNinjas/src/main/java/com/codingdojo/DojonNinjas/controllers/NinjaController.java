package com.codingdojo.DojonNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.DojonNinjas.models.Ninja;
import com.codingdojo.DojonNinjas.services.DojoService;
import com.codingdojo.DojonNinjas.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaServ;
	
	@Autowired
	private DojoService dojoServ;
	
	// ========== Display =======================
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoServ.getAll());
		
		return "createNinja.jsp";
	}
	
	
	// ========== Action =======================
	
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDojos", dojoServ.getAll());
			return "createNinja.jsp";
		}else {
			ninjaServ.save(ninja);
			return "redirect:/dashboard";
		}
	}
	
	
	
	
	
	
	
}

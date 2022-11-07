package com.codingdojo.DojonNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.DojonNinjas.models.Dojo;
import com.codingdojo.DojonNinjas.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService serv;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dashboard";
	}
	
	//============= Display =============
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("allDojos", serv.getAll());
		return "dashboard.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "create.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String getDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = serv.getOne(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
	}
	
	@GetMapping("/dojos/{id}/edit")
	public String editDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", serv.getOne(id));
		return "edit.jsp";
	}
	
	//============= Action =============
	
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "create.jsp";
		}else {
			serv.save(dojo);
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/dojos/{id}/update")
	public String updateDog(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result, @PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "create.jsp";
		}else {
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/dogs{id}/delete")
	public String deleteDog(@PathVariable("id") Long id) {
		serv.delete(id);
		return "redirect:/dojos/" + id;
	}

	
	
	
	
	
	
	
	
	
}

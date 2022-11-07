package com.codingdojo.dogs.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dogs.models.Dog;
import com.codingdojo.dogs.services.DogService;

@Controller
public class DogController {
	@Autowired
	private DogService serv;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dashboard";
	}
	
	//========== Display ===========
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("allDogs", serv.getAll());
		return "dashboard.jsp";	
	}
	
	
	@GetMapping("/dogs/new")
	public String newDog(@ModelAttribute("dog") Dog dog) {
		return "create.jsp";
		
	}
	
	@GetMapping("/dogs/{id}")
	public String getDog(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dog", serv.getOne(id));
		return "show.jsp";
	}
	
	@GetMapping("/dogs/{id}/edit")
	public String editDog(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dog", serv.getOne(id));
		return "edit.jsp";
	}
		
	
	
	//========== Action ===========
	
	@PostMapping("/dogs/create")
	public String createDog(@Valid @ModelAttribute("dog") Dog dog, BindingResult result) {
		if (result.hasErrors()) {
			return "create.jsp";
		}else {
			serv.save(dog);
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/dogs/{id}/update")
	public String updateDog(@Valid @ModelAttribute("dog")Dog dog, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "create.jsp";
		}else {
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/dogs/{id}/delete")
	public String deleteDog(@PathVariable("id") Long id) {
		serv.delete(id); 
		return "redirect:/dogs/" + id;
	}
	
	
	
	
	
	
	

}

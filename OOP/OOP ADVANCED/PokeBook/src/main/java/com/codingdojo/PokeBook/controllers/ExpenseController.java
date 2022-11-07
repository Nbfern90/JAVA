package com.codingdojo.PokeBook.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.PokeBook.models.Expense;
import com.codingdojo.PokeBook.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseService serv;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dashboard";	
	}
	
	//====== Display ========
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("allExpense", serv.getAll());
		return "dashboard.jsp";
	}
	
	@GetMapping("/expense/new")
	public String newExpense(@ModelAttribute("expense") Expense expense) {
		return "create.jsp";
	}
	
	@GetMapping("/expense/{id}")
	public String getExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", serv.getOne(id));
		return "show.jsp";
	}
	
	@GetMapping("/expense/{id}/edit")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", serv.getOne(id));
		return "edit.jsp";
	}
	
	
	//====== Action ========
	
	@PostMapping("/expense/create")
	public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "create.jsp";
		}else {
			serv.save(expense);
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/expense/{id}/update")
	public String updateExpense(@Valid @ModelAttribute("expense")Expense expense, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "create.jsp";
		}else {
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/expense/{id}/delete")
	public String deleteDog(@PathVariable("id") Long id) {
		serv.delete(id);
		return "redirect:/expense/" + id;
	}

	


}

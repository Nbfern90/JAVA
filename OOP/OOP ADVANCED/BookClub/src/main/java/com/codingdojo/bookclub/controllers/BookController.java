package com.codingdojo.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.services.BookService;
import com.codingdojo.bookclub.services.UserService;



@Controller
public class BookController {
	@Autowired
	private BookService bookServ;
	
	@Autowired
	private UserService userServ;

	
	//================= Display =================
		//Read Many
		
	   
	   @GetMapping("/dashboard")
	   public String dashboard(Model model, HttpSession session) {
		   if (session.getAttribute("user_id") == null ) {
			   return "redirect:/";
		   }
		   
		   model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		   model.addAttribute("allBooks", bookServ.getAll());
				   return "dashboard.jsp";
	   }
	
	   
	   //Create
	
	@GetMapping("/books/new")
	public String newBook(Model model) {
		model.addAttribute("book", new Book());
		return "create.jsp";
		
	}
	//Read One
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
	
		model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		model.addAttribute("book", bookServ.getOne(id));


		return "show.jsp";
	}
	
	//Update
	@GetMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		model.addAttribute("book", bookServ.getOne(id));
		
		return "edit.jsp";
	}
	
	
	
	
	//================= Action =================
	
	
	//Create
	@PostMapping("/books/create")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			return "create.jsp";
		}else {
			
			User user = userServ.getOne((Long) session.getAttribute("user_id"));
			book.setUser(user);
			bookServ.save(book);
			
			return "redirect:/dashboard";
		}
	}
	

	
	@PutMapping("/books/{id}/update")
	public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, 
		HttpSession session, @PathVariable("id") Long id, Model model){
		if (result.hasErrors()) {
			model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
//			model.addAttribute("book", bookServ.getOne(id));

			return "edit.jsp";
		}else {
			Book bookFromDB = bookServ.getOne(id);
			
			if(!session.getAttribute("user_id").equals(bookFromDB.getUser().getId())) {
				return "redirect:/dashboard";
			}
			
			bookFromDB.setTitle(book.getTitle());
			bookFromDB.setAuthor(book.getAuthor());
			bookFromDB.setThoughts(book.getThoughts());
			
			bookServ.save(bookFromDB);
			
			return "redirect:/dashboard";
		}
	}

	
	
	//Delete
	@GetMapping("/books/{id}/delete")
	public String deleteBook(@PathVariable("id") Long id) {
		bookServ.delete(id);
		
		return "redirect:/dashboard";
	}
	
	

}

package com.codingdojo.comic.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.comic.models.LoginUser;
import com.codingdojo.comic.models.User;
import com.codingdojo.comic.services.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService serv;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	

	    
	@PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        serv.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            
            return "index.jsp";
        }
        
        session.setAttribute("user_id", newUser.getId());
        
        return "redirect:/dashboard";
    }

	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        User user = serv.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "index.jsp";
	        }
	        session.setAttribute("user_id", user.getId());
	        return "redirect:/dashboard";
	    }
	    
	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	    	session.removeAttribute("user_id");
	    	return "redirect:/";
	    	
	    }
	    
	   
	
}


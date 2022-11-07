package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
//@RequestMapping("/your_server")
public class CounterController {
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}else {
			int counter = (int)session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
		}
		return "index.jsp";
	}
	
	
	@RequestMapping("your_server/counter")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer)session.getAttribute("count");
		if(currentCount == null) {
			model.addAttribute("current", 0);
		}else {
			model.addAttribute("current", currentCount);
		}
		return "showCount.jsp";
	}
	
		
	

}

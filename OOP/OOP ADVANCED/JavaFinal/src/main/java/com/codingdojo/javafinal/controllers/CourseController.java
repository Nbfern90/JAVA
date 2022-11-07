package com.codingdojo.javafinal.controllers;

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
import com.codingdojo.javafinal.models.Course;
import com.codingdojo.javafinal.models.User;
import com.codingdojo.javafinal.services.CourseService;
import com.codingdojo.javafinal.services.UserService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseServ;
	
	@Autowired
	private UserService userServ;
	
	
	//================= Display =================
	
		//Read Many
	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		model.addAttribute("allCourses", courseServ.getAll());
			return "dashboard.jsp";		
	}
	
		//Create
	@GetMapping("/courses/new")
		public String newCourse(Model model) {
			model.addAttribute("course", new Course());
			return "create.jsp";
		}
	
		//Read One
	@GetMapping ("/courses/{id}")
	public String showCourse(@PathVariable("id") Long id, Model model, HttpSession session) {
		model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		model.addAttribute("course", courseServ.getOne(id));
		
		return "show.jsp";
	}
	
		//Update
	@GetMapping("/courses/{id}/edit")
	public String editCourse(@PathVariable("id") Long id, Model model, HttpSession session) {
		model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		model.addAttribute("course", courseServ.getOne(id));
		return "edit.jsp";
	}
	
	//================= Action =================
	
		//Create
	@PostMapping("/courses/create")
	public String createCourse(@Valid @ModelAttribute("course") Course course, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			return "create.jsp";
		}else {
			User user = userServ.getOne((Long) session.getAttribute("user_id"));
			course.setUser(user);
			courseServ.save(course);
			
			return "redirect:/dashboard";
		}
	}
	
	
		//Update
	@PutMapping("/courses/{id}/update")
	public String updateCourse(@Valid @ModelAttribute("course") Course course, 
			BindingResult result, HttpSession session, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
			
			return "edit.jsp";
		}else {
			Course courseFromDB = courseServ.getOne(id);			
			if(!session.getAttribute("user_id").equals(courseFromDB.getUser().getId())) {
				return "redirect:/dashboard";
			}
			
			courseFromDB.setCourseName(course.getCourseName());
			courseFromDB.setWeekday(course.getWeekday());
			courseFromDB.setPrice(course.getPrice());
			courseFromDB.setDescription(course.getDescription());
			
			courseServ.save(courseFromDB);
			
			return "redirect:/dashboard";
			
		}
	}
	
	//Delete
	@GetMapping("/courses/{id}/delete")
	public String deleteCourse(@PathVariable("id") Long id) {
		courseServ.delete(id);
		
		return"redirect:/dashboard";
	}
	
	

	
	
	

}

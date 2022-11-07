package com.codingdojo.javafinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.javafinal.models.Course;
import com.codingdojo.javafinal.repos.CourseRepo;

@Service
public class CourseService {
	@Autowired
	private CourseRepo repo;

	//========== Create/Update ============
			public Course save(Course c) {
				return repo.save(c);
			}	
			
			//========== Read ============
			public List<Course> getAll(){
				return repo.findAll();
			}
			
			public Course getOne(Long id) {
				Optional<Course> c = repo.findById(id);
				if (c.isPresent()) {
					return c.get();
				}else {
					return null;
				}
				
			}
			
			//========== Delete ============
			public void delete(Long id) {
				repo.deleteById(id);
			}

}

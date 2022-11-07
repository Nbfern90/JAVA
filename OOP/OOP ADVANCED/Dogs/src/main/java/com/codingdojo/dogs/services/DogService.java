package com.codingdojo.dogs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dogs.models.Dog;
import com.codingdojo.dogs.repos.DogRepo;

@Service
public class DogService {

	@Autowired
	private DogRepo repo;
	
	//========== Create/Update ============
	public Dog save(Dog d) {
		return repo.save(d);
	}	
	
	//========== Read ============
	public List<Dog> getAll(){
		return repo.findAll();
	}
	
	public Dog getOne(Long id) {
		Optional<Dog> d = repo.findById(id);
		if (d.isPresent()) {
			return d.get();
		}else {
			return null;
		}
		
	}
	
	//========== Delete ============
	public void delete(Long id) {
		repo.deleteById(id);
	}

}

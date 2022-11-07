package com.codingdojo.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dogs.models.Collar;
import com.codingdojo.dogs.repos.CollarRepo;

@Service
public class CollarService {
	@Autowired
	private CollarRepo repo;
	

	//========== Create/Update ============
	public Collar save(Collar c) {
		return repo.save(c);
	}	
	
	//========== Read ============

	//========== Delete ============
	public void delete(Long id) {
		repo.deleteById(id);
	}

}

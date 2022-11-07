package com.codingdojo.DojonNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.DojonNinjas.models.Dojo;
import com.codingdojo.DojonNinjas.repos.DojoRepo;

@Service
public class DojoService {

	@Autowired
	private DojoRepo repo;
	
	
	//========== Create/Update ============
	public Dojo save(Dojo d) {
		return repo.save(d);
	}	
	
	//========== Read ============
	public List<Dojo> getAll(){
		return repo.findAll();
	}
	
	public Dojo getOne(Long id) {
		Optional<Dojo> d = repo.findById(id);
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


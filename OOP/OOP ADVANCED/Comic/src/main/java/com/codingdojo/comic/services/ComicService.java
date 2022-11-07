package com.codingdojo.comic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.comic.models.Comic;
import com.codingdojo.comic.repos.ComicRepo;

@Service
public class ComicService {
	@Autowired
	private ComicRepo repo;
	
	//========== Create/Update ============
	
	public Comic save(Comic c) {
		return repo.save(c);
	}
	
	//========== Read ============
	
	public List<Comic> getAll(){
		return repo.findAll();
	}
	
	public Comic getOne(Long id) {
		Optional<Comic> c = repo.findById(id);
		if(c.isPresent()) {
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

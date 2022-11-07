package com.codingdojo.DojonNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.DojonNinjas.models.Ninja;
import com.codingdojo.DojonNinjas.repos.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo repo;
	
	//========== Create/Update ============
		public Ninja save(Ninja n) {
			return repo.save(n);
		}	
		
		//========== Read ============
		public List<Ninja> findAll(){
	        
	        return repo.findAll();
	    }

		//========== Delete ============
		public void delete(Long id) {
			repo.deleteById(id);
		}

}

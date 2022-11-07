package com.codingdojo.PokeBook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.PokeBook.models.Expense;
import com.codingdojo.PokeBook.repos.ExpenseRepo;

@Service
public class ExpenseService {
	
		@Autowired
		private ExpenseRepo repo;
		
		//========== Create/Update ============
		public Expense save(Expense d) {
			return repo.save(d);
		}	
		
		//========== Read ============
		public List<Expense> getAll(){
			return repo.findAll();
		}
		
		public Expense getOne(Long id) {
			Optional<Expense> d = repo.findById(id);
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



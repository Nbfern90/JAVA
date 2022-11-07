package com.codingdojo.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo repo;
	
	//========== Create/Update ============
		public Book save(Book b) {
			return repo.save(b);
		}	
		
		//========== Read ============
		public List<Book> getAll(){
			return repo.findAll();
		}
		
		public Book getOne(Long id) {
			Optional<Book> b = repo.findById(id);
			if (b.isPresent()) {
				return b.get();
			}else {
				return null;
			}
			
		}
		
		//========== Delete ============
		public void delete(Long id) {
			repo.deleteById(id);
		}

}

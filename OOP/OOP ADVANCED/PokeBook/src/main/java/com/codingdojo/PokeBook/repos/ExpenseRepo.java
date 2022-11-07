package com.codingdojo.PokeBook.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.PokeBook.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
}

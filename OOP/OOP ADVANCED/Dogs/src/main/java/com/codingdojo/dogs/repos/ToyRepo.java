package com.codingdojo.dogs.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dogs.models.Toy;

@Repository
public interface ToyRepo extends CrudRepository<Toy, Long> {
	List<Toy> findAll();
}

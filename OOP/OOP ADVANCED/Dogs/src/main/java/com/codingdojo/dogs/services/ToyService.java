package com.codingdojo.dogs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dogs.models.Dog;
import com.codingdojo.dogs.models.Toy;
import com.codingdojo.dogs.repos.ToyRepo;

@Service
public class ToyService {

	@Autowired
	private ToyRepo repo;
	
	@Autowired
	private DogService dogService;
	
	//========== Create/Update ============
	public Toy save(Toy t) {
		return repo.save(t);
	}	
	
	//========== Read ============
	public List<Toy> getAll(){
		return repo.findAll();
	}
	
	public Toy getOne(Long id) {
		Optional<Toy> t = repo.findById(id);
		if (t.isPresent()) {
			return t.get();
		}else {
			return null;
		}
		
	}
	
	//========== Delete ============
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	//========== Relationships ============
	public Toy addToDog(Long toyId, Long dogId) {
		Toy toy = getOne(toyId);
		Dog dog = dogService.getOne(dogId);
		
		toy.getDogs().add(dog);
//		dog.getToys().add(toy); Either one of these can be the one you save
		
		return save(toy);	
	}
	public Toy removeFromDog(Long toyId, Long dogId) {
		Toy toy = getOne(toyId);
		Dog dog = dogService.getOne(dogId);
		
		toy.getDogs().remove(dog);
//		dog.getToys().remove(toy); Either one of these can be the one you save
		
		return save(toy);		
	}
}

package com.codingdojo.comic.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.comic.models.Comic;

@Repository
public interface ComicRepo extends CrudRepository<Comic, Long> {
	List<Comic> findAll();
}

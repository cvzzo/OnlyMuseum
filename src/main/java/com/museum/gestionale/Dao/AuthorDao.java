package com.museum.gestionale.Dao;

import com.museum.gestionale.Entity.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorDao extends CrudRepository<Author, Long> {
	Author findByName(String name);
	List<Author> findAll();
}

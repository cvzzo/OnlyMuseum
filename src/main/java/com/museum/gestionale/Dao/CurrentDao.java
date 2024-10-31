package com.museum.gestionale.Dao;

import com.museum.gestionale.Entity.Author;
import com.museum.gestionale.Entity.Current;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrentDao extends CrudRepository<Current, Long> {
	List<Current> findAll();
	Current findById(long id);
	//List<Current> findByCurrent(Current current);
}

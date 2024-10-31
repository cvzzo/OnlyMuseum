package com.museum.gestionale.Dao;

import com.museum.gestionale.Entity.Current;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrentDao extends CrudRepository<Current, Integer> {
	List<Current> findAll();
	//List<Current> findByCurrent(Current current);
}

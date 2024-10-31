package com.museum.gestionale.Dao;

import com.museum.gestionale.Entity.Painting;
import com.museum.gestionale.Entity.Tag;
import org.springframework.data.repository.CrudRepository;

import javax.management.Query;
import java.util.List;

public interface PaintingDao extends CrudRepository<Painting, Integer> {
	Painting findById(int id);
	List<Painting> findAll();
	List<Painting> findAllByTags(Tag tags);
//	Query insertPainting(Painting painting);
}

package com.museum.gestionale.DbManager;

import com.museum.gestionale.Entity.Autore;
import com.museum.gestionale.Entity.Museo;
import com.museum.gestionale.Entity.Opera;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperaDao  extends CrudRepository<Opera, Integer> {
	Opera findById(long id);
	List<Opera> findAll();
	List<Opera> findByNome(String nome);
	List<Opera> findByAutore(Autore autore);
	List<Opera> findByRoom(String room);
	List<Opera> findByMuseum(Museo museo);
	List<Opera> findByTag(String tag);
}

package com.museum.gestionale.DbManager;

import com.museum.gestionale.Entity.Autore;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AutoreDao extends CrudRepository<Autore, Long> {
	Autore getAutoreById(Long id);
	List<Autore> findAll();
	List<Autore> findAutoreByCorrente(String Corrente);
}

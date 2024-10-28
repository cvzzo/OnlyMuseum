package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.List;

/// Romanico
/// Gotico
/// Umanesimo
/// Rinascimento
/// Barocco
/// Rococo
/// Neoclassicismo
/// Romanticismo
/// Realismo
/// Impressionismo
/// Post-Impressionismo
/// Giapposismo
/// Art Nouvuea
/// Fauvismo
/// Cubismo
/// Futurismo
/// Espressionismo
/// Surrealismo
/// Astrattismo

@Entity
@Table(name = "corrente")
public class Corrente {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;


	public Corrente(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Corrente() {

	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}

package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="autore")
public class Autore {

	private String name;
	private String lastname;
	private Date bornDate;
	private Date deathDate;
	private String bornPlace;
	private String deathPlace;
	@ManyToOne
	private Corrente currents;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	public Autore(String nome, String cognome, Date dataNascita, Date dataMorte, String luogoNascita, String luogoMorte, String corrente) {
		this.name = nome;
		this.lastname = cognome;
		this.bornDate = dataNascita;
		this.deathDate = dataMorte;
		this.bornPlace = luogoNascita;
		this.deathPlace = luogoMorte;
		corrente = corrente;
	}

	public Autore() {

	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String cognome) {
		this.lastname = cognome;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date dataNascita) {
		this.bornDate = dataNascita;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date dataMorte) {
		this.deathDate = dataMorte;
	}

	public String getBornPlace() {
		return bornPlace;
	}

	public void setBornPlace(String luogoNascita) {
		this.bornPlace = luogoNascita;
	}

	public String getDeathPlace() {
		return deathPlace;
	}

	public void setDeathPlace(String luogoMorte) {
		this.deathPlace = luogoMorte;
	}

	public Corrente getCurrents() {
		return currents;
	}

	public void setCurrents(Corrente corrente) {
		this.currents = corrente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}

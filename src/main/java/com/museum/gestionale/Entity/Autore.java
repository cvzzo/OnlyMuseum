package com.museum.gestionale.Entity;

import java.util.Date;

public class Autore {
	private String Nome;
	private String Cognome;
	private Date DataNascita;
	private Date DataMorte;
	private String LuogoNascita;
	private String LuogoMorte;
	private String Corrente;

	public Autore(String nome, String cognome, Date dataNascita, Date dataMorte, String luogoNascita, String luogoMorte, String corrente) {
		Nome = nome;
		Cognome = cognome;
		DataNascita = dataNascita;
		DataMorte = dataMorte;
		LuogoNascita = luogoNascita;
		LuogoMorte = luogoMorte;
		Corrente = corrente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public Date getDataNascita() {
		return DataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		DataNascita = dataNascita;
	}

	public Date getDataMorte() {
		return DataMorte;
	}

	public void setDataMorte(Date dataMorte) {
		DataMorte = dataMorte;
	}

	public String getLuogoNascita() {
		return LuogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		LuogoNascita = luogoNascita;
	}

	public String getLuogoMorte() {
		return LuogoMorte;
	}

	public void setLuogoMorte(String luogoMorte) {
		LuogoMorte = luogoMorte;
	}

	public String getCorrente() {
		return Corrente;
	}

	public void setCorrente(String corrente) {
		Corrente = corrente;
	}
}

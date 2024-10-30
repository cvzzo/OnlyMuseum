package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "current")
public class Current {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String period;

	@Column(columnDefinition = "TEXT")
	private String description;

	@ManyToMany(mappedBy = "currents")
	private Set<Author> authors;


	@OneToMany(mappedBy = "current")
	private Set<Painting> paintings;


	public Current() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Set<Painting> getPaintings() {
		return paintings;
	}

	public void setPaintings(Set<Painting> paintings) {
		this.paintings = paintings;
	}
}

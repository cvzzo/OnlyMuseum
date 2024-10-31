package com.museum.gestionale.Entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="museum")
public class Museum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "museum", fetch = FetchType.LAZY)
	private Set<Painting> paintings;


	public Museum() {
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

	public Set<Painting> getPaintings() {
		return paintings;
	}

	public void setPaintings(Set<Painting> paintings) {
		this.paintings = paintings;
	}
}

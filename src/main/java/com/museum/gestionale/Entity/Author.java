package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="author")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private Date bornDate;
	private Date deathDate;
	private String bornPlace;
	private String deathPlace;

	@ManyToMany
	@JoinTable(
			name = "author_current",
			joinColumns = @JoinColumn(name = "author_id"),
			inverseJoinColumns = @JoinColumn(name = "current_id")
	)
	private Set<Current> currents;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Painting> paintings;

	@Column(columnDefinition = "TEXT")
	private String image;

	@Column(columnDefinition = "TEXT")
	private String description;


	public Author() {
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

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getBornPlace() {
		return bornPlace;
	}

	public void setBornPlace(String bornPlace) {
		this.bornPlace = bornPlace;
	}

	public String getDeathPlace() {
		return deathPlace;
	}

	public void setDeathPlace(String deathPlace) {
		this.deathPlace = deathPlace;
	}

	public Set<Current> getCurrents() {
		return currents;
	}

	public void setCurrents(Set<Current> currents) {
		this.currents = currents;
	}

	public Set<Painting> getPaintings() {
		return paintings;
	}

	public void setPaintings(Set<Painting> paintings) {
		this.paintings = paintings;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

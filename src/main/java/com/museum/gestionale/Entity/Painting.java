package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "painting")
public class Painting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private int year;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "author_id")
	private Author author;

	private String description;
	private String material;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "room_id")
	private Room room;

	private float height;
	private float width;
	private String link;

	@ManyToOne(fetch = FetchType.EAGER)
	private Museum museum;

	@ManyToMany
	@JoinTable(
			name = "painting_tag",
			joinColumns = @JoinColumn(name = "painting_id"),
			inverseJoinColumns = @JoinColumn(name = "tag_id")
	)
	private Set<Tag> tags;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "current_id")
	private Current current;


	public Painting() {
	}

	public Painting(int id, String name, int year, Author author, String description, String material, Room room, float height, float width, String link, Museum museum, Set<Tag> tags, Current current) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.author = author;
		this.description = description;
		this.material = material;
		this.room = room;
		this.height = height;
		this.width = width;
		this.link = link;
		this.museum = museum;
		this.tags = tags;
		this.current = current;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Museum getMuseum() {
		return museum;
	}

	public void setMuseum(Museum museum) {
		this.museum = museum;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}
}

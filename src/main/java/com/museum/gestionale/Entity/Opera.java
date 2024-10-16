package com.museum.gestionale.Entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Set;

@Entity
@Table(name="opera")
public class Opera {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    private int year;
    @ManyToOne
    private Autore author;
    private String description;
    private String material;
    private int room;
    private float height;
    private float width;
    private String link;
    @OneToOne
    private Museo museo;
    @ManyToMany
    Set<Opera> opera;

    public Opera(int id, String name, int year, Autore author, String description, String material, int room, float height, float width, String link, Museo museo) {
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
        this.museo = museo;
    }

    public Opera() {
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

    public Autore getAuthor() {
        return author;
    }

    public void setAuthor(Autore author) {
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
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

    @Override
    public String toString() {
        return "Opera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", material='" + material + '\'' +
                ", room=" + room +
                ", height=" + height +
                ", width=" + width +
                ", link='" + link + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public Long getId() {
        return (long) id;
    }
}

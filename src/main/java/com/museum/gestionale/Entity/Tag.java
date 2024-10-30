package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Painting> paintings;

    public Tag(Long id, String name, Set<Painting> paintings) {
        this.id = id;
        this.name = name;
        this.paintings = paintings;
    }

    public Tag() {

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

package com.museum.gestionale.Entity;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "current_id")
    private Current current;

    @OneToMany(mappedBy = "room")
    private Set<Painting> paintings;

    public Room() {
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

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Set<Painting> getPaintings() {
        return paintings;
    }

    public void setPaintings(Set<Painting> paintings) {
        this.paintings = paintings;
    }
}

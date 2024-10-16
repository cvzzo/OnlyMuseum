package com.museum.gestionale.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="room")
public class Stanza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
}

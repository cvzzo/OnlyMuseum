package com.museum.gestionale.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="museo")
public class Museo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	String Nome;
}

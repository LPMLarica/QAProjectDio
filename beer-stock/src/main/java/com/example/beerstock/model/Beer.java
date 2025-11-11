package com.example.beerstock.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "beers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private String brand;

    private Integer max;

    private Integer quantity;
}

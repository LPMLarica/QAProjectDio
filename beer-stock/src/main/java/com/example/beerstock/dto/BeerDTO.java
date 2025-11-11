package com.example.beerstock.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
    private Long id;
    private String name;
    private String brand;
    private Integer max;
    private Integer quantity;
}

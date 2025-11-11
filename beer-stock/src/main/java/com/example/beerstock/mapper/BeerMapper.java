package com.example.beerstock.mapper;

import com.example.beerstock.dto.BeerDTO;
import com.example.beerstock.model.Beer;

public class BeerMapper {
    public static Beer toModel(BeerDTO dto) {
        return Beer.builder()
                .id(dto.getId())
                .name(dto.getName())
                .brand(dto.getBrand())
                .max(dto.getMax())
                .quantity(dto.getQuantity())
                .build();
    }

    public static BeerDTO toDTO(Beer beer) {
        return BeerDTO.builder()
                .id(beer.getId())
                .name(beer.getName())
                .brand(beer.getBrand())
                .max(beer.getMax())
                .quantity(beer.getQuantity())
                .build();
    }
}

package com.example.beerstock.service;

import com.example.beerstock.dto.BeerDTO;

import java.util.List;

public interface BeerService {
    BeerDTO createBeer(BeerDTO dto);
    List<BeerDTO> listAll();
    BeerDTO findByName(String name);
    void deleteById(Long id);
    BeerDTO increment(Long id, int quantity);
    BeerDTO decrement(Long id, int quantity);
}

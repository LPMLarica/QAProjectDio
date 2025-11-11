package com.example.beerstock.service;

import com.example.beerstock.dto.BeerDTO;
import com.example.beerstock.exception.BeerAlreadyExistsException;
import com.example.beerstock.exception.BeerNotFoundException;
import com.example.beerstock.exception.StockExceededException;
import com.example.beerstock.mapper.BeerMapper;
import com.example.beerstock.model.Beer;
import com.example.beerstock.repository.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository repository;

    public BeerServiceImpl(BeerRepository repository) {
        this.repository = repository;
    }

    @Override
    public BeerDTO createBeer(BeerDTO dto) {
        if (repository.existsByName(dto.getName())) {
            throw new BeerAlreadyExistsException("Beer with name already exists: " + dto.getName());
        }
        Beer saved = repository.save(BeerMapper.toModel(dto));
        return BeerMapper.toDTO(saved);
    }

    @Override
    public List<BeerDTO> listAll() {
        return repository.findAll().stream().map(BeerMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public BeerDTO findByName(String name) {
        Beer beer = repository.findByName(name).orElseThrow(() -> new BeerNotFoundException("Beer not found: " + name));
        return BeerMapper.toDTO(beer);
    }

    @Override
    public void deleteById(Long id) {
        if (!repository.existsById(id)) {
            throw new BeerNotFoundException("Beer id not found: " + id);
        }
        repository.deleteById(id);
    }

    @Override
    public BeerDTO increment(Long id, int quantity) {
        Beer beer = repository.findById(id).orElseThrow(() -> new BeerNotFoundException("Beer id not found: " + id));
        int updated = beer.getQuantity() + quantity;
        if (updated > beer.getMax()) {
            throw new StockExceededException("Exceed max stock. Max: " + beer.getMax());
        }
        beer.setQuantity(updated);
        Beer saved = repository.save(beer);
        return BeerMapper.toDTO(saved);
    }

    @Override
    public BeerDTO decrement(Long id, int quantity) {
        Beer beer = repository.findById(id).orElseThrow(() -> new BeerNotFoundException("Beer id not found: " + id));
        int updated = beer.getQuantity() - quantity;
        if (updated < 0) {
            throw new StockExceededException("Resulting quantity cannot be negative");
        }
        beer.setQuantity(updated);
        Beer saved = repository.save(beer);
        return BeerMapper.toDTO(saved);
    }
}

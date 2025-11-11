package com.example.beerstock.controller;

import com.example.beerstock.dto.BeerDTO;
import com.example.beerstock.service.BeerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/beers")
public class BeerController {

    private final BeerService service;

    public BeerController(BeerService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<BeerDTO> create(@RequestBody BeerDTO dto) {
        BeerDTO created = service.createBeer(dto);
        return ResponseEntity.created(URI.create("/api/beers/" + created.getId())).body(created);
    }

    @GetMapping
    public ResponseEntity<List<BeerDTO>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<BeerDTO> getByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/increment")
    public ResponseEntity<BeerDTO> increment(@PathVariable Long id, @RequestParam int quantity) {
        return ResponseEntity.ok(service.increment(id, quantity));
    }

    @PatchMapping("/{id}/decrement")
    public ResponseEntity<BeerDTO> decrement(@PathVariable Long id, @RequestParam int quantity) {
        return ResponseEntity.ok(service.decrement(id, quantity));
    }
}

package com.example.beerstock.service;

import com.example.beerstock.dto.BeerDTO;
import com.example.beerstock.exception.BeerAlreadyExistsException;
import com.example.beerstock.exception.BeerNotFoundException;
import com.example.beerstock.exception.StockExceededException;
import com.example.beerstock.model.Beer;
import com.example.beerstock.repository.BeerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

class BeerServiceTest {

    @Mock
    private BeerRepository repository;

    @InjectMocks
    private BeerServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createBeer_success() {
        BeerDTO dto = BeerDTO.builder().name("IPA").brand("BrewCo").max(50).quantity(10).build();
        when(repository.existsByName(dto.getName())).thenReturn(false);
        Beer saved = Beer.builder().id(1L).name("IPA").brand("BrewCo").max(50).quantity(10).build();
        when(repository.save(any(Beer.class))).thenReturn(saved);

        BeerDTO result = service.createBeer(dto);

        assertThat(result.getId()).isEqualTo(1L);
        assertThat(result.getName()).isEqualTo("IPA");
        verify(repository).save(any(Beer.class));
    }

    @Test
    void createBeer_alreadyExists_throws() {
        BeerDTO dto = BeerDTO.builder().name("IPA").brand("BrewCo").max(50).quantity(10).build();
        when(repository.existsByName(dto.getName())).thenReturn(true);

        assertThatThrownBy(() -> service.createBeer(dto)).isInstanceOf(BeerAlreadyExistsException.class);
        verify(repository, never()).save(any(Beer.class));
    }

    @Test
    void listAll_returnsList() {
        when(repository.findAll()).thenReturn(List.of(
                Beer.builder().id(1L).name("IPA").brand("BrewCo").max(50).quantity(10).build(),
                Beer.builder().id(2L).name("Lager").brand("BrewCo").max(30).quantity(5).build()
        ));

        List<BeerDTO> list = service.listAll();

        assertThat(list).hasSize(2);
    }

    @Test
    void findByName_found() {
        when(repository.findByName("IPA")).thenReturn(Optional.of(
                Beer.builder().id(1L).name("IPA").brand("BrewCo").max(50).quantity(10).build()
        ));

        BeerDTO dto = service.findByName("IPA");

        assertThat(dto.getName()).isEqualTo("IPA");
    }

    @Test
    void findByName_notFound_throws() {
        when(repository.findByName("Stout")).thenReturn(Optional.empty());

        assertThatThrownBy(() -> service.findByName("Stout")).isInstanceOf(BeerNotFoundException.class);
    }

    @Test
    void delete_existing_deletes() {
        when(repository.existsById(1L)).thenReturn(true);

        service.deleteById(1L);

        verify(repository).deleteById(1L);
    }

    @Test
    void delete_notExists_throws() {
        when(repository.existsById(2L)).thenReturn(false);

        assertThatThrownBy(() -> service.deleteById(2L)).isInstanceOf(BeerNotFoundException.class);
    }

    @Test
    void increment_success() {
        Beer beer = Beer.builder().id(1L).name("IPA").brand("BrewCo").max(20).quantity(5).build();
        when(repository.findById(1L)).thenReturn(Optional.of(beer));
        when(repository.save(any(Beer.class))).thenAnswer(i -> i.getArgument(0));

        BeerDTO result = service.increment(1L, 3);

        assertThat(result.getQuantity()).isEqualTo(8);
        verify(repository).save(any(Beer.class));
    }

    @Test
    void increment_exceedMax_throws() {
        Beer beer = Beer.builder().id(1L).name("IPA").brand("BrewCo").max(10).quantity(8).build();
        when(repository.findById(1L)).thenReturn(Optional.of(beer));

        assertThatThrownBy(() -> service.increment(1L, 5)).isInstanceOf(StockExceededException.class);
    }

    @Test
    void decrement_success() {
        Beer beer = Beer.builder().id(1L).name("IPA").brand("BrewCo").max(20).quantity(10).build();
        when(repository.findById(1L)).thenReturn(Optional.of(beer));
        when(repository.save(any(Beer.class))).thenAnswer(i -> i.getArgument(0));

        BeerDTO result = service.decrement(1L, 4);

        assertThat(result.getQuantity()).isEqualTo(6);
        verify(repository).save(any(Beer.class));
    }

    @Test
    void decrement_toNegative_throws() {
        Beer beer = Beer.builder().id(1L).name("IPA").brand("BrewCo").max(20).quantity(2).build();
        when(repository.findById(1L)).thenReturn(Optional.of(beer));

        assertThatThrownBy(() -> service.decrement(1L, 5)).isInstanceOf(StockExceededException.class);
    }
}

package com.example.beerstock.exception;

public class BeerAlreadyExistsException extends RuntimeException {
    public BeerAlreadyExistsException(String message) {
        super(message);
    }
}

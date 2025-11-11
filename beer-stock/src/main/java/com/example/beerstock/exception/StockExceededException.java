package com.example.beerstock.exception;

public class StockExceededException extends RuntimeException {
    public StockExceededException(String message) {
        super(message);
    }
}

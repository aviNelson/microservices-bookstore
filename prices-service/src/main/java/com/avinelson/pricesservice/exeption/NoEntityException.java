package com.avinelson.pricesservice.exeption;

import org.springframework.http.HttpStatus;

public class NoEntityException extends RuntimeException{
    private final HttpStatus status;

    public NoEntityException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}

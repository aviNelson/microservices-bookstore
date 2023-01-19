package com.avinelson.backenduser.exeption;

import org.springframework.http.HttpStatus;

public class NoBookException extends RuntimeException{
    private final HttpStatus status;

    public NoBookException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}

package com.avinelson.bookservice.service;

import com.avinelson.bookservice.dto.BookDto;
import com.fasterxml.jackson.annotation.OptBoolean;

import java.util.Optional;

public interface BookService {

    public Optional<BookDto> findById(Integer id);
}

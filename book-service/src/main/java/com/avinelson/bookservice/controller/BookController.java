package com.avinelson.bookservice.controller;

import com.avinelson.bookservice.dto.BookDto;
import com.avinelson.bookservice.exeption.NoEntityException;
import com.avinelson.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}")
    public BookDto findById(@PathVariable Integer id) {
        log.info("Looking for book {}", id);
        return bookService.findById(id)
                .orElseThrow(() -> new NoEntityException("Nor found book with ID " + id, HttpStatus.NOT_FOUND));
    }

}

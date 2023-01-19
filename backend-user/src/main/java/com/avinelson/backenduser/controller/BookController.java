package com.avinelson.backenduser.controller;

import com.avinelson.backenduser.dto.PriceDto;
import com.avinelson.backenduser.exeption.NoBookException;
import com.avinelson.backenduser.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping("/{bookId}")
    public PriceDto getBook(@PathVariable Integer bookId) {
        log.info("Looking for book {}", bookId);
        return bookService.getBookWithPrice(bookId)
                .orElseThrow(() -> new NoBookException("Not found book with ID" + bookId, HttpStatus.NOT_FOUND));
    }
}

package com.avinelson.pricesservice.controller;

import com.avinelson.pricesservice.dto.PriceDto;
import com.avinelson.pricesservice.exeption.NoEntityException;
import com.avinelson.pricesservice.service.PriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PriceController {

    private final PriceService priceService;

    @GetMapping("/books/{bookId}")
    public PriceDto findByBookId(@PathVariable("bookId") Integer bookId) {
        log.info("Looking gor price og book {}", bookId);
        return priceService.findByBookId(bookId)
                .orElseThrow(() -> new NoEntityException("Not found price with book id " + bookId, HttpStatus.NOT_FOUND));
    }

}

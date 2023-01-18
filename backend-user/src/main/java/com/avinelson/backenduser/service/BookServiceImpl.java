package com.avinelson.backenduser.service;

import com.avinelson.backenduser.dto.BookDto;
import com.avinelson.backenduser.dto.PriceDto;
import com.avinelson.backenduser.feign.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final com.avinelson.backenduser.feign.BookService bookService;
    private final PriceService priceService;

    @Override
    public PriceDto getBookWithPrice(Integer id) {
        BookDto bookDto = bookService.findById(id);
        PriceDto priceDto = priceService.findByBookId(id);
        priceDto.setBook(bookDto);
        return priceDto;
    }
}

package com.avinelson.backenduser.service;

import com.avinelson.backenduser.dto.BookDto;
import com.avinelson.backenduser.dto.PriceDto;
import com.avinelson.backenduser.feign.FeignBookService;
import com.avinelson.backenduser.feign.FeignPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final FeignBookService feignBookService;
    private final FeignPriceService feignPriceService;

    @Override
    public Optional<PriceDto> getBookWithPrice(Integer id) {
        BookDto bookDto = feignBookService.findById(id);
        PriceDto priceDto = feignPriceService.findByBookId(id);
        priceDto.setBook(bookDto);
        return Optional.of(priceDto);
    }
}

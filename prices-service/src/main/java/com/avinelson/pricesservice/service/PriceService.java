package com.avinelson.pricesservice.service;

import com.avinelson.pricesservice.dto.PriceDto;

import java.util.Optional;

public interface PriceService {

    public Optional<PriceDto> findByBookId(Integer bookId);
}

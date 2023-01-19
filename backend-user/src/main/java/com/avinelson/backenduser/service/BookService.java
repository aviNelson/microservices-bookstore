package com.avinelson.backenduser.service;

import com.avinelson.backenduser.dto.PriceDto;

import java.util.Optional;

public interface BookService {
 public Optional<PriceDto> getBookWithPrice(Integer id);
}

package com.avinelson.pricesservice.repository;

import com.avinelson.pricesservice.dto.PriceDto;
import com.avinelson.pricesservice.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PriceRepository extends JpaRepository<Price, Integer> {
    Optional<Price> findByBookId(Integer bookId);
}
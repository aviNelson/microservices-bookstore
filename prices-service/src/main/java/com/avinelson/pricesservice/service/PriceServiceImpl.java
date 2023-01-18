package com.avinelson.pricesservice.service;

import com.avinelson.pricesservice.dto.PriceDto;
import com.avinelson.pricesservice.mapper.PriceMapper;
import com.avinelson.pricesservice.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    @Override
    public Optional<PriceDto> findByBookId(Integer bookId) {
        return priceRepository.findByBookId(bookId)
                .map(PriceMapper.INSTANCE::entityToDto);
    }
}

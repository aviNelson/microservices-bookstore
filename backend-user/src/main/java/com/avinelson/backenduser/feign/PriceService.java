package com.avinelson.backenduser.feign;

import com.avinelson.backenduser.dto.PriceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@FeignClient("price-service")
public interface PriceService {

    @RequestMapping("/prices/books/{bookId}")
    public PriceDto findByBookId(@PathVariable("bookId") Integer bookId);
}

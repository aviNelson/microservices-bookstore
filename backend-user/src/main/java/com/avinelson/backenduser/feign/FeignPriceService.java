package com.avinelson.backenduser.feign;

import com.avinelson.backenduser.dto.PriceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("price-service")
public interface FeignPriceService {

    @RequestMapping("/prices/books/{bookId}")
    public PriceDto findByBookId(@PathVariable("bookId") Integer bookId);
}

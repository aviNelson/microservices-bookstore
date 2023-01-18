package com.avinelson.backenduser.feign;

import com.avinelson.backenduser.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@FeignClient("book-service")
public interface BookService {

    @RequestMapping("/books/{bookId}")
    public BookDto findById(@PathVariable("bookId") Integer id);

}

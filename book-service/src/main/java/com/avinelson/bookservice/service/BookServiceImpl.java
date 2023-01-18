package com.avinelson.bookservice.service;

import com.avinelson.bookservice.dto.BookDto;
import com.avinelson.bookservice.mapper.BookMapper;
import com.avinelson.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Optional<BookDto> findById(Integer id){
        return bookRepository.findById(id)
                .map(BookMapper.INSTANCE::entityToDto);
    }
}

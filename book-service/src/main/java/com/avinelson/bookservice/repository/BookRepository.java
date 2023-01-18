package com.avinelson.bookservice.repository;

import com.avinelson.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
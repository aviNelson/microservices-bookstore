package com.avinelson.bookservice.repository;

import com.avinelson.bookservice.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
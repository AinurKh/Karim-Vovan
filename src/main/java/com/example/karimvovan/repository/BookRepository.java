package com.example.karimvovan.repository;

import com.example.karimvovan.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

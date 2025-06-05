package com.example.karimvovan.repository;

import com.example.karimvovan.entity.BookGenre;
import com.example.karimvovan.entity.BookGenreId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookGenreRepository extends JpaRepository<BookGenre, BookGenreId> {
}

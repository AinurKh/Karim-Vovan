package com.example.karimvovan.controller;

import com.example.karimvovan.entity.BookGenre;
import com.example.karimvovan.repository.BookGenreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book-genres")
public class BookGenreController {
    private final BookGenreRepository bookGenreRepository;

    public BookGenreController(BookGenreRepository bookGenreRepository) {
        this.bookGenreRepository = bookGenreRepository;
    }

    @GetMapping
    public List<BookGenre> getAllBookGenres() {
        return bookGenreRepository.findAll();
    }
}
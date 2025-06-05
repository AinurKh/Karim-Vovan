package com.example.karimvovan.controller;

import com.example.karimvovan.entity.BookDetail;
import com.example.karimvovan.repository.BookDetailRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book-details")
public class BookDetailController {

    private final BookDetailRepository bookDetailRepository;

    public BookDetailController(BookDetailRepository bookDetailRepository){
        this.bookDetailRepository = bookDetailRepository;
    }

    @GetMapping
    public List<BookDetail> getAllBookDetail(){
        return bookDetailRepository.findAll();
    }
}

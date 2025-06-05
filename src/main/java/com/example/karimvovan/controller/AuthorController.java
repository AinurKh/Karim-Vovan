package com.example.karimvovan.controller;

import com.example.karimvovan.entity.Author;
import com.example.karimvovan.repository.AuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors") //get запрос по авдресу http://localhost:8080/authors
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @GetMapping
    public List<Author> getAllAuthors(){ // возвращает список авторолв
        return authorRepository.findAll();
    }
}

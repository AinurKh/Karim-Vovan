package com.example.karimvovan.entity;

import jakarta.persistence.*;

//Сущность автора
//Описывает автора книги, связан с книгами через поле author_id в Book.
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Уникальный идентификатор автора (генерируется автоматически)
    private Integer id;

    @Column(nullable = false)//обязательно для заполнения
    private String name;

    private Integer birthYear;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}

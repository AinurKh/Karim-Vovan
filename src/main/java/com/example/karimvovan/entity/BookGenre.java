package com.example.karimvovan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book_genres")
public class BookGenre {
    @EmbeddedId
    private BookGenreId id;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @MapsId("genreId")
    @JoinColumn(name = "genre_id")
    private Genre genre;

    //геттеры и сетттеры


    public BookGenreId getId() {
        return id;
    }
    public void setId(BookGenreId id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

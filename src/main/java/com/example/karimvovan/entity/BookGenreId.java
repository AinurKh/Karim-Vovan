package com.example.karimvovan.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable //Использует чтоы сказать: "мой ключ описан в другом классе (BookGenreId).
//чтобы связать book_id и genre_id как уникальную пару
public class BookGenreId implements Serializable {
    private Integer bookId;
    private Integer genreId;

    public BookGenreId() {}
    public BookGenreId(Integer bookId, Integer genreId) {
        this.bookId = bookId;
        this.genreId = genreId;
    }

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public Integer getGenreId() { return genreId; }
    public void setGenreId(Integer genreId) { this.genreId = genreId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookGenreId)) return false;
        BookGenreId that = (BookGenreId) o;
        return Objects.equals(bookId, that.bookId) && Objects.equals(genreId, that.genreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, genreId);
    }
}

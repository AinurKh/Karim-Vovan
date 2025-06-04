CREATE TABLE books(
    id SERIAL PRIMARY KEY,
    title VARCHAR(100)NOT NULL,
    author_id INT NOT NULL,
    publication_year INT
);

CREATE Table book_details(
    id SERIAL PRIMARY KEY,
    book_id INT NOT NULL,
    isbn VARCHAR(13) NOT NULL,
    page_count INT,
    CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES books(id),
    CONSTRAINT unique_book_id UNIQUE (book_id)
);
CREATE TABLE authors(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    birth_year INT
);
CREATE TABLE genres(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);
CREATE TABLE book_genres (
    book INT NOT NULL,
    genre_id INT NOT NULL,
    CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES books(id)),
    CONSTRAINT fk_genre FOREIGN KEY (genre_id) REFERENCES genres(id),
    CONSTRAINT fk_book_genres PRIMARY KEY (book_id, genre_id)
);

ALTER TABLE books
ADD CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES authors(id);
INSERT INTO libraries (name, address) VALUES
('Центральная библиотека им. Г. Тукая', 'ул. Тукая, 31'),
('Централизованная библиотечная система г. Нижнекамска', 'ул. Тихая аллея, 9');

-- Заполнение events
INSERT INTO events (name, event_date) VALUES
('День душнил', '2026-07-01'),
('Ботаник дэй', '2025-06-06');

-- Заполнение authors
INSERT INTO authors (name, birth_year) VALUES
('Лев Толстой', 1828),
('Джоан Роулинг', 1965);

-- Заполнение books
INSERT INTO books (title, author_id, publication_year) VALUES
('Война и мир', 1, 1865),
('Гарри Поттер и Философский камень', 2, 1997);

-- Заполнение book_details (1 к 1 с books)
INSERT INTO book_details (book_id, isbn, page_count) VALUES
(1, '9781234567890', 1225),
(2, '9780747532699', 332);

-- Заполнение genres
INSERT INTO genres (name) VALUES
('Роман'),
('Фэнтези');

-- Заполнение book_genres (многие ко многим)
INSERT INTO book_genres (book_id, genre_id) VALUES
(1, 1),
(2, 2);
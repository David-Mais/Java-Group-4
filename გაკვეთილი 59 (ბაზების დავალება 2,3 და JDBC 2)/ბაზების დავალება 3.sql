-- 1
CREATE TABLE authors (
	id SERIAL PRIMARY KEY,
	first_name TEXT,
	last_name TEXT
);

-- 2
CREATE TABLE books (
	id SERIAL PRIMARY KEY,
	title TEXT NOT NULL,
	author_id INTEGER,
	price DOUBLE PRECISION NOT NULL,
	CONSTRAINT fk_author_id FOREIGN KEY(author_id) REFERENCES authors(id)
);

-- 3
CREATE TABLE sales (
	id SERIAL PRIMARY KEY,
	book_id INTEGER,
	quantity INTEGER,
	sale_date DATE,
	CONSTRAINT fk_book_id FOREIGN KEY(book_id) REFERENCES books(id)
);

-- 4
INSERT INTO authors (first_name, last_name) VALUES
('Jane', 'Austen'),
('Charles', 'Dickens'),
('Mark', 'Twain');

INSERT INTO books (title, author_id, price) VALUES
('Price and prejudice', 1, 19.99),
('David Copperfield', 2, 15.5),
('Adventures of Huckleberry Finn', 3, 8.99),
('Emma', 1, 12.5),
('Great expectations', 2, 10);

INSERT INTO sales (book_id, quantity, sale_date) VALUES
(1, 2, '2024-01-10'),
(2, 1, '2024-01-11'),
(5, 3, '2024-01-12');


-- 5
SELECT *
FROM authors a
INNER JOIN books b ON b.author_id = a.id;

-- 6
SELECT SUM(s.quantity * b.price)
FROM sales s
INNER JOIN books b
ON s.book_id = b.id;

-- 7
SELECT b.title, a.first_name, a.last_name
FROM sales s
JOIN books b ON s.book_id = b.id
JOIN authors a ON b.author_id = a.id
WHERE s.sale_date = '2024-01-12';
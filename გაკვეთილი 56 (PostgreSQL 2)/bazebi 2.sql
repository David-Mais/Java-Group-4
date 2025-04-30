SELECT * FROM students;

DELETE FROM students;

DROP TABLE students;

CREATE TABLE students(
	id INTEGER,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	dob DATE
);

ALTER TABLE students
ADD COLUMN email TEXT;


/* UPDATE & DELETE */
UPDATE students
SET email = 'carter.youthed@gmail.com'
WHERE id = 1;

SELECT * FROM students;

SELECT * FROM students
WHERE first_name = 'Elonore';

DELETE FROM students
WHERE first_name = 'Elonore';



/* CURRENT DATE */
SELECT CURRENT_DATE;

SELECT CURRENT_TIME;

SELECT CURRENT_TIMESTAMP;
SELECT NOW();


CREATE TABLE users (
	id INTEGER,
	first_name TEXT,
	last_name TEXT,
	join_date TIMESTAMP
);

SELECT * FROM users;

INSERT INTO users VALUES (1, 'Davit', 'Maisuradze', CURRENT_TIMESTAMP);


/* UNIQUE */
DROP TABLE courses;
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(50),
	price DECIMAL(6, 2)
);
ALTER TABLE courses
ADD CONSTRAINT unique_course_name UNIQUE(course_name);

CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(50) UNIQUE,
	price DECIMAL(6, 2)
);

INSERT INTO courses VALUES (1, 'Java 1', 1111.9);
INSERT INTO courses VALUES (2, 'Java 2', 1400.67);

SELECT * FROM courses;


/* NOT NULL */
DROP TABLE courses;
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(50) UNIQUE,
	price DECIMAL(6, 2) NOT NULL
);
ALTER TABLE courses
ALTER COLUMN price SET NOT NULL;

INSERT INTO courses VALUES (1, 'Java 1', 1111.9);
INSERT INTO courses (id, course_name) VALUES (2, 'Java 2');

SELECT * FROM courses;


/* CHECK */
DROP TABLE courses;

CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(50) UNIQUE,
	price DECIMAL(6, 2) NOT NULL,
	CONSTRAINT chk_price CHECK( price >= 1000 )
);

INSERT INTO courses VALUES (1, 'Java 1', 1111.9);
INSERT INTO courses VALUES (2, 'Java 2', 870.89);
INSERT INTO courses VALUES (1, 'Java 2', 2983.1);

ALTER TABLE courses
DROP CONSTRAINT chk_price;

ALTER TABLE courses
ADD CONSTRAINT chk_price CHECK( price >= 1000 );

INSERT INTO courses VALUES (4, 'Python 3', 870.89);

SELECT * FROM courses;
DELETE FROM courses WHERE id = 3;


/* DEFAULT */
DROP TABLE courses;
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(50),
	price DECIMAL(6, 2) DEFAULT 100
);

INSERT INTO courses (id, course_name) 
VALUES (4, 'Python 3');

INSERT INTO courses VALUES (5, 'Web 1', 1900.2);

SELECT * FROM courses;


/* PRIMARY KEY */
DROP TABLE games;
CREATE TABLE games (
	id INTEGER PRIMARY KEY,
	game_name TEXT,
	release_date DATE
);

INSERT INTO games VALUES (1, 'Dark Souls Remastered', '2011-10-04');
INSERT INTO games VALUES (2, 'Dark Souls II', '2014-03-11');

SELECT * FROM games;


/* AUTO INCREMENT */
DROP TABLE games;
CREATE TABLE games (
	id SERIAL PRIMARY KEY,
	game_name TEXT,
	release_date DATE
);

INSERT INTO games (game_name, release_date) 
VALUES ('Dark Souls Remastered', '2011-10-04');

INSERT INTO games (game_name, release_date) 
VALUES ('Dark Souls II', '2014-03-11');

SELECT * FROM games;

DELETE FROM games
WHERE id > 2;


/* COUNT */
CREATE TABLE transactions (
	id SERIAL PRIMARY KEY,
	amount DECIMAL(10, 2) DEFAULT 0,
	transaction_date DATE DEFAULT CURRENT_DATE
);

SELECT * FROM transactions;

SELECT COUNT(*) FROM transactions;

SELECT COUNT(*) 
FROM transactions
WHERE amount > 50000;

SELECT COUNT(*) 
FROM transactions
WHERE amount > 95000;


/* MAX / MIN */
SELECT MAX(amount) 
FROM transactions
WHERE transaction_date > '2010-12-01' AND transaction_date < '2011-01-01';

SELECT MIN(transaction_date)
FROM transactions;

/* sum avg */
SELECT AVG(amount) FROM transactions;

SELECT SUM(amount) FROM transactions;
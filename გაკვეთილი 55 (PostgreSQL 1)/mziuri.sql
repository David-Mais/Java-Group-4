CREATE DATABASE mziuri;

CREATE TABLE students(
	id INTEGER,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	dob DATE
);

SELECT * FROM students;

ALTER TABLE moswavleebi RENAME TO students;

DROP TABLE students;

ALTER TABLE students ADD COLUMN email VARCHAR(100);

ALTER TABLE students
RENAME email TO e_mail;

ALTER TABLE students
DROP COLUMN e_mail;


INSERT INTO students VALUES
(1, 'Davit', 'Maisuradze', date('2004-09-20'));

INSERT INTO students VALUES
(1, 'Davit', 'Maisuradze', '2004-09-20');

SELECT * FROM students;

INSERT INTO students VALUES
(2, 'Andria', 'Demuria');

/* problemaa!!! */
INSERT INTO students VALUES
(3, 'Maisuradze', '2004-09-20');

INSERT INTO students (id, last_name, dob) VALUES
(4, 'Maisuradze', '2004-09-20');

SELECT * FROM students;

DELETE FROM students;


INSERT INTO students VALUES
(1, 'Davit', 'Maisuradze', '2004-09-20'),
(2, 'Andria', 'Demuria', '2007-02-11'),
(3, 'Avto', 'Ukhurgunashvili', '2008-08-19'),
(4, 'Giorgi', 'Chqareuli', '2010-01-03');


SELECT * FROM students;



SELECT first_name, last_name
FROM students;

SELECT first_name, dob
FROM students;

SELECT *
FROM students
WHERE id = 3;

SELECT *
FROM students
WHERE true;

SELECT *
FROM students
WHERE first_name = 'Davit';


SELECT *
FROM students
WHERE first_name = 'Andria'
OR first_name = 'Giorgi';


SELECT *
FROM students
WHERE dob >= '2008-01-01';

SELECT *
FROM students
WHERE first_name != 'Davit';
SELECT *
FROM transactions;

/* ORDER BY */
SELECT amount, transaction_date
FROM transactions
ORDER BY amount;

SELECT amount, transaction_date
FROM transactions
ORDER BY amount ASC;

SELECT amount, transaction_date
FROM transactions
ORDER BY amount DESC;

SELECT amount, transaction_date
FROM transactions
ORDER BY transaction_date, amount;


/* LIMIT */
SELECT * FROM transactions LIMIT 10;

SELECT *
FROM transactions
ORDER BY amount DESC
LIMIT 5;


SELECT *
FROM transactions
WHERE transaction_date > '2010-01-01' AND transaction_date < '2012-12-31'
ORDER BY amount ASC
LIMIT 5;

SELECT *
FROM transactions
ORDER BY amount DESC
LIMIT 5 OFFSET 10;


/* FOREIGN KEY */
CREATE TABLE students (
	id SERIAL PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	course_id INTEGER,
	CONSTRAINT cid_fk FOREIGN KEY(course_id) REFERENCES courses(id)
);

CREATE TABLE courses (
	id SERIAL PRIMARY KEY,
	course_name TEXT,
	course_price INTEGER
);

INSERT INTO courses (course_name, course_price) VALUES
('Java 1', 2500),
('Java 2', 3000),
('C++', 1000),
('Python', 9800),
('HTML/CSS', 1600);
SELECT * FROM courses;

INSERT INTO students (first_name, last_name, course_id) VALUES
('Alice', 'Smith', 1),
('Bob', 'Johnson', 2),
('Carol', 'Williams', 3),
('David', 'Jones', 4),
('Eva', 'Brown', 5),
('Frank', 'Davis', 1),
('Grace', 'Miller', 2),
('Henry', 'Wilson', 3),
('Isabel', 'Moore', 4),
('Jack', 'Taylor', 5);

SELECT * FROM students;


/* JOIN */
SELECT * 
FROM students s
INNER JOIN courses c
ON s.course_id = c.id;

SELECT s.first_name, s.last_name, c.course_name
FROM students s
INNER JOIN courses c
ON s.course_id = c.id;


SELECT s.first_name, s.last_name
FROM students s
INNER JOIN courses c
ON s.course_id = c.id
WHERE c.course_name = 'Python';

SELECT * FROM courses
WHERE course_name IN ('Java 1', 'Java 2');

SELECT COUNT(*)
FROM students s
INNER JOIN courses c
ON s.course_id = c.id
WHERE c.course_name IN ('Java 1', 'Java 2');


SELECT s.first_name, s.last_name, c.course_name, c.course_price
FROM students s
JOIN courses c ON s.course_id = c.id
WHERE c.course_price >= 2000;


SELECT c.course_name, COUNT(*) AS student_count
FROM courses c
JOIN students s ON s.course_id = c.id
GROUP BY c.course_name
ORDER BY student_count DESC;

SELECT s.first_name, s.last_name, c.course_name, c.course_price
FROM students s
JOIN courses c on s.course_id = c.id
WHERE c.course_price = (
	SELECT MAX(course_price) FROM courses
);

SELECT COUNT(*) AS java_student_count
FROM students s
INNER JOIN courses c
ON s.course_id = c.id
WHERE c.course_name LIKE '%Java%';
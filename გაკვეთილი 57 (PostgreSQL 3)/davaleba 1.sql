/* 1 */
CREATE DATABASE school;

/* 2 */
CREATE TABLE teachers (
	id BIGINT PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	hire_date DATE,
	email TEXT
);

/* 3 */
SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public';

/* 4 */
INSERT INTO teachers VALUES
(1, 'Nino', 'Kiknadze', '2008-05-10', 'nino.k@example.com'),
(2, 'Giorgi', 'Lomidze', '2010-09-15', 'giorgi.l@example.com'),
(3, 'Mariam', 'Khutsishvili', '2012-03-22', 'mariam.k@example.com'),
(4, 'Levan', 'Beridze', '2005-11-30', 'levan.b@example.com'),
(5, 'Tamar', 'Chubinidze', '2018-01-05', 'tamar.c@example.com');

/* 5 */
SELECT *
FROM teachers
WHERE hire_date >= '2009-01-01';

/* 6 */
ALTER TABLE teachers
ADD COLUMN departament TEXT;

/* 7 */
ALTER TABLE teachers
RENAME COLUMN email TO contact_email;

/* 8 */
SELECT first_name, contact_email
FROM teachers
WHERE hire_date < '2015-01-01' OR hire_date > '2018-12-31';
-- 1
CREATE TABLE students (
	id SERIAL PRIMARY KEY,
	first_name TEXT NOT NULL,
	last_name TEXT NOT NULL,
	dob DATE NOT NULL,
	enrollment_date TIMESTAMP DEFAULT NOW(),
	grade INTEGER NOT NULL CHECK (grade BETWEEN 1 AND 12),
	email TEXT NOT NULL UNIQUE
);

-- 2
INSERT INTO students (first_name, last_name, dob, grade, email) VALUES
('ნიკა',   'ბერიძე',    '2011-04-15', 5,  'nika.beridze@example.com'),
('თეა',   'ჭელიძე',    '2010-09-02', 6,  'tea.chelidze@example.com'),
('მიკა',   'აშურაშვილი','2009-12-20', 7,  'mika.ashurashvili@example.com'),
('ანნა',   'გიორგაშვილი','2012-01-30', 4,  'anna.giorgadze@example.com'),
('დათა',   'მახარაძე',  '2011-07-11', 5,  'data.maharadze@example.com');

-- 3
INSERT INTO students (first_name, last_name, dob, grade, email) VALUES
('ნიკა',   'ბერიძე',    '2011-04-15', 19,  'nika.beridze@GMAIL.com');

INSERT INTO students (first_name, last_name, dob, grade, email) VALUES
('ნიკა',   'ბერიძე',    '2011-04-15', 5,  'nika.beridze@example.com');

-- 4
UPDATE students
SET grade = grade + 1
WHERE first_name = 'თეა';

SELECT * FROM students;

-- 5
DELETE FROM students
WHERE first_name = 'დათა';
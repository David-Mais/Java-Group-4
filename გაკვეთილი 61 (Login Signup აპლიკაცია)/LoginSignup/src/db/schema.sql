CREATE TABLE users
(
    id         SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name  TEXT,
    dob        DATE,
    username   TEXT UNIQUE,
    password   TEXT NOT NULL
);

INSERT INTO users (first_name, last_name, dob, username, password)
VALUES ('Alice', 'Johnson', '1990-05-14', 'alicej', 'password123'),
       ('Bob', 'Smith', '1985-11-23', 'bobsmith', 'securepass'),
       ('Carla', 'Lopez', '1992-03-08', 'carla.lopez', 'qwerty789'),
       ('David', 'Nguyen', '1998-07-30', 'dnguyen98', 'passw0rd!'),
       ('Elena', 'Kumar', '1987-12-15', 'ekumar87', 'myp@ssword');

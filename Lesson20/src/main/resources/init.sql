--------------------------------------------------------
--  DDL for schema students_db
--------------------------------------------------------
DROP SCHEMA IF EXISTS students_db;
CREATE SCHEMA IF NOT EXISTS students_db;

--------------------------------------------------------
--  DDL for Table students_db
--------------------------------------------------------
DROP TABLE IF EXISTS students_db.students;
CREATE TABLE IF NOT EXISTS students_db.students
(
    id       INT          NOT NULL AUTO_INCREMENT,
    name     VARCHAR(45)  NOT NULL,
    surname  VARCHAR(100) NOT NULL,
    course   INT          NOT NULL,
    nameCity VARCHAR(45)  NOT NULL,
    PRIMARY KEY (id)
);

--------------------------------------------------------
--  DML for Table students_db
--------------------------------------------------------
INSERT INTO students_db.students(name, surname, course, nameCity)
VALUES ('Alex', 'Surkov', 1, 'Minsk');
INSERT INTO students_db.students(name, surname, course, nameCity)
VALUES ('Anna', 'Borodich', 2, 'London');
INSERT INTO students_db.students(name, surname, course, nameCity)
VALUES ('Sergey', 'Kryvnitskiy', 3, 'Berlin');
INSERT INTO students_db.students(name, surname, course, nameCity)
VALUES ('Alina', 'Kedich', 4, 'Riga');
INSERT INTO students_db.students(name, surname, course, nameCity)
VALUES ('Petr', 'Medvedzev', 5, 'Los Angeles');
--------------------------------------------------------
--  DDL for schema students_db
--------------------------------------------------------
DROP SCHEMA IF EXISTS users_db;
CREATE SCHEMA IF NOT EXISTS users_db;

--------------------------------------------------------
--  DDL for Table students_db
--------------------------------------------------------
DROP TABLE IF EXISTS users_db.users;
CREATE TABLE IF NOT EXISTS users_db.users
(
    id      INT          NOT NULL AUTO_INCREMENT,
    name    VARCHAR(45)  NOT NULL,
    surname VARCHAR(100) NOT NULL,
    email   VARCHAR(100) NOT NULL,
    date    VARCHAR(20)  NOT NULL,
    PRIMARY KEY (id)
);

--------------------------------------------------------
--  DML for Table users_db
--------------------------------------------------------
INSERT INTO users_db.users(name, surname, email, date)
VALUES ('admin', 'admin', 'admin@admin.ru', str_to_date("28.05.1988", "%d-%m-%Y"))
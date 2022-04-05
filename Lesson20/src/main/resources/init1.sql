--------------------------------------------------------
--  DDL for schema students_db
--------------------------------------------------------
DROP SCHEMA IF EXISTS shop_db;
CREATE SCHEMA IF NOT EXISTS shop_db;
--------------------------------------------------------
--  DDL for Table students_db
--------------------------------------------------------
DROP TABLE IF EXISTS shop_db.products;
CREATE TABLE IF NOT EXISTS shop_db.products
(
    id          INT          NOT NULL AUTO_INCREMENT,
    name        VARCHAR(45)  NOT NULL,
    description VARCHAR(100) NOT NULL,
    price       INT          NOT NULL,
    number      INT          NOT NULL,
    existence   BOOLEAN,
    PRIMARY KEY (id)
);

--------------------------------------------------------
--  DML for Table students_db
--------------------------------------------------------
INSERT INTO shop_db.products(name, description, price, number, existence)
VALUES ('Iphone', 'MobilePhone', 1000, 50, true);
INSERT INTO shop_db.products(name, description, price, number, existence)
VALUES ('Samsung', 'MobilePhone', 800, 150, true);
INSERT INTO shop_db.products(name, description, price, number, existence)
VALUES ('Sony', 'Television', 500, 20, true);
INSERT INTO shop_db.products(name, description, price, number, existence)
VALUES ('Xiaomi', 'Television', 450, 0, false);
INSERT INTO shop_db.products(name, description, price, number, existence)
VALUES ('Indesit', 'Fridge', 900, 10, true);

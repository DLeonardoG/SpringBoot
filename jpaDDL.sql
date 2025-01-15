CREATE DATABASE computers;
USE computers;

CREATE TABLE computer(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    price INT,
    brand VARCHAR(100)
);

CREATE TABLE costumer(
    id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE purchase(
    id INT PRIMARY KEY,
    idCostumer INT,
    idComputer INT,
    FOREIGN KEY (idCostumer) REFERENCES costumer(id),
    FOREIGN KEY (idComputer) REFERENCES computer(id)
);
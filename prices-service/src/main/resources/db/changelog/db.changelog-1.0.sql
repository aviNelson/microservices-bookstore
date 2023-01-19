--liquibase formatted sql

--changeset avinelson:1
CREATE TABLE IF NOT EXISTS price (
id SERIAL PRIMARY KEY,
price NUMERIC(10,4) NOT NULL,
book_id INT NOT NULL
);

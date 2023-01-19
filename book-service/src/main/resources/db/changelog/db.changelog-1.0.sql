--liquibase formatted sql

--changeset avinelson:1
CREATE TABLE IF NOT EXISTS author (
id SERIAL PRIMARY KEY,
first_name VARCHAR(128) NOT NULL,
last_name VARCHAR(128) NOT NULL
);

--changeset avinelson:2
CREATE TABLE IF NOT EXISTS book (
id SERIAL PRIMARY KEY,
title VARCHAR(256) NOT NULL,
author_id INT REFERENCES author(id) NOT NULL
);
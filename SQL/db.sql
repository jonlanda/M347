CREATE DATABASE filmEntity;
USE filmEntity;

CREATE TABLE filmEntity (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255) not null,
    genre varchar(255) not null,
    PRIMARY KEY (id)
);

CREATE TABLE user (
    id int NOT NULL AUTO_INCREMENT,
    username int NOT NULL,

);

CREATE TABLE link (
    id int NOT NULL AUTO_INCREMENT,
    linkValue varchar(255) not null,
    filmId int not null,
    userId int not null,
    FOREIGN KEY (filmId) REFERENCES filmEntity(id),
    PRIMARY KEY (id)
);
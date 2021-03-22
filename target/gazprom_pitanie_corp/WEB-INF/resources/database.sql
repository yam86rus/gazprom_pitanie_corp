-- Создаем пользователя для новой БД
CREATE USER 'username'@'localhost' IDENTIFIED BY 'password';

-- Назначаем права доступа
GRANT ALL PRIVILEGES ON * . * TO 'username'@'localhost';

-- Создаем БД
CREATE DATABASE gazprom_pitanie_db;
USE gazprom_pitanie_db;


-- Блок для Spring Security

CREATE TABLE users (
                       username varchar(15),
                       password varchar(100),
                       enabled tinyint(1),
                       PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
                             username varchar(15),
                             authority varchar(25),
                             FOREIGN KEY (username) references users(username)
) ;

INSERT INTO gazprom_pitanie_db.users (username, password, enabled)
VALUES
('zaur', '{noop}zaur', 1),
('elena', '{noop}elena', 1),
('admin', '{noop}admin', 1),
('ivan', '{noop}ivan', 1);

INSERT INTO gazprom_pitanie_db.authorities (username, authority)
VALUES
('zaur', 'ROLE_EMPLOYEE'),
('elena', 'ROLE_HR'),
('admin', 'ROLE_ADMINISTRATOR'),
('ivan', 'ROLE_HR'),
('ivan', 'ROLE_MANAGER');


-- Создание рабочих таблиц и заполнение тестовыми данными
CREATE TABLE employees (
                           id int NOT NULL AUTO_INCREMENT,
                           name varchar(15),
                           surname varchar(25),
                           department varchar(20),
                           salary int,
                           PRIMARY KEY (id)
);

INSERT INTO gazprom_pitanie_db.employees (name, surname, department, salary)
VALUES
('Ivan', 'Ivanov', 'IT', 500),
('Petr', 'Petrov', 'Sales', 700),
('Maria', 'Sidorova', 'HR', 850);
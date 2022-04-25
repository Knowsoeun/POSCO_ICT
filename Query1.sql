create database web1;
use web;
show tables;
create table books(
book_code int not null auto_increment primary key,
title varchar(50),
author varchar(50),
year varchar(10),
price int);

insert into books (title, author, year, price) values ('운영체제','김필동','2018',30000);
insert into books (title, author, year, price) values ('자바','이한우','2019',35000);
insert into books (title, author, year, price) values ('C언어','박한빛','2020',40000);
select * from books;
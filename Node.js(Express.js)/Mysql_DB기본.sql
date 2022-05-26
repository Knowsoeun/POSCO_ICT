-- DB 보기
show databases;

-- 테이블 삭제
drop table bbs;
drop table member;

USE bbs;
create table MEMBER(
ID VARCHAR(20) PRIMARY KEY NOT NULL,
PWD VARCHAR(20) NOT NULL,
NAME VARCHAR(20) NOT NULL,
AGE VARCHAR(20) NOT NULL,
BIRTH VARCHAR(20) NOT NULL,
ADDRESS VARCHAR(100) NOT NULL,
HEIGHT VARCHAR(20) NOT NULL
);

show databases;
CREATE DATABASE mydb;
USE mydb;

create table tablesample(
id varchar(50),
name varchar(50)
);

insert into tablesample(id, name)
values('abc', '홍길동');

alter user 'root'@'localhost' identified with mysql_native_password by 'gi6271cy';

select * from tablesample;

select host, user from mysql.user;

create user 'root'@'%' identified by 'gi6271cy';

create table 고객(
고객아이디 varchar(20) not null, /*varchar: 문자열, int: 정수형*/
고객이름 varchar(10) not null,  
나이 int,
등급 varchar(10) not null,
직업 varchar(20),
적립금 int default 0,
primary key(고객아이디)
);
show tables;
describe 고객;

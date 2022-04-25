create table customer (
id char(20) primary key,
name varchar(30) not null,
age int not null,
grade varchar(20),
job varchar(30),
point int);
show tables;
describe table customer;
delete from customer;

insert into customer values ('apple', '김현준', 20, 'gold', '학생', 1000);
insert into customer values ('banana', '정소화', 25, 'vip', '간호사', 2500);
insert into customer values ('carrot', '원유선', 28, 'gold', '교사', 4500);
insert into customer values ('orange', '정지영', 22, 'silver', '학생', 0);

select * from customer where grade = 'gold' and point>2000;
select name, grade, point from customer;

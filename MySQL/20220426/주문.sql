create table 주문(
주문번호 char(3) not null, /* char: 고정길이 문자열 */
주문고객 varchar(20), /* varchar: 가변길이 문자열*/
주문제품 char(3),
수량 int,
배송지 varchar(30),
주문일자 datetime,
primary key(주문번호),
foreign key(주문고객) references 고객(고객아이디),
foreign key(주문제품) references 제품(제품번호)
);

show tables;
describe 주문;

insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o01','apple','p03',10,'서울시 마포구','2013-01-01');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o02','melon','p01',5,'인천시 계양구','2013-01-10');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o03','banana','p06',45,'경기도 부천시','2013-01-11');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o04','carrot','p02',8,'부산시 금정구','2013-02-01');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o05','melon','p06',36,'경기도 용인시','2013-02-20');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o06','banana','p01',19,'충청북도 보은군','2013-03-02');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o07','apple','p03',22,'서울시 영등포구','2013-03-15');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o08','pear','p02',50,'강원도 춘천시','2013-04-10');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o09','banana','p04',15,'전라남도 목포시','2013-04-11');
insert into 주문 (주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자) values ('o10','carrot','p03',20,'경기도 안양시','2013-05-22');

select * from 주문;

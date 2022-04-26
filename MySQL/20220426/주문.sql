create table 주문(
주문번호 char(3) not null,
주문고객 varchar(20),
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

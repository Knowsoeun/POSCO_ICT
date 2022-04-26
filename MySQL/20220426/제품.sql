create table 제품 (
제품번호 char(3) not null,
제품명 varchar(20),
재고량 int,
단가 int,
제조업체 varchar(20),
primary key(제품번호),  /*기본키*/
check (재고량 >= 0 and 재고량 <= 10000) /*제약조건*/
);
show tables;
describe 제품;

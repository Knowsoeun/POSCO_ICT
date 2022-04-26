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

insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p01','그냥만두',5000,4500,'대한식품');
insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p02','매운쫄면',2500,5500,'민국푸드');
insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p03','쿵떡파이',3600,2600,'한빛제과');
insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p04','맛난초콜렛',1250,2500,'한비제과');
insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p05','얼큰라면',2200,1200,'대한식품');
insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p06','통통우동',1000,1550,'민국푸드');
insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p07','달콤비스켓',1650,1500,'한빛제과');

select * from 제품;

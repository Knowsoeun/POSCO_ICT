/*새로운 고객 정보 삽입*/
insert into 고객 (고객아이디, 고객이름, 나이, 등급, 직업, 적립금) values ('strawberry','최유경',30,'vip','공무원',100);

/*새로운 고객 정보 삽입-직업 속상에 null값을 삽임*/
insert into 고객 (고객아이디, 고객이름, 나이, 등급, 적립금) values ('tomato','정은심',36,'gold',4000);
select * from 고객;

insert into 제품 (제품번호, 제품명, 재고량, 단가, 제조업체) values ('p04','맛난초콜렛',1250,2500,'한빛제과');

/*부속 질의문을 이용한 데이터 삽입 : values 대신 select from where이 왔다*/
/*insert into 한빛제품(제품명, 재고량, 단가) select 제품명, 재고량, 단가 from 제품 where 제조업체='한빛제과';*/
create table 한빛제품 as (select 제품명, 재고량, 단가 from 제품 where 제조업체='한빛제과');
select * from 한빛제품;

/*데이터 수정: update문*/
update 주문 set 수량=5 where 주문고객 in (select 고객아이디 from 고객 where 고객이름='정소화');
select * from 주문;

/*데이터 삭제: delete문*/
delete from 주문; /*drop table과 달리 빈 테이블이 된다.*/
delete from 주문 where 주문고객 in ( select 고객아이디 from 고객 where 고객이름='정소화');
select * from 주문;

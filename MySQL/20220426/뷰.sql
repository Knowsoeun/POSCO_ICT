/*뷰 활용: 제품1은 기본키가 있으므로 변경 가능하다.*/
create view 제품1 as select 제품번호, 재고량, 제조업체 from 제품 with check option;
select * from 제품1;

/*제품2는 기본키가 없으므로 변경 불가하다.*/
create view 제품2 as select 제품명, 재고량, 제조업체 from 제품 with check option;
select * from 제품2;

insert into 제품1 values ('p08',1000,'신선식품');

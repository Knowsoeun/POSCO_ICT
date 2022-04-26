/*뷰 활용: 제품1은 기본키가 있으므로 변경 가능하다.*/
create view 제품1 as select 제품번호, 재고량, 제조업체 from 제품 with check option;
select * from 제품1;

/*제품2는 기본키가 없으므로 변경 불가하다.*/
create view 제품2 as select 제품명, 재고량, 제조업체 from 제품 with check option;
select * from 제품2;

insert into 제품1 values ('p08',1000,'신선식품');

/*뷰를 삭제해도 기본 테이블은 영향을 받지 않는다.*/
/*drop view 뷰_이름 cacscade | restrict;*/
-- cascade: 삭제할 뷰와 관련된 다른 뷰를 모두 함께 삭제하도록 지정한다.
-- restrict: 삭제할 뷰와 관련된 다른 뷰가 존재하면 삭제를 수행하지 않도록 지정한다.

describe 고객;
-- alter: 테이블 구조 변경
alter table 고객 add 가입날짜 datetime; /* 테이블 구조 변경- datetime 타입의 가입날짜 테이블 추가*/
alter table 고객 drop 가입날짜 cascade; /* 테이블 구조 변경- 가입날짜 테이블 삭제*/
/*cascade : foreign key(외래키) 있을 때 삭제시 뒤에 붙인다.*/
alter table 고객 add constraint cnk_avg check(나이>=20); /*나이가 20보다 작은 사람은 가입 불가*/
insert into 고객 (고객아이디, 고객이름, 나이, 등급, 직업, 적립금) values (
'apple','정소화',20,'gold','학생',1000);
insert into 고객 (고객아이디, 고객이름, 나이, 등급, 직업, 적립금) values (
'banana','jones',19,'gold','학생',1000); /*나이 제약조건에 걸려 insert되지 않는다.*/
alter table 고객 drop constraint cnk_avg;/*제약조건 삭제*/
select * from 고객;

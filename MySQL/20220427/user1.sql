-- user1로 테스트하기

select * from 고객;
delete from 고객 where 고객아이디='tomato'; /*user1에 권한을 주지 않아서 삭제되지 않는다.*/

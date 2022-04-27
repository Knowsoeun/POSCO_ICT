select '100'+'200';         -- 300
select concat('100','200'); -- 100200
select concat(100,'200');   -- 100200
select 1>'2mega';           -- 0
select 3>'2MEGA';           -- 1
select 0='mega2';           -- 1

select if(100>200, '참이다', '거짓이다');  -- 거짓이다
select case 10              -- 십
when 1 then '일'
when 5 then '오'
when 10 then '십'
else '모름' 
end as 'case 연습';

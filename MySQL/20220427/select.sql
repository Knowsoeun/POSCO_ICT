select '100'+'200';         -- 300
select concat('100','200'); -- 100200
select concat(100,'200');   -- 100200
select 1>'2mega';           -- 0
select 3>'2MEGA';           -- 1
select 0='mega2';           -- 1

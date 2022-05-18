
select * from testTable;  -- Alt + C

CREATE TABLE MEMBER(
	ID VARCHAR(50) PRIMARY KEY, 
	PWD VARCHAR(50) NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	EMAIL VARCHAR(50) UNIQUE,   
	AUTH INT NOT NULL
);

 -- PRIMARY KEY: 빈칸 안돼! + 같은 값 안돼!
 -- UNIQUE : 빈칸 돼! + 같은 값 안돼!

select * from MEMBER;
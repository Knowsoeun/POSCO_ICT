create table gugutbl ( txt varchar(100));  -- 구구단 테이블 정의

DELIMITER $$                               -- 프로시저 정의 시작
CREATE PROCEDURE whileProc()               -- 구구단 프로시저 생성
BEGIN                                      -- 시작
	DECLARE str VARCHAR(100);                -- 출력해야되서 저장할 변수 str       
    DECLARE i INT;                         -- n단
    DECLARE k INT;                         -- n
    SET i = 2;                             -- 2단부터 
    WHILE (i < 10) DO                      -- 2~9까지 곱함
        SET k = 1;                         -- 1~9 까지
        WHILE (k < 10) DO                  -- 1~9까지 돈다.
			SET str = '';                        -- str은 처음에 공백으로    
            SET str = CONCAT(str, ' ', i, 'x', k, '=', i * k);  -- str(공백 i X k = i*k) 로 출력될거 공백은 띄어쓰기용
            INSERT INTO pbj_db.guguTBL VALUES(str); -- 2*1 부터 gugutbl에 밀어넣자
            SET k = k + 1;                 -- k값 증가
		END WHILE;                             -- 1~9 까지의 while 끝
        SET i = i + 1;                     -- 1~9까지 돌았으니 i단 증가
	END WHILE;
END $$                                     -- 구구단 프로시저 정의 끝
DELIMITER ;

<!--구구단 실행-->
CALL whileProc();                         

select * from gugutbl;                     -- 구구단 보여주기

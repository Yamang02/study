-- N번째부터 N개 문자 반환
SELECT SUBSTR('SMITH', 1,3)
FROM DUAL;

-- 변수 하나만 주면 해당 문자부터 끝까지
SELECT SUBSTR('SMITH', 1)
FROM DUAL;

-- 음수주면 뒤에서부터 
SELECT SUBSTR('SMITH', -2, 2)
FROM DUAL;
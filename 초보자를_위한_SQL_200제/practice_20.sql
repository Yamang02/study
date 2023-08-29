/* 특정 철자를 다른 철자로 변경, 변경할 대상, 변경할 문자, 변경될 문자*/SELECT
    ENAME,
    REPLACE(SAL, 0, '*')
FROM
    EMP;

-- 월급의 0~3까지 *로 출력
SELECT
    ENAME,
    REGEXP_REPLACE(SAL, '[0-3]', '*') AS SALARY
FROM
    EMP;
    
-- 이름의 2번째 자리의 한글을 *로 출력
SELECT REPLACE(ENAME, SUBSTR(ENAME,2,1), '*') AS "전광판_이름"
FROM EMP;

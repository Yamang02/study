/* 문자형으로 데이터 유형 변환하기 TO_CHAR */

SELECT
    ENAME,
    TO_CHAR(HIREDATE, 'DAY') AS 요일,
    TO_CHAR(SAL, '999,999')  AS 월급
FROM
    EMP
WHERE
    ENAME = 'SCOTT';

SELECT
    HIREDATE,
    TO_CHAR(HIREDATE, 'RRRR') AS 연도,
    TO_CHAR(HIREDATE, 'MM')   AS 달,
    TO_CHAR(HIREDATE, 'DD')   AS 일,
    TO_CHAR(HIREDATE, 'DAY')  AS 요일
FROM
    EMP
WHERE
    ENAME = 'KING';

SELECT
    ENAME,
    HIREDATE
FROM
    EMP
WHERE
    TO_CHAR(HIREDATE, 'RRRR') = '1981';

SELECT
    ENAME                        AS 이름,
    EXTRACT(YEAR FROM HIREDATE)  AS 연도,
    EXTRACT(MONTH FROM HIREDATE) AS 달,
    EXTRACT(DAY FROM HIREDATE)   AS 요일
FROM
    EMP;

SELECT
    ENAME                   AS 이름,
    TO_CHAR(SAL, '999,999') AS 월급
FROM
    EMP;
    
SELECT
    ENAME                   AS 이름,
    TO_CHAR(SAL*200, '999,999,999l') AS 월급
FROM
    EMP    
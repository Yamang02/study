/* 특정날짜가 있는 달의 마지막 날짜 출력하기 LAST_DAY */

SELECT
    '2019/05/22'           AS 날짜,
    LAST_DAY('2019/05/22') AS 마지막_날짜
FROM
    DUAL;

SELECT
    LAST_DAY(SYSDATE) - SYSDATE AS "남은 날짜"
FROM
    DUAL;

SELECT
    ENAME,
    HIREDATE,
    LAST_DAY(HIREDATE)
FROM
    EMP
WHERE
    ENAME = 'KING';
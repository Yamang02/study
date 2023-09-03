/* 특정 철자를 N개만큼 채우기 LPAD, RPAD */

SELECT
    ENAME,
    LPAD(SAL, 10, '*') AS SALARY1,
    RPAD(SAL, 10, '*') AS SALARY2
FROM
    EMP;

/* 막대그래프처럼 시각화하기 */

SELECT
    ENAME,
    SAL,
    LPAD('■',
         ROUND(SAL / 100),
         '■') AS BAR_CHART
FROM
    EMP;
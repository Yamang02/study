/* 72. 서브쿼리 사용하기 ②(다중 행 서브쿼리) */

SELECT
    ENAME,
    SAL
FROM
    EMP
WHERE
    SAL IN (
        SELECT
            SAL
        FROM
            EMP
        WHERE
            JOB = 'SALESMAN'
    );
    
-- 서브쿼리 결과가 단일행이 아니므로 =을 사용하면 에러가 남

SELECT
    ENAME,
    SAL
FROM
    EMP
WHERE
    SAL = (
        SELECT
            SAL
        FROM
            EMP
        WHERE
            JOB = 'SALESMAN'
    );
    
/*
단일 행 서브 쿼리 사용되는 연산자
=, !=, >, <, >=. <=

다중 행 서브 쿼리 사용되는 연산자
IN, NOT IN, >ANY, <ANY, >ALL, <ALL
리스트의 값과 동일, 동일하지 않음
리스트에서 가장 큰 값/작은 값보다 크다/작다

*/    
/* 77.서브쿼리 사용하기 ⑦ (SELECT절의 서브 쿼리) */
SELECT
    ENAME,
    SAL,
    (
        SELECT
            MAX(SAL)
        FROM
            EMP
        WHERE
            JOB = 'SALSEMAN'
    ) AS 최대_월급,
    (
        SELECT
            MIN(SAL)
        FROM
            EMP
        WHERE
            JOB = 'SALESMAN'
    ) AS 최소_월급
FROM
    EMP
WHERE
    JOB = 'SALESMAN';
    
/*
SELECT절의 서브쿼리는 서브쿼리가 SELECT절로 확장되었다고 해서 SCALAR 서브쿼리로 불림
스칼라 서브쿼리는 출력되는 행 수 만큼 반복되어 실행됨

같은 SQL이 반복되어 실행되므로, 첫 행을 출력할 때 최대 월급과 최소월급을 메모리에 올려두고 나머지는 메모리에 올려둔 데이터를 출력함
서브쿼리 캐싱

*/    
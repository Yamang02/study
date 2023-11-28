/*75. 서브쿼리 사용하기 ⑤ (HAVING절의 서브쿼리)*/

-- 직업과 직업별 토탈월급 중, SALESMAN들의 토탈월급보다 더 큰 값들만 출력

SELECT
    JOB,
    SUM(SAL)
FROM
    EMP
GROUP BY
    JOB
HAVING
    SUM(SAL) > (
        SELECT
            SUM(SAL)
        FROM
            EMP
        WHERE
            JOB = 'SALESMAN'
    );
    
-- WHERE절로 하면 그룹함수 허가되지 않음

/*
SELECT , FROM , WHERE, HAVING, ORDER BY 는 서브쿼리문 사용 가능
GROUP BY 는 서브쿼리 사용 불가능

SELECT, ORDER BY 는 스칼라 서브 쿼리라고 불림
FROM 서브쿼리는 IN LINE VIEW

*/
/* 110. WITH절 사용하기 ② (SUBQUERY FACTORING)*/
WITH JOB_SUMSAL AS (
    SELECT
        JOB,
        SUM(SAL) AS 토탈
    FROM
        EMP
    GROUP BY
        JOB
), DEPNO_SUMSAL AS (
    SELECT
        DEPTNO,
        SUM(SAL) AS 토탈
    FROM
        EMP
    GROUP BY
        DEPTNO
    HAVING
        SUM(SAL) > (
            SELECT
                AVG(토탈) + 3000
            FROM
                JOB_SUMSAL
        )
)
SELECT
    DEPTNO,
    토탈
FROM
    DEPNO_SUMSAL
    
/*
WITH절을 사용하면 특정 서브 쿼리문의 컬럼을 다른 서브 쿼리문에서 참조하는 것이 가능
FROM절을 이용하면 불가
WITH절의 쿼리의 결과를 임시 테이블로 생성하는 것을 SUBQUERY FACTORING
*/    
/* 71.서브 쿼리 사용하기 ① (단일행 서브쿼리)*/

-- JONES보다 더 많은 월급을 받는 사원들의 이름과 월급을 출력

SELECT
    E.ENAME,
    E.SAL
FROM
    EMP E
WHERE
    SAL > (
        SELECT
            SAL
        FROM
            EMP
        WHERE
            ENAME = 'JONES'
    );
    
-- SCOTT 과 같은 월급을 받는 사원들의 이름과 월급을 출력하는 쿼리
SELECT
    E.ENAME,
    E.SAL
FROM
    EMP E
WHERE
        SAL = (
            SELECT
                SAL
            FROM
                EMP
            WHERE
                ENAME = 'SCOTT'
        )
    -- SCOTT은 제외
    AND ENAME <> 'SCOTT';
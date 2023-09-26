/* 데이터 분석 함수로 바로 전 행과 다음 행 출력 (LAG, LEAD) */

SELECT
    E.EMPNO,
    E.ENAME,
    E.JOB,
    SAL,
    LAG(SAL, 1)
    OVER(
        ORDER BY
            SAL ASC
    ) "전 행",
    LEAD(SAL, 1)
    OVER(
        ORDER BY
            SAL ASC
    ) "다음 행"
FROM
    EMP E
WHERE
    E.JOB IN ( 'ANALYST', 'MANAGER' );
    
/* 직업이 ANALYST 또는 MANAGER인 사원들의 사원 번호, 이름, 입사일, 바로 전에 입사한 사원의 입사일과 바로 다음에 입사한 사원의 입사일*/

SELECT
    E.EMPNO,
    E.ENAME,
    E.HIREDATE,
    LAG(E.ENAME, 1)
    OVER(
        ORDER BY
            HIREDATE ASC
    ) AS "이전 입사사원",
    LAG(E.HIREDATE, 1)
    OVER(
        ORDER BY
            HIREDATE ASC
    ) "전 행",
    LEAD(E.ENAME)
    OVER(
        ORDER BY
            HIREDATE ASC
    ) AS "이후 입사 사원"
FROM
    EMP E
WHERE
    E.JOB IN ( 'ANALYST', 'MANAGER' );

SELECT
    E.DEPTNO,
    E.EMPNO,
    E.ENAME,
    E.HIREDATE,
    LAG(HIREDATE, 1)
    OVER(PARTITION BY DEPTNO
         ORDER BY
             HIREDATE ASC
    ) "전 행",
    LEAD(HIREDATE, 1)
    OVER(PARTITION BY DEPTNO
         ORDER BY
             HIREDATE ASC
    ) "다음 행"
FROM
    EMP E;
-- ROW를 COLUMN으로 출력하기 2 (PIVOT)
SELECT
    *
FROM
    (
        SELECT
            DEPTNO,
            SAL
        FROM
            EMP
    ) PIVOT (
        SUM(SAL)
        FOR DEPTNO
        IN ( 10,
        20,
        30 )
    )
    
-- 
SELECT
    *
FROM
    (
        SELECT
            DEPTNO,
            SAL
        FROM
            EMP
    );

SELECT
    *
FROM
    (
        SELECT
            JOB,
            SAL
        FROM
            EMP
    ) PIVOT (
        SUM(SAL)
        FOR JOB
        IN ( 'ANALYST',
        'CLERK',
        'MANAGER',
        'SALESMAN' )
    );

SELECT * FROM (SELECT JOB, SAL FROM EMP) PIVOT (SUM(SAL) FOR JOB IN ('ANALYST' AS "ANALYST"))


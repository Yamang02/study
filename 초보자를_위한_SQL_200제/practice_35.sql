/* IF문을 SQL로 구현하기 ② (CASE) */
SELECT
    ENAME,
    JOB,
    SAL,
    CASE
        WHEN SAL >= 3000 THEN
            500
        WHEN SAL >= 2000 THEN
            300
        WHEN SAL >= 1000 THEN
            200
        ELSE
            0
    END AS BONUS
FROM
    EMP
WHERE
    JOB IN ( 'SALESMAN', 'ANALYST' );

SELECT
    ENAME,
    JOB,
    COMM,
    CASE
        WHEN COMM IS NULL THEN
            500
        ELSE
            0
    END BONUS
FROM
    EMP
WHERE
    JOB IN ( 'SALESMAN', 'ANALYST' );

SELECT
    ENAME,
    JOB,
    CASE
        WHEN JOB IN ( 'SALESMAN', 'ANALYST' ) THEN
            500
        WHEN JOB IN ( 'CLERK', 'MANAGER' ) THEN
            400
        ELSE
            0
    END AS 보너스
FROM
    EMP;
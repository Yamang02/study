/* 논리연산자 AND OR NOT */

SELECT
    ENAME,
    SAL,
    JOB
FROM
    EMP
WHERE
        JOB = 'SALESMAN'
    AND SAL >= 1200;
    
-- TRUE AND NULL -> NULL
-- TRUE OR NULL -> TRUE


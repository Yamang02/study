/* 토탈값 출력하기(SUM) */
SELECT
    DEPTNO,
    SUM(SAL)
FROM
    EMP
GROUP BY
    DEPTNO;


/* 순서 FROM > GROUP BY > SELECT > ORDER BY */
SELECT
    JOB,
    SUM(SAL)
FROM
    EMP
GROUP BY
    JOB
ORDER BY
    SUM(SAL) DESC;

/* GROUP BY 절에는 WHERE 절 대신 HAVING을 사용해야 한다.*/
SELECT
    JOB,
    SUM(SAL)
FROM
    EMP
WHERE
    SUM(SAL) >= 4000
GROUP BY
    JOB;

SELECT
    JOB,
    SUM(SAL)
FROM
    EMP
GROUP BY
    JOB
HAVING
    SUM(SAL) >= 4000;

/* 순서 FROM > WHERE > GROUP BY > HAVING > SELECT > ORDER BY */
SELECT
    JOB,
    SUM(SAL)
FROM
    EMP
WHERE
    JOB != 'SALESMAN'
GROUP BY
    JOB
HAVING
    SUM(SAL) >= 4000;
    
    
 /* 순서로 인해 별칭 문제 발생함 */   
 
 SELECT
    JOB AS 직업,
    SUM(SAL)
FROM
    EMP
WHERE
    JOB != 'SALESMAN'
GROUP BY
    직업
HAVING
    SUM(SAL) >= 4000;
SELECT
    ENAME,
    SAL * 12 AS "연봉"
FROM
    EMP
WHERE
    SAL * 12 >= 36000;
    
/*연산 순서*/
SELECT
    300 + 200 * 2
FROM
    DUAL;
-- 700

SELECT
    ( 300 + 200 ) * 2
FROM
    DUAL;
-- 1000

SELECT
    ENAME,
    SAL,
    COMM,
    SAL + COMM
FROM
    EMP
WHERE
    DEPTNO = 10;
    
    /* NULL 값의 처리 */

SELECT
    SAL + COMM
FROM
    EMP
WHERE
    ENAME = 'KING';

SELECT
    SAL + NVL(COMM,0)
FROM
    EMP
WHERE
    ENAME = 'KING';
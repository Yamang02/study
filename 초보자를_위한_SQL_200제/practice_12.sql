/* 비교연산자 LIKE */


SELECT
    ENAME,
    SAL
FROM
    EMP
WHERE
    ENAME LIKE 'S%';

SELECT
    ENAME
FROM
    EMP
WHERE
    ENAME LIKE '_M%';
    
SELECT ename
FROM emp 
WHERE ename LIKE '%T';

SELECT ename
FROM emp 
WHERE ename LIKE '%A%';
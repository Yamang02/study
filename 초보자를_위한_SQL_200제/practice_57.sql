/*
57. 출력되는 행 제한하기 ② (Simple TOP-n Queries)
*/

-- 월급이 높은 사원순으로 사원 번호, 이름, 직업, 월급을 4개행으로 제한해서 출력
/*FETCH FIRST 4 ROWS ONLY works only in Oracle 12c.*/
SELECT
    EMPNO,
    ENAME,
    JOB,
    SAL
FROM
    EMP E
ORDER BY
    E.SAL DESC
FETCH FIRST 4 ROWS ONLY;

SELECT
    EMPNO,
    ENAME,
    JOB,
    SAL
FROM
    EMP
ORDER BY
    SAL DESC
FETCH FIRST 20 PERCENT ROWS ONLY;

-- 20% 해당하는 결과만 보여줌

-- WITH TIES 옵션을 활용하면, 여러 행이 N번째 행의 값과 동일할 때 같이 출력해줌

SELECT
    EMPNO,
    ENAME,
    JOB,
    SAL
FROM
    EMP
ORDER BY
    SAL DESC
FETCH FIRST 2 ROWS WITH TIES;

-- OFFSET을 활용해 N+1 번째 행부터 출력할 수 있다.
SELECT EMPNO, ENAME, JOB, SAL
FROM EMP
ORDER BY SAL DESC OFFSET 9 ROWS;

-- OFFSET 과 FETCH 조합해 사용도 가능하다.
SELECT EMPNO, ENAME, JOB, SAL
FROM EMP
ORDER BY SAL DESC OFFSET 9 ROWS
FETCH FIRST 2 ROWS ONLY;
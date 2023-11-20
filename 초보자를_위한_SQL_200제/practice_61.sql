/*60. 여러 테이블의 데이터를 조인해서 출력하기 ④(SELF JOIN)*/

SELECT
    E.ENAME 사원,
    E.JOB   직업,
    M.ENAME 관리자,
    M.JOB   직업
FROM
    EMP E,
    EMP M
WHERE
        E.MGR = M.EMPNO
    AND E.JOB = 'SALESMAN';
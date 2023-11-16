SELECT
    E.ENAME 이름,
    E.JOB   직업,
    E.SAL   AS 월급,
    D.LOC   AS 부서_위치
FROM
         EMP E
    JOIN DEPT D USING ( DEPTNO )
WHERE
    E.JOB = 'SALESMAN';
    
-- 테이블. 을 사용하면 안되고 (사용시 ORA-01748)
-- 반드시 괄호를 사용해야 한다. (사용시 ORA-00906)
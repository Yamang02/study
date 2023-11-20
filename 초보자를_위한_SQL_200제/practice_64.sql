SELECT
    E.ENAME AS 이름,
    E.JOB   AS 직업,
    E.SAL   AS 월급,
    D.LOC   AS 부서_위치
FROM
         EMP E
    NATURAL JOIN DEPT D
WHERE
    E.JOB = 'SALESMAN';
    
-- 두 테이블에 둘 다 존재하는 동일한 컬럼을 기반으로 암시적인 조인을 수행


SELECT
    E.ENAME AS 이름,
    E.JOB   AS 직업,
    E.SAL   AS 월급,
    D.LOC   AS 부서_위치
FROM
         EMP E
    NATURAL JOIN DEPT D
WHERE
    D.DEPTNO = 10;

-- 두 테이블의 연결고리가 되는 것은 테이블 식별자가 있으면 안된다.

SELECT
    E.ENAME AS 이름,
    E.JOB   AS 직업,
    E.SAL   AS 월급,
    D.LOC   AS 부서_위치
FROM
         EMP E
    NATURAL JOIN DEPT D
WHERE
    DEPTNO = 30;
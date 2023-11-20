/* 여러 테이블의 데이터를 조인해서 출력하기 ①(EQUI JOIN)*/

-- 사원과 테이블과 부서테이블 조인하여 이름과 부서 위치 출력
SELECT
    E.ENAME,
    D.LOC
FROM
    EMP  E,
    DEPT D
WHERE
    E.DEPTNO = D.DEPTNO;
    
-- 조인 조건이 이퀄이면 EQUI JOIN

SELECT
    E.ENAME,
    D.LOC
FROM
    EMP  E,
    DEPT D
WHERE
        E.DEPTNO = D.DEPTNO
    AND E.JOB = 'ANALYST';
    
-- 중복된 컬럼은 어떤 테이블을 기준으로 출력할 것인지 명시해줘야 함

SELECT
    E.ENAME,
    D.LOC,
    E.DEPTNO
FROM
    EMP  E,
    DEPT D
WHERE
        E.DEPTNO = D.DEPTNO
    AND E.JOB = 'ANALYST';

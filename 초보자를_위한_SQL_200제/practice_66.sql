/*66.여러 테이블의 데이터를 조인해서 출력하기 ⑨ (FULL OUTER JOIN)*/

SELECT
    E.ENAME,
    E.JOB,
    E.SAL,
    D.LOC
FROM
    EMP  E
    FULL OUTER JOIN DEPT D ON ( E.DEPTNO = D.DEPTNO );
    
-- 오라클 조인으로 양쪽 테이블에 (+)를 붙일 수 없다
-- 붙이면 ORA-01468 : OUTER-JOIN된 테이블은 1개만 지정할 수 있습니다.

-- FULL 아우터 조인은 LEFT와 RIGHT OUTER 조인한 결과를 UNION해서 동일한 결과를 나타낼 수 있다.
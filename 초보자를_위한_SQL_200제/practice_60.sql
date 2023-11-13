/* 60. 여러 테이블의 데이터를 조인해서 출력하기 ③(OUTER JOIN) */SELECT
    E.ENAME,
    D.LOC
FROM
    EMP  E,
    DEPT D
WHERE
    E.DEPTNO (+) = D.DEPTNO
    
-- OUTER 조인 사인(+)은 테이블 중 결과가 덜 나오는 쪽에 붙여줌
-- 위 내용은 오른쪽의 내용을 모두 보여주므로 RIGHT OUTER JOIN이다. 
/*집합 연산자로 데이터를 위아래로 연결하기 ②(UNION)*/

SELECT
    DEPTNO,
    SUM(SAL)
FROM
    EMP
GROUP BY
    DEPTNO
UNION
SELECT
    NULL AS DEPTNO,
    SUM(SAL)
FROM
    EMP;
    
-- 중복된 자료가 제거됨
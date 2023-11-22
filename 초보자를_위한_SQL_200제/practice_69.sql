/*69. 집합 연산자로 데이터의 교집합을 출력하기(INTERSECT)*/

SELECT
    ENAME,
    SAL,
    JOB,
    DEPTNO
FROM
    EMP
WHERE
    DEPTNO IN ( 10, 20 )
INTERSECT
SELECT
    ENAME,
    SAL,
    JOB,
    DEPTNO
FROM
    EMP
WHERE
    DEPTNO IN ( 20, 30 )
    
/*
UNION 연산자와 마찬가지로 중복된 데이터를 제거하고 결과 데이터를 내림차순으로 정렬해서 출력
*/
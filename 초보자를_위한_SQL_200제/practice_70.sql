/*70.집합 연산자로 데이터의 차이를 출력하기(MINUS)*/

SELECT
    E.ENAME,
    E.SAL,
    E.JOB,
    E.DEPTNO
FROM
    EMP E
WHERE
    DEPTNO IN ( 10, 20 )
MINUS
SELECT
    E.ENAME,
    E.SAL,
    E.JOB,
    E.DEPTNO
FROM
    EMP E
WHERE
    DEPTNO IN ( 20, 30 );
    
/*
MINUS 연산자도 결과 데이터를 내림차순으로 정렬해서 출력
중복제거 역시 제거함
*/    
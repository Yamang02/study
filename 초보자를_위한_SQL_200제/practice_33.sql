/* NULL값 대신 다른 데이터 출력하기(NVL, NVL2) */

SELECT
    ENAME,
    COMM,
    NVL(COMM, 0)
FROM
    EMP;

SELECT
    ENAME,
    SAL,
    COMM,
    SAL + COMM
FROM
    EMP
WHERE
    JOB IN ( 'SALESMAN', 'ANALYST' );
    
 -- NULL값과 더했을 때 NULL이 나오지 않게 한다.
SELECT
    ENAME,
    SAL,
    COMM,
    NVL(COMM, 0),
    SAL + NVL(COMM, 0)
FROM
    EMP
WHERE
    JOB IN ( 'SALESMAN', 'ANALYST' );   
    
-- NVL2 함수를 이용해 T / F 시 값을 설정할 수 있다.
SELECT
    ENAME,
    SAL,
    COMM,
    NVL2(COMM, SAL + COMM, SAL)
FROM
    EMP
WHERE
    JOB IN ( 'SALESMAN', 'ANALYST' );
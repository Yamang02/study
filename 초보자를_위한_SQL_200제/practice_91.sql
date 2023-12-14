/* 91. 계층형 질의문으로 서열을 주고 데이터 출력하기 ③ */
/* 서열순서 유지하며 월급이 높은 사원 출력 */
SELECT
    RPAD(' ', LEVEL * 3)
    || ENAME AS EMPLOYEE,
    LEVEL,
    SAL,
    JOB
FROM
    EMP
START WITH
    ENAME = 'KING'
CONNECT BY
    PRIOR EMPNO = MGR
ORDER SIBLINGS BY
    SAL DESC;
    
SELECT
    RPAD(' ', LEVEL * 3)
    || ENAME AS EMPLOYEE,
    LEVEL,
    SAL,
    JOB
FROM
    EMP
START WITH
    ENAME = 'KING'
CONNECT BY
    PRIOR EMPNO = MGR
ORDER  BY
    SAL DESC;    
    
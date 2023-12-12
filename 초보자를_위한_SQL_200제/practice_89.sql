/* 89. 계층형 질의문으로 서열을 주고 데이터를 출력하기 ①*/

/* 계층형 질의로 사원 이름, 월급, 직업 출력 + LEVEL 같이 출력 */

SELECT
    RPAD('  ', LEVEL + 3)
    || ENAME AS EMPLOYEE,
    LEVEL,
    SAL,
    JOB
FROM
    EMP
START WITH
    ENAME = 'KING'
CONNECT BY
    PRIOR EMPNO = MGR;
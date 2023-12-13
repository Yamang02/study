/* 90. 계층형 질의문으로 서열을 주고 데이터 출력하기 ② */
/* 89의 결과에서 BLAKE와 직속 부하들은 제외, 직속 부하들까지 제외하려면 CONNECT BY 절에 조건을 줌 */

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
CONNECT BY PRIOR EMPNO = MGR
           AND ENAME != 'BLAKE';
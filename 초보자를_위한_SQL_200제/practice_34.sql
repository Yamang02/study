/* IF문을 SQL로 구현하기 ① (DECODE) */

SELECT
    ENAME,
    DEPTNO,
    DECODE(DEPTNO, 10, 300, 20, 400,
           0) AS 보너스
FROM
    EMP;


/* 사원 번호와 사원 번호가 짝수인지 홀수인지 판단  */
SELECT
    EMPNO,
    MOD(EMPNO, 2),
    DECODE(MOD(EMPNO, 2),
           0,
           '짝수',
           1,
           '홀수') AS 보너스
FROM
    EMP;
    
/* 이름과 직업과 보너스를 출력하는데 직업이 SALESMAN이면 보너스 5000을 출력하고 나머지 직업은 보너스 2000을 출력하는 예제 */
SELECT
    ENAME,
    JOB,
    DECODE(JOB, 'SALESMAN', 5000, 2000) AS 보너스
FROM
    EMP;
    

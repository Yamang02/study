/*나눈 나머지 값 출력하기 MOD,  몫 FLOOR*/

SELECT MOD(10,3)
FROM dual;

/* 홀짝 */
SELECT empno, MOD(empno,2)
FROM emp;

SELECT empno, ename
FROM emp
WHERE MOD(empno,2) = 0;

SELECT FLOOR(10/3)
FROM dual;
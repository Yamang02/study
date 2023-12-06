/* 83. LOCK 이해하기 */

/*1. 세션 1에서 UPDATE문 */
UPDATE EMP SET SAL = 3000
WHERE ENAME='JONES';

/*2. 세션 2에서 UPDATE문 -- 대기하게 됨 */
UPDATE EMP SET SAL = 9000
WHERE ENAME='JONES';


/* COMMIT시 1이 적용됨 */
COMMIT;

/* 2의 내용은 2세션에서 커밋하면 적용됨*/
/* SELECT 문의 결과는 각 세션의 커밋 시점에 따라 달라짐*/
SELECT *
FROM EMP 
WHERE ENAME = 'JONES';


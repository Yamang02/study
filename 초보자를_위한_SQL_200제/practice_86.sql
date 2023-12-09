/* 86. 서브 쿼리를 사용하여 데이터 수정하기 */

/* 직업이 SALESMAN 인 사원들의 월급을 ALLEN의 월급으로 변경 */
UPDATE EMP
SET
    SAL = (
        SELECT
            SAL
        FROM
            EMP
        WHERE
            ENAME = 'ALLEN'
    )
WHERE
    JOB = 'SALESMAN';
    
/* UPDATE문은 모든 절에서 서브 쿼리를 사용할 수 있다. */
/* SET절에 여러 개의 컬럼들을 기술하여 한 번에 갱신할 수도 있다. */

UPDATE EMP SET (SAL, COMM) = (SELECT SAL, COMM FROM EMP WHERE ENAME = 'ALLEN')
WHERE ENAME = 'SCOTT';

/* 만약에 서브쿼리 조회 결과가 NULL이라면? */

ROLLBACK;

SELECT * FROM EMP WHERE ENAME = 'SCOTT';

/* NULL 로 바뀜 */
UPDATE EMP SET (SAL, COMM) = (SELECT SAL, COMM FROM EMP WHERE 1=0)
WHERE ENAME = 'SCOTT';

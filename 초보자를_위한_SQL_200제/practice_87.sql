/* 87. 서브쿼리를 사용하여 데이터 삭제하기 */

/* SCOTT보다 더 많은 월급을 받는 사원 삭제 */
DELETE FROM EMP
WHERE
    SAL > (
        SELECT
            SAL
        FROM
            EMP
        WHERE
            ENAME = 'SCOTT'
    );
    
ROLLBACK; 

/* 월급이 해당 사원이 속한 부서의 평균 월급보다 크면 삭제 */
DELETE FROM EMP M
WHERE
    SAL > (
        SELECT
            AVG(SAL)
        FROM
            EMP S
        WHERE
            S.DEPTNO = M.DEPTNO
    )
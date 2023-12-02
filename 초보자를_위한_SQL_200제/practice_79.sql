/* 79. 데이터 수정하(UPDATE) */

UPDATE EMP
SET
    SAL = 3200
WHERE
    ENAME = 'SCOTT';
    
/* 조건이 없으면 해당되는 여러 행들이 모두 업데이트 됨 */

UPDATE EMP
SET
    SAL = 5000,
    COMM = 200
WHERE
    ENAME = 'SCOTT';

/* UPDATE의 모든 절에서 서브쿼리 사용 가능 */

UPDATE EMP
SET
    SAL = (
        SELECT
            SAL
        FROM
            EMP
        WHERE
            ENAME = 'KING'
    )
WHERE
    ENAME = 'SCOTT';
    
SELECT
    *
FROM
    EMP
WHERE
    ENAME = 'SCOTT';
ROLLBACK;
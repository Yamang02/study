/* 85. 서브쿼리를 사용하여 데이터 입력하기 */

CREATE TABLE EMP2
    AS
        SELECT
            *
        FROM
            EMP
        WHERE
            1 = 2;


INSERT INTO EMP2 (
    EMPNO,
    ENAME,
    SAL,
    DEPTNO
)
    SELECT
        EMPNO,
        ENAME,
        SAL,
        DEPTNO
    FROM
        EMP
    WHERE
        DEPTNO = 10;
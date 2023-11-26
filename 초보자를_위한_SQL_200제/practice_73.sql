/* 73. 서브쿼리 사용하기 ③(NOT IN)*/

SELECT
    ENAME,
    SAL,
    JOB
FROM
    EMP
WHERE
    EMPNO NOT IN (
        SELECT
            MGR
        FROM
            EMP
        WHERE
            MGR IS NOT NULL
    );
    
/* 
서브쿼리의 WHERE절에 MGR IS NOT NULL이 없으면 레코드가 나오지 않는다 
*/

SELECT
    ENAME,
    SAL,
    JOB
FROM
    EMP
WHERE
    EMPNO NOT IN (
        SELECT
            MGR
        FROM
            EMP
    );
    
/* WHERE 에 NOT IN 이 TRUE AND TRUE AND ... NULL 로 나타나면 전체가 NULL이 되어버리기 때문 */
/* 
PART3 중급 SQL실력 다지기
56. 출력되는 행 제한하기 ① (ROWNUM)
*/

SELECT
    ROWNUM,
    EMPNO,
    ENAME,
    JOB,
    SAL
FROM
    EMP
WHERE
    ROWNUM <= 5;
    
/*
ROWNUM은 PESUDO COLUMN으로 *로 검색해서는 출력되지 않는 감취진 컬럼
*/
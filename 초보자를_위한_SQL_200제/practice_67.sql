/*67. 집한 연산자로 데이터를 위아래로 연결하기 ①(UNION ALL)*/

DELETE FROM EMP
WHERE
    DEPTNO = 50;

COMMIT;

SELECT
    DEPTNO,
    SUM(SAL)
FROM
    EMP
GROUP BY
    DEPTNO
UNION ALL
SELECT
    TO_NUMBER(NULL) AS DEPTNO,
    SUM(SAL)
FROM
    EMP;
    
 -- 집합 연사자 사용시 주의사항
 /*
 위쪽 커리와 아래쪽 쿼리 컬럼의 개수가 동일
 데이터 타입 동일
 결과 컬럼명은 위쪽 쿼리의 컬럼영 
 ORDER BY 는 가장 아래쪽 쿼리에만 작성 가능
 중복이 있어도 제거하지 않음
 */
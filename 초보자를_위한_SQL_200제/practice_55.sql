-- 55.데이터 분석 함수로 출력 결과 넘버링 하기(ROW_NUMBER)
SELECT
    E.EMPNO,
    E.ENAME,
    E.SAL,
    RANK()
    OVER(
        ORDER BY
            E.SAL DESC
    ) AS RANK,
    DENSE_RANK()
    OVER(
        ORDER BY
            E.SAL DESC
    ) AS DENSE_RANK,
    ROW_NUMBER()
    OVER(
        ORDER BY
            SAL DESC
    ) AS 번호
FROM
    EMP E
WHERE
    E.DEPTNO = 20;

/* 
ROW_NUMBER()는 출력되는 결과에 번호를 순서대로 부여해서 출력
OVER 다음 괄호에 반드시 ORDER BY 절을 기술해야 함
그렇지 않으면 ORA-30485 오류 발생
*/

-- 부서 번호별로 웗에 대한 순위를 출력하는 쿼리, PARTITION 사용

SELECT
    E.DEPTNO,
    E.ENAME,
    E.SAL,
    ROW_NUMBER()
    OVER(PARTITION BY DEPTNO
         ORDER BY
             E.SAL DESC
    ) AS "번호"
FROM
    EMP E
WHERE
    DEPTNO IN ( 10, 20 );
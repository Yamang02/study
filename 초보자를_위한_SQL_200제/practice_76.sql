/* 76. 서브 쿼리 사용하기 ⑥ (FROM절의 서브 쿼리)*/

SELECT
    V.ENAME,
    V.SAL,
    V.순위
FROM
    (
        SELECT
            ENAME,
            SAL,
            RANK()
            OVER(
                ORDER BY
                    SAL DESC
            ) 순위
        FROM
            EMP
    ) V
WHERE
    V.순위 = 1;
    
/*
FROM절의 서브 쿼리를 IN LINE VIEW라고 한다. 
서브쿼리를 사용하지 않고 WHERE 절을 이용하면 오류 발생
*/

SELECT
    ENAME N,
    SAL   S,
    RANK()
    OVER(
        ORDER BY
            SAL DESC
    )     순위
FROM
    EMP
WHERE
    RANK()
    OVER(
        ORDER BY
            SAL DESC
    ) = 1;
    
/* ORA-30483 
윈도우 함수를 여기에 사용할 수 없습니다.
WHERE 절에는 분석 함수를 사용할 수 없다.
*/
    
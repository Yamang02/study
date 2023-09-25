/* 데이터 분석 함수로 순위의 비율 출력하기(CUME_DIST)*/

SELECT
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
            SAL DESC
    ) AS DENSE_RANK,
    CUME_DIST()
    OVER(
        ORDER BY
            SAL DESC
    ) AS CUM_DIST
FROM
    EMP E;

SELECT
    E.ENAME,
    E.SAL,
    RANK()
    OVER(PARTITION BY E.JOB
         ORDER BY
             E.SAL DESC
    ) AS RANK,
    CUME_DIST()
    OVER(PARTITION BY JOB
         ORDER BY
             SAL DESC
    ) AS CUM_DIST
FROM
    EMP E;
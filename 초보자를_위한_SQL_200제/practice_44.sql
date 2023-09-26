/* 데이터 분석 함수로 순위의 비율 출력하기(CUME_DIST)*/
/*  */

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

/* 같은 등수가 없고 그 등수에 해당하는 사원이 한 명이면 전체 등수로 해당 등수를 나눠서 계산하고, 같은 등수가 여러 명 있으면 여러 명 중 마지막 등수로 계산 */
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
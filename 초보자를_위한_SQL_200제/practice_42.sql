/* 데이터 분석 함수로 순위 출력하기 ②(DENSE_RANK)*/
-- 동랭크를 넘어가지 않고 계산함
SELECT
    ENAME,
    JOB,
    SAL,
    RANK()
    OVER(
        ORDER BY
            SAL DESC
    ) AS RANK,
    DENSE_RANK()
    OVER(
        ORDER BY
            SAL DESC
    ) AS DENSE_RANK
FROM
    EMP
WHERE
    JOB IN ( 'ANALYST', 'MANAGER' );

SELECT
    DENSE_RANK(2975) WITHIN GROUP(ORDER BY SAL DESC) 순위
FROM
    EMP;
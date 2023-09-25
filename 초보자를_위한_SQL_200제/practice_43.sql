/* 데이터 분석 함수로 등급 출력하기(NTILE)*/
SELECT
    ename,
    job,
    sal,
    NTILE (4) over (
        order by
            sal desc nulls last
    ) 등급
FROM
    EMP
WHERE
    JOB IN ('ANALYST', 'MANAGER', 'CLERK');
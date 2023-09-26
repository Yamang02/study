/* 데이터 분석 함수로 등급 출력하기(NTILE)*/
/* 파라미터로 나눌 등급 제시, nulls last는 null를 마지막에 출력 */


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
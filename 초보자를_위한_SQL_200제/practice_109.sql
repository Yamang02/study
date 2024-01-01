/* 109. WITH절 사용하기 ① (WITH ~ AS)*/

/* WITH 절을 이용하여 직업과 직업별 토탈 월급 출력, 직업별 토탈 월급들의 평균값보다 더 큰 값들만 출력*/

WITH JOB_SUMSAL AS (
    SELECT
        JOB,
        SUM(SAL) AS 토탈
    FROM
        EMP
    GROUP BY
        JOB
)
SELECT
    JOB,
    토탈
FROM
    JOB_SUMSAL
WHERE
    토탈 > (
        SELECT
            AVG(토탈)
        FROM
            JOB_SUMSAL
    );
    
/*
WITH 절의 수행 원리
직업과 직업별 토탈 월급을 출력하여 임시 저장 영역에 테이블명을 JOB_SUMSAL로 저장
EMP 테이블의 데이터가 대용량이면 오래 걸리나, WITH절을 통해 해당 결과는 임시저장 영역에 저장하므로 
시간을 줄일 수 있다. 다만, WITH절에서 사용한 TEMP테이블은 WITH절 내에서만 사용 가능함.


*/    
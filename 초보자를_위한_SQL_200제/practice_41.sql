/* 데이터 분석 함수로 순위 출력 RANK */
SELECT
    ENAME,
    JOB,
    SAL,
    RANK()
    OVER(
        ORDER BY
            SAL DESC
    ) 순위
FROM
    EMP
WHERE
    JOB IN ( 'ANALYST', 'MANAGER' );
    
 /* RANK() OVER 다음 순위를 출력될 정렬된 쿼리를 넣음 */

SELECT
    ENAME,
    SAL,
    JOB,
    RANK()
    OVER(PARTITION BY JOB
         ORDER BY
             SAL DESC
    ) AS 순위
FROM
    EMP;
/* 직업별로 묶어서 순위를 부여하기 위해 ORDER BY 앞에 PARTITION BY JOB을 사용 */    
    
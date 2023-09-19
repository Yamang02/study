/* 평균값 출력하기(AVG) */

SELECT
    AVG(COMM)
FROM
    EMP;

/* 그룹함수는 NULL을 무시한다.*/
SELECT
    ROUND(AVG(NVL(COMM, 0)))
FROM
    EMP;
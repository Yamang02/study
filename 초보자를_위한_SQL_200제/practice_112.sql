/* 112. SQL로 알고리즘 문제 풀기 ② (구구단 1단 ~ 9단 출력) */WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= 9
), GUGU_TABLE AS (
    SELECT
        LEVEL + 1 AS GUGU
    FROM
        DUAL
    CONNECT BY
        LEVEL <= 8
)
SELECT
    TO_CHAR(LT.NUM)
    || 'X'
    || TO_CHAR(GT.GUGU)
    || '='
    || TO_CHAR(GT.GUGU * LT.NUM) AS 구구단
FROM
    LOOP_TABLE LT,
    GUGU_TABLE GT
    
/* WHERE절에 조인 조건절이 없는 조건으로 전체를 조인함 */    
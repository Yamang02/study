/* SQL로 알고리즘 문제 풀기 ①(구구단 2단 출력)*/

/* 계층형 질의문 사용...*/

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= 9
)
SELECT
    '2'
    || 'X'
    || NUM
    || '='
    || 2 * NUM AS "2단"
FROM
    LOOP_TABLE;
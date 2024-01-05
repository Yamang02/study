/* 113. SQL로 알고리즘 문제 풀기 ③ (직각삼각형 출력)*/

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= 8
)
SELECT
    LPAD('★', NUM, '★') AS STAR
FROM
    LOOP_TABLE;
/*114. SQL로 알고리즘 문제 풀기 ④(삼각형 출력)*/

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= 8
)
SELECT
    LPAD(' ', 10 - NUM, ' ')
    || LPAD('★', NUM, '★') AS "TRIANGLE"
FROM
    LOOP_TABLE;
    
    
/* 치환변수*/
UNDEFINE 숫자1
UNDEFINE 숫자2

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= &숫자1
)
SELECT
    LPAD(' ', &숫자2 - NUM, ' ')
    || LPAD('★', NUM, '★') AS "TRIANGLE"
FROM
    LOOP_TABLE;    
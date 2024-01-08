/*SQL로 알고리즘 문제 풀기 ⑥(사각형 출력) */

UNDEFINE P_N1
UNDEFINE P_N2
ACCEPT P_N1 PROMPT '가로 숫자 입력'
ACCEPT P_N2 PROMPT '세로 숫자 입력'

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= &P_N2
)
SELECT
    LPAD('★', '&P_N1', '★') AS STAR
FROM
    LOOP_TABLE;
/* 120. SQL로 알고리즘 문제 풀기 ⑩(1부터 10까지 소수만 출력) */

UNDEFINE P_N
ACCEPT P_N PROMPT '숫자에 대한 값 입력';

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= &P_N
)
SELECT
    L1.NUM AS 소수
FROM
    LOOP_TABLE L1,
    LOOP_TABLE L2
WHERE
    MOD(L1.NUM, L2.NUM) = 0
GROUP BY
    L1.NUM
HAVING
    COUNT(L1.NUM) = 2
ORDER BY
    L1.NUM ASC;
/* 120. SQL로 알고리즘 문제 풀기 ⑪ (최대 공약수) */

UNDEFINE P_N1; 
UNDEFINE P_N2; 
ACCEPT P_N1 PROMPT '첫 번째 숫자 입력';
ACCEPT P_N2 PROMPT '두 번째 숫자 입력';

WITH NUM_D AS (
    SELECT
        &P_N1 AS NUM1,
        &P_N2 AS NUM2
    FROM
        DUAL
)
SELECT
    MAX(LEVEL) AS "최대 공약수"
FROM
    NUM_D
WHERE
        MOD(NUM1, LEVEL) = 0
    AND MOD(NUM2, LEVEL) = 0
CONNECT BY
    LEVEL <= NUM2;
/* SQL로 알고리즘 문제 풀기 ⑤ (마름모 출력) */
UNDEFINE P_NUM
ACCEPT P_NUM PROMPT '숫자 입력 :  '

SELECT
    LPAD(' ', &P_NUM - LEVEL, ' ')
    || RPAD('★', LEVEL, '★') AS STAR
FROM
    DUAL
CONNECT BY
    LEVEL < &P_NUM + 1
UNION ALL
SELECT
    LPAD(' ', LEVEL, ' ')
    || RPAD('★',(&P_NUM) - LEVEL, '★') AS STAR
FROM
    DUAL
CONNECT BY
    LEVEL < &P_NUM;
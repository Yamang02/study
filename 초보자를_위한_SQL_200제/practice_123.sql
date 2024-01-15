/* 123. SQL로 알고리즘 문제 풀기 ⑬(피타고라스의 정리)*/

ACCEPT NUM1 PROMPT '밑변'
ACCEPT NUM2 PROMPT '높이'
ACCEPT NUM3 PROMPT '빗변'

SELECT
    CASE
        WHEN ( POWER(&NUM1, 2) + POWER(&NUM2, 2) ) = POWER(&NUM3, 2) THEN
            '직각삼각형'
        ELSE
            '직각삼각형이 아님'
    END AS "피타고라스의 정리"
FROM
    DUAL;
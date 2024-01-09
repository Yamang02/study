/* 117. SQL로 알고리즘 문제 풀기 ⑦ (1부터 10까지의 숫자의 합)*/

UNDEFINE P_N
ACCEPT P_N PROMPT '숫자에 대한 값 입력'

SELECT SUM(LEVEL) AS 합계
FROM DUAL
CONNECT BY LEVEL <=&P_N;
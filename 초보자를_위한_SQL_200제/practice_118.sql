/*116. SQL로 알고리즘 문제 풀기 ⑥(사각형 출력)*/

UNDEFINE P_N
ACCEPT P_N PROMPT '숫자에 대한 값 입력'

SELECT ROUND(EXP(SUM(LN(LEVEL)))) 곱
FROM DUAL
CONNECT BY LEVEL <=&P_N;

/* LN함수는 밑수가 자연상수 E 인 로그함수

SUM(LN(LEVEL))은
LOGE1 + LOGE2 + ... LOGE10
= LOGE1*2*...10

자연상수의 제곱 EXP

*/
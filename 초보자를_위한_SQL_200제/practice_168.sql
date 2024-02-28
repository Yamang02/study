/* PL/SQL로 알고리즘 문제 풀기 ①(삼각형 출력) */

SET SERVEROUTPUT ON

ACCEPT P_NUM PROMPT '숫자를 입력'
DECLARE
    V_CNT NUMBER(10) := 0;
BEGIN
    WHILE V_CNT < &P_NUM LOOP
    V_CNT := V_CNT + 1;
    DBMS_OUTPUT.PUT_LINE(LPAD('★',V_CNT,'★'));

    END LOOP;

END;


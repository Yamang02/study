/* 169. PL/SQL로 알고리즘 문제 풀기 ② (사각형 출력) */

SET SERVEROUTPUT ON

ACCEPT P_A PROMPT '가로'
ACCEPT P_B PROMPT '세로'

BEGIN
    FOR I IN 1.. &P_B LOOP
        DBMS_OUTPUT.PUT_LINE(LPAD('★', &P_A, '★'));
    END LOOP;
END;
/* 152. 수학식 구현하기 ①(절대값)*/

SET SERVEROUTPUT ON
SET VERIFY OFF
ACCEPT P_NUM PROMPT '숫자를 입력하세요~'

DECLARE
    V_NUM NUMBER(10) := &P_NUM;
BEGIN
    IF V_NUM >=0 THEN
        DBMS_OUTPUT.PUT_LINE(V_NUM);
    ELSE
        DBMS_OUTPUT.PUT_LINE(-1 * V_NUM);
    END IF;
END;
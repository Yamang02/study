/* 173.PL/SQL로 알고리즘 문제 풀기 ⑥ (최소 공배수) */

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_NUM1 PROMPT '첫 번째 숫자 입력'

ACCEPT P_NUM2 PROMPT '두 번째 숫자 입력'

DECLARE
    V_NUM1   NUMBER(10) := &P_NUM1;
    V_NUM2   NUMBER(10) := &P_NUM2;
    V_CNT    NUMBER(10);
    V_MOD    NUMBER(10);
    V_RESULT NUMBER(10);
BEGIN
    FOR I IN REVERSE 1 .. V_NUM1 LOOP
        V_MOD := MOD(V_NUM1, I) + MOD(V_NUM2, I);
        V_CNT := I;
        EXIT WHEN V_MOD = 0;
    END LOOP;

    V_RESULT := (V_NUM1 / V_CNT) * (V_NUM2 / V_CNT) * V_CNT;
    DBMS_OUTPUT.PUT_LINE(
        A => V_RESULT /*IN VARCHAR2*/
    );
END;
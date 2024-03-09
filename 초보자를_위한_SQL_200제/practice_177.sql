/*  PL/SQL로 알고리즘 문제 풀기 ⑩(몬테카를로 알고리즘) */

SET SERVEROUTPUT ON

DECLARE
    V_CNT NUMBER(10, 2) := 0;
    V_A   NUMBER(10, 2);
    V_B   NUMBER(10, 2);
    V_PI  NUMBER(10, 2);
BEGIN
    FOR I IN 1 .. 1000000 LOOP
        V_A := DBMS_RANDOM.VALUE(0, 1);
        V_B := DBMS_RANDOM.VALUE(0, 1);
        IF POWER(V_A, 2) + POWER(V_B, 2) <= 1 THEN
            V_CNT := V_CNT + 1;
        END IF;
    END LOOP;

    V_PI := (V_CNT / 1000000) *4;
    DBMS_OUTPUT.PUT_LINE(
        A => V_PI /*IN VARCHAR2*/
    );
END;
/* 161. 기초 통계 구현하기 ④ (분산과 표준편차) */

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_ARR PROMPT "숫자 입력";

DECLARE
    TYPE ARR_TYPE IS
        VARRAY(10) OF NUMBER(10);
    V_NUM_ARR ARR_TYPE := ARR_TYPE(&P_ARR);
    V_SUM     NUMBER(10, 2) := 0;
    V_CNT     NUMBER(10, 2) := 0;
    V_AVG     NUMBER(10, 2) := 0;
    V_VAR     NUMBER(10, 2) := 0;
BEGIN
    FOR I IN 1 .. V_NUM_ARR.COUNT LOOP
        V_SUM := V_SUM + V_NUM_ARR(I);
        V_CNT := V_CNT + 1;
    END LOOP;

    V_AVG := V_SUM / V_CNT;
    FOR I IN 1 .. V_NUM_ARR.COUNT LOOP
        V_VAR := V_VAR + POWER(V_NUM_ARR(I) - V_AVG, 2);
    END LOOP;

    V_VAR := V_VAR / V_CNT;

    DBMS_OUTPUT.PUT_LINE(A  => '분산값은 ' || V_VAR /*IN VARCHAR2*/);
    DBMS_OUTPUT.PUT_LINE(A  => '표준편차는 ' || ROUND(SQRT(V_VAR)) /*IN VARCHAR2*/);
END;
/* 162. 기초 통계 구현하기 ⑤(공분산) */
SET SERVEROUTPUT ON 
SET VERIFY OFF


ACCEPT P_ARR1 PROMPT "키 입력";
ACCEPT P_ARR2 PROMPT "체중 입력";

DECLARE
    TYPE ARR_TYPE IS
        VARRAY(10) OF NUMBER(10, 2);
    V_NUM_ARR1 ARR_TYPE := ARR_TYPE(&P_ARR1);
    V_SUM1     NUMBER(10, 2) := 0;
    V_AVG1     NUMBER(10, 2) := 0;
    V_NUM_ARR2 ARR_TYPE := ARR_TYPE(&P_ARR2);
    V_SUM2     NUMBER(10, 2) := 0;
    V_AVG2     NUMBER(10, 2) := 0;
    V_CNT      NUMBER(10, 2);
    V_VAR      NUMBER(10, 2) := 0;
BEGIN
    V_CNT := V_NUM_ARR1.COUNT;
    FOR I IN 1 .. V_NUM_ARR1.COUNT LOOP
        V_SUM1 := V_SUM1 + V_NUM_ARR1(I);
    END LOOP;

    V_AVG1 := V_SUM1 / V_CNT;
    FOR I IN 1 .. V_NUM_ARR2.COUNT LOOP
        V_SUM2 := V_SUM2 + V_NUM_ARR2(I);
    END LOOP;

    V_AVG2 := V_SUM2 / V_CNT;
    FOR I IN 1.. V_CNT LOOP
        V_VAR := V_VAR + (V_NUM_ARR1(I) - V_AVG1) * (V_NUM_ARR2(I) - V_AVG2) / V_CNT;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('공분산 값은  : '
                         || V_VAR);
END;
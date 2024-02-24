/* 163. 기초통계 구현하기 ⑥(상관계수)*/

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_ARR1 PROMPT "키 입력";

ACCEPT P_ARR2 PROMPT "체중 입력";

DECLARE
    TYPE ARR_TYPE IS
        VARRAY(10) OF NUMBER(10, 2);
    V_NUM_ARR1     ARR_TYPE := ARR_TYPE(&P_ARR1);
    V_SUM1         NUMBER(10, 2) := 0;
    V_AVG1         NUMBER(10, 2) := 0;
    V_NUM_ARR2     ARR_TYPE := ARR_TYPE(&P_ARR2);
    V_SUM2         NUMBER(10, 2) := 0;
    V_AVG2         NUMBER(10, 2) := 0;
    V_CNT          NUMBER(10, 2);
    COV_VAR        NUMBER(10, 2) := 0;
    V_NUM_ARR1_VAR NUMBER(10, 2) := 0;
    V_NUM_ARR2_VAR NUMBER(10, 2) := 0;
    V_CORR         NUMBER(10, 2);
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
    FOR I IN 1 .. V_CNT LOOP
        COV_VAR := COV_VAR + (V_NUM_ARR1(I) - V_AVG1) * (V_NUM_ARR2(I) - V_AVG2) / V_CNT;
        V_NUM_ARR1_VAR := V_NUM_ARR1_VAR + POWER(V_NUM_ARR1(I) - V_AVG1, 2);
        V_NUM_ARR2_VAR := V_NUM_ARR2_VAR + POWER(V_NUM_ARR2(I) - V_AVG2, 2);
    END LOOP;

    V_CORR := COV_VAR / SQRT(V_NUM_ARR1_VAR * V_NUM_ARR2_VAR);
    DBMS_OUTPUT.PUT_LINE('상관 관계는'
                         || V_CORR);
END;
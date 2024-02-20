/* 159. 기초 통계 구현하기 ②(중앙값) */

ACCEPT P_ARR PROMPT '숫자 입력'

DECLARE
    TYPE ARR_TYPE IS
        VARRAY(10) OF NUMBER(10);
    V_NUM_ARR ARR_TYPE := ARR_TYPE(&P_ARR);
    V_N       NUMBER(10);
    V_MEDI    NUMBER(10, 2);
BEGIN
    V_N := V_NUM_ARR.COUNT;
    IF MOD(V_N, 2) = 1 THEN
        V_MEDI := V_NUM_ARR((V_N+1)/2);
    ELSE
        V_MEDI := (V_NUM_ARR(V_N/2) + V_NUM_ARR((V_N/2)+1))/2;
    END IF;

    DBMS_OUTPUT.PUT_LINE(
        A => V_MEDI /*IN VARCHAR2*/
    );
END;
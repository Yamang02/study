/* 160. 기초 통계 구현하기 ③(최빈값) */

ACCEPT P_NUM1 PROMPT "데이터 입력"

DECLARE
    TYPE ARRAY_T IS
        VARRAY(10) OF VARCHAR2(10);
    V_ARRAY ARRAY_T := ARRAY_T(&P_NUM1);
    V_CNT   NUMBER(10);
    V_TMP   NUMBER(10);
    V_MAX   NUMBER(10) := 0;
    V_TMP2  NUMBER(10);
BEGIN
    FOR I IN 1 .. V_ARRAY.COUNT LOOP
        V_CNT := 1;
        FOR J IN I+1 .. V_ARRAY.COUNT LOOP
            IF V_ARRAY(I) = V_ARRAY(J) THEN
                V_TMP := V_ARRAY(I);
                V_CNT := V_CNT +1;
            END IF;
        END LOOP;

        IF V_MAX <= V_CNT THEN
            V_MAX := V_CNT;
            V_TMP2 := V_TMP;
        END IF;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE(
        A => '최빈값 '
             || V_TMP2
             || ' 개수는 '
             || V_MAX /*IN VARCHAR2*/
    );
END;
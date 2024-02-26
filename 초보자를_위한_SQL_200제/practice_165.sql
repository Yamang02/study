/* 165. 기초 통계 구현하기 ⑧ (확률) */

DECLARE
    V_LOOP  NUMBER(10) := 10000;
    V_COIN1 NUMBER(10);
    V_COIN2 NUMBER(10);
    V_0     NUMBER(10) := 0;
    V_1     NUMBER(10) := 0;
    V_2     NUMBER(10) := 0;
BEGIN
    FOR I IN 1 .. V_LOOP LOOP
        SELECT
            ROUND(DBMS_RANDOM.VALUE(0, 1)),
            ROUND(DBMS_RANDOM.VALUE(0, 1)) INTO V_COIN1,
            V_COIN2
        FROM
            DUAL;
        IF V_COIN1 = 0 AND V_COIN2 = 0 THEN
            V_0 := V_0 + 1;
        ELSIF V_COIN1 = 1 AND V_COIN2 = 1 THEN
            V_1 := V_1 + 1;
        ELSE
            V_2 := V_2 + 1;
        END IF;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE(A => '동전 모두 앞면확률'
                              || ROUND((V_0/V_LOOP), 2));
    DBMS_OUTPUT.PUT_LINE(A => '하나 앞면, 하나 뒷면'
                              || ROUND((V_2/V_LOOP), 2)); /*IN VARCHAR2*/
    DBMS_OUTPUT.PUT_LINE(A => '동전 모두 뒷면확률'
                                             || ROUND((V_1/V_LOOP), 2)); /*IN VARCHAR2*/
END;
/* 164. 기초 통계 구현하기 ⑦ (확률) */

DECLARE
    V_LOOP NUMBER(10) := 10000;
    V_COIN NUMBER(10);
    V_0    NUMBER(10) := 0;
    V_1    NUMBER(10) := 0;
BEGIN
    FOR I IN 1 .. V_LOOP LOOP
        SELECT
            ROUND(DBMS_RANDOM.VALUE(1, 2)) INTO V_COIN
        FROM
            DUAL;
        IF V_COIN = 1 THEN
            V_0 := V_0 + 1;
        ELSE
            V_1 := V_1 +1;
        END IF;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('동전이 앞면이 나올 확률 : '
                         || ROUND((V_0/V_LOOP), 2));
    DBMS_OUTPUT.PUT_LINE('동전이 뒷면이 나올 확률 : '
                         || ROUND((V_1/V_LOOP), 2));
END;
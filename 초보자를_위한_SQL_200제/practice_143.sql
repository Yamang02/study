/*143. PL/SQL BASIC LOOP 이해하기*/
DECLARE
    V_COUNT NUMBER(10) := 0;
BEGIN
    LOOP
        V_COUNT := V_COUNT + 1;
        DBMS_OUTPUT.PUT_LINE('2 X'
                             || V_COUNT
                             || ' = '
                             || 2 + V_COUNT);
        EXIT WHEN V_COUNT = 9;
    END LOOP;
END;
/*144. PL/SQL While Loop 이해하기 */
SET SERVEROUTPUT ON
DECLARE V_COUNT  NUMBER(10) := 0;


BEGIN
    WHILE V_COUNT < 9 LOOP
        V_COUNT := V_COUNT + 1;
        DBMS_OUTPUT.PUT_LINE('2 x'
                             || V_COUNT
                             || ' = '
                             || 2 * V_COUNT);
    END LOOP;
END;
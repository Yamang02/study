/* 156.수학식 구현하기 ⑤(순열) */

set serveroutput on

set verify off

DECLARE
    V_NAME1 SAMPLE.FRUIT%TYPE;
    V_NAME2 SAMPLE.FRUIT%TYPE;
BEGIN
    FOR I IN 1 .. 3 LOOP
        FOR J IN 1 .. 3 LOOP
            SELECT
                FRUIT INTO V_NAME1
            FROM
                SAMPLE
            WHERE
                NUM = I;
            SELECT
                FRUIT INTO V_NAME2
            FROM
                SAMPLE
            WHERE
                NUM = J;
            IF I != J THEN
                DBMS_OUTPUT.PUT_LINE(V_NAME1
                                     ||', '
                                     || V_NAME2);
            END IF;
        END LOOP;
    END LOOP;
END;
/
/*157. 수학식 구현하기 ⑥(조합)*/
SET SERVEROUT ON

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
            DBMS_OUTPUT.PUT_LINE(V_NAME1
                                 || ','
                                 || V_NAME2);
        END LOOP;
    END LOOP;
END;
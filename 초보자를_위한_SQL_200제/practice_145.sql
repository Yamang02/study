/*145. PL/SQL for Loop 이해하기 */


BEGIN
    FOR I IN 1 .. 9 LOOP
        DBMS_OUTPUT.PUT_LINE('2 X '
                             || I
                             || ' = '
                             || 2 * I);
    END LOOP;
END;
/*146. PL/SQL 이중 LOOP문 이해하기 */

SET SERVEROUTPUT ON
PROMPT 구구단 전체 출력;

BEGIN
    FOR i IN 2 .. 9 LOOP
        FOR j IN 1..9 LOOP
            DBMS_OUTPUT.PUT_LINE(i || ' x ' || j || ' = ' || i*j);
        END LOOP;
    END LOOP;
END;    
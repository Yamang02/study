/* PL/SQL로 알고리즘 문제 풀기 ⑧ (삽입 정렬) */

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_NUM PROMPT '정렬할 5개 숫자 입력'

DECLARE
    TYPE ARRAY_T IS
        VARRAY(100) OF NUMBER(10);
    VARRAY ARRAY_T := ARRAY_T();
    V_TEMP NUMBER(10);
BEGIN
    VARRAY.EXTEND(REGEXP_COUNT('&P_NUM', ' ') +1 );
    FOR I IN 1 .. VARRAY.COUNT LOOP
        VARRAY(I) := TO_NUMBER(REGEXP_SUBSTR('&P_NUM' /*SOURCE_CHAR*/, '[^ ]+' /*PATTERN*/, 1 /*POSITION*/, I /*OCCURRENCE*/ ));
    END LOOP;

    FOR J IN 2 .. VARRAY.COUNT LOOP
        FOR K IN 1 .. J-1 LOOP
            IF VARRAY(K) > VARRAY(J) THEN
                V_TEMP := VARRAY(J);
                FOR Z IN REVERSE K .. J-1 LOOP
                    VARRAY(Z+1) := VARRAY(Z);
                END LOOP;

                VARRAY(K) := V_TEMP;
            END IF;
        END LOOP;
    END LOOP;

    FOR I IN 1 .. VARRAY.COUNT LOOP
        DBMS_OUTPUT.PUT(VARRAY(I)
                        || ' ');
    END LOOP;

    DBMS_OUTPUT.NEW_LINE;
END;
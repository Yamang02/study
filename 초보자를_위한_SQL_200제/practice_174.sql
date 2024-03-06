/* 174. PL/SQL로 알고리즘 문제 풀기 ⑦ (버블 정렬) */

-- 5개의 숫자 입력 받아 버블 정렬 알고리즘으로 정렬

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_NUM PROMPT '5개 숫자 '

DECLARE
    TYPE ARRAY_T IS
        VARRAY(10) OF NUMBER(10);
    ARRAY ARRAY_T := ARRAY_T();
    TMP   NUMBER := 0;
    V_NUM VARCHAR2(50) := '&P_NUM';
    V_CNT NUMBER := REGEXP_COUNT(V_NUM, ' ')+1;
BEGIN
    ARRAY.EXTEND(V_CNT);
    DBMS_OUTPUT.PUT(' 정렬 전 숫자 : ');
    FOR I IN 1 .. ARRAY.COUNT LOOP
        ARRAY(I) := REGEXP_SUBSTR('&P_NUM', '[^ ]+', 1, I);
        DBMS_OUTPUT.PUT(ARRAY(I)
                        || ' ');
    END LOOP;

    DBMS_OUTPUT.NEW_LINE;
    FOR I IN 1 .. ARRAY.COUNT-1 LOOP
        FOR J IN I+1 .. ARRAY.COUNT LOOP
            IF ARRAY(I) > ARRAY(J) THEN
                TMP := ARRAY(I);
                ARRAY(I) := ARRAY(J);
                ARRAY(J) := TMP;
            END IF;
        END LOOP;
    END LOOP;

    DBMS_OUTPUT.PUT('정렬 후 숫자 : ');
    FOR I IN 1 .. ARRAY.COUNT LOOP
        DBMS_OUTPUT.PUT(ARRAY(I)
                        || ' ');
    END LOOP;

    DBMS_OUTPUT.NEW_LINE;
END;
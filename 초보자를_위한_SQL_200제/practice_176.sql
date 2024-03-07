/* 175.PL/SQL로 알고리즘 문제 풀기 ⑨ (순차탐색)*/

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_NUM PROMPT '랜덤 생성 숫자 개수 입력'

ACCEPT P_A PROMPT '검색 숫자 입력'

DECLARE
    TYPE ARRAY_T IS
        VARRAY(1000) OF NUMBER(30);
    ARRAY_S ARRAY_T := ARRAY_T();
    V_CNT   NUMBER(10) := &P_NUM;
    V_A     NUMBER(10) := &P_A;
    V_CHK   NUMBER(10) := 0;
BEGIN
    ARRAY_S.EXTEND(V_CNT);
    FOR I IN 1 .. V_CNT LOOP
        ARRAY_S(I) := ROUND(DBMS_RANDOM.VALUE(1, V_CNT));
        DBMS_OUTPUT.PUT(ARRAY_S(I)
                        || ',');
    END LOOP DBMS_OUTPUT.NEW_LINE;
    FOR I IN ARRAY_S.FIRST .. ARRAY_S.LAST LOOP
        IF V_A = ARRAY_S(I) THEN
            V_CHK := 1;
            DBMS_OUTPUT.PUT(I
                            || '번째에서 숫자'
                            || V_A
                            || '를 발견' );
        END IF;
    END LOOP;

    DBMS_OUTPUT.NEW_LINE;
    IF V_CHK= 0 THEN
        DBMS_OUTPUT.PUT('숫자를 발견하지 못함' );
    END IF;
END;
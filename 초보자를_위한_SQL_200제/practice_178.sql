/* PL/SQL로 알고리즘 문제 풀기 ⑪ (탐욕 알고리즘) */

/*
선택할 때마다 가장 좋다고 생각되는 것을 선택
전체를 고려하지 않고 문제를 부분으로 나누어, 나뉜 문제에 대한 최적의 해답
가장 큰 값부터 취하는 것
*/

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_MONEY PROMPT '잔돈 전체 금액 입력'

ACCEPT P_COIN PROMPT '잔돈 단위 입력'

DECLARE
    V_MONEY NUMBER(10) := &P_MONEY;
    TYPE ARRAY_T IS
        VARRAY(3) OF NUMBER(10);
    V_ARRAY ARRAY_T := ARRAY_T(&P_COIN);
    V_NUM   ARRAY_T := ARRAY_T(0, 0, 0);
BEGIN
    FOR I IN 1 .. V_ARRAY.COUNT LOOP
        IF V_MONEY >= V_ARRAY(I) THEN
            V_NUM(I) := TRUNC(V_MONEY/V_ARRAY(I));
            V_MONEY := MOD(V_MONEY, V_ARRAY(I));
        END IF;

        DBMS_OUTPUT.PUT_LINE(A => V_ARRAY(I)
                                  || '원의 개수 : '
                                  || V_NUM(I)
                                  || '개, ' /*IN VARCHAR2*/ );
    END LOOP;

    DBMS_OUTPUT.NEW_LINE;

END;
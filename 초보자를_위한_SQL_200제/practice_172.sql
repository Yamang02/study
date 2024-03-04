/* 172.PL/SQL로 알고리즘 문제 풀기 ⑤(최대 공약수) */

SET VERIFY OFF

ACCEPT P_NUM1 PROMPT '첫 번째 숫자'

ACCEPT P_NUM2 PROMPT '두 번째 숫자'

DECLARE
    V_CNT NUMBER(10);
    V_MOD NUMBER(10);
BEGIN
    FOR I IN REVERSE 1 .. &P_NUM1 LOOP
        V_MOD := MOD(&P_NUM1, I) + MOD(&P_NUM2, I);
        V_CNT := I;
        EXIT WHEN V_MOD = 0;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE(V_CNT);
END;
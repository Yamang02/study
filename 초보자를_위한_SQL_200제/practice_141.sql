/*141. PL/SQL IF 이해하기 ①(IF ~ ELSE 문) */

SET SERVEROUT ON
SET VERIFY OFF
-- 다음 변수에 들어가는 값을 보여주지 않음
ACCEPT P_NUM PROMPT '숫자 입력'

BEGIN
    IF MOD(&P_NUM, 2) = 0 THEN
        DBMS_OUTPUT.PUT_LINE('짝수');
    ELSE
        DBMS_OUTPUT.PUT_LINE('홀수');
    END IF;
END;
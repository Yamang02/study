/* 166. 기초 통계 구현하기 ⑨ (이항분포) */

CREATE OR REPLACE FUNCTION MYBIN(
    P_H IN NUMBER
) RETURN NUMBER IS
    V_H    NUMBER(10) := P_H;
    V_SIM  NUMBER(10) := 100000;
    V_CNT  NUMBER(10) := 0;
    V_CNT2 NUMBER(10) := 0;
    V_RES  NUMBER(10, 2);
BEGIN
    FOR N IN 1 .. V_SIM LOOP
        V_CNT := 0;
        FOR I IN 1 .. 10 LOOP
            IF DBMS_RANDOM.VALUE < 0.5 THEN
                V_CNT := V_CNT + 1;
            END IF;
        END LOOP;

        IF V_CNT = V_H THEN
            V_CNT2 := V_CNT2 +1;
        END IF;
    END LOOP;

    V_RES := V_CNT2 / V_SIM;
    RETURN V_RES;
END;

SELECT
    LEVEL-1 GRADE,
    MYBIN(LEVEL-1)                     확률,
    LPAD('■', MYBIN(LEVEL-1)*100, '■') "막대그래프"
FROM
    DUAL
CONNECT BY
    LEVEL <12;
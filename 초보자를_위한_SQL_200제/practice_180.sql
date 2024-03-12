/*SQL로 머신러닝 구현하기 ②(NAIVEBAYES) */

SET SERVEROUTPUT ON

SET VERIFY OFF

ACCEPT P_CHILLS PROMPT '오한?'

ACCEPT P_RUNNY_NOSE PROMPT '콧물?'

ACCEPT P_HEADACHE PROMPT '두통?'

ACCEPT P_FEVER PROMPT '열?'

DECLARE
    V_PRED VARCHAR2(20);
    V_PROB NUMBER(10, 2);
BEGIN
    WITH TEST_DATA AS (
        SELECT
            UPPER ('&P_CHILLS')    AS CHILLS,
            UPPER('&P_RUNNY_NOSE') AS RUNNY_NOSE,
            UPPER('&P_HEADACHE')   AS HEADACHE,
            UPPER('&P_FEVER')      AS FEVER
        FROM
            DUAL
    )
    SELECT
        PREDICTION(MD_CLASSIFICATION_MODEL USING * /*[ GROUPING_HINT ] [ SCHEMA . ] MODEL*/ ),
        PREDICTION_PROBABILITY(MD_CLASSIFICATION_MODEL USING * /*[ SCHEMA . ] MODEL*/ ) INTO V_PRED,
        V_PROB
    FROM
        TEST_DATA;
    IF V_PRED = 'Y' THEN
        DBMS_OUTPUT.PUT_LINE('머신런닝이 예측한 결과 : 독감. 독감일 확률 '
                             || ROUND(V_PROB, 2) * 100
                                                   || '%' );
    ELSE
        DBMS_OUTPUT.PUT_LINE('머신런닝이 예측한 결과 : 독감아님. 독감이 아닐 확률 '
                             || ROUND(V_PROB, 2) * 100
                                                   || '%');
    END IF;
END;
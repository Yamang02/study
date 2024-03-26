-- ■ 예제_192 SQL로 머신러닝 구현하기14(SUPPORT VECTOR MACHINE) 

SET SERVEROUTPUT ON
SET VERIFY OFF

ACCEPT P_ID PROMPT '환자 번호를 입력하세요~ (예: 845636)'

DECLARE  
   V_PRED    VARCHAR2(20);
   V_PROB    NUMBER(10,2);

BEGIN

SELECT PREDICTION (WC_MODEL USING *),
          PREDICTION_PROBABILITY(WC_MODEL  USING * )  INTO V_PRED, V_PROB
  FROM WISC_BC_DATA_TEST
  WHERE ID = '&P_ID';

 IF V_PRED ='M' THEN 

   DBMS_OUTPUT.PUT_LINE('머신러닝이 예측한 결과: 유방암 환자입니다. 유방암일 확률은 ' || ROUND(V_PROB,2) * 100 || '%입니다');

 ELSE 
    DBMS_OUTPUT.PUT_LINE('머신러닝이 예측한 결과: 유방암 환자가 아닙니다. 유방암 환자가 아닐 확률은 ' || ROUND(V_PROB,2) * 100 || '%입니다');

 END IF;

END;
/




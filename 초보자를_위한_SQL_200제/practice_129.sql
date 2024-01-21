/*129.절도가 많이 일어나는 요일은 언제일까? */

/*테이블 생성 후 정보 임포트*/
DROP TABLE CRIME_DAY;

CREATE TABLE CRIME_DAY
( CRIME_TYPE  VARCHAR2(50),
  SUN_CNT    NUMBER(10),
  MON_CNT   NUMBER(10),
  TUE_CNT    NUMBER(10),
  WED_CNT   NUMBER(10),
  THU_CNT    NUMBER(10),
  FRI_CNT     NUMBER(10),
  SAT_CNT    NUMBER(10),
  UNKNOWN_CNT  NUMBER(10) );
  
/* 특정 범죄가 많이 발생한 요일을 출력하기 용이하도록 unpivot : 요일 컬럼을 로우로*/

DROP TABLE CRIME_DAY_UNPIVOT;
  
CREATE TABLE CRIME_DAY_UNPIVOT
 AS
 SELECT *
   FROM CRIME_DAY
   UNPIVOT ( CNT FOR  DAY_CNT  IN ( SUN_CNT, MON_CNT, TUE_CNT, WED_CNT,
   THU_CNT, FRI_CNT, SAT_CNT) );
   
/*특정 범죄 확인*/

SELECT *
  FROM ( 
         SELECT DAY_CNT, CNT, RANK() OVER (ORDER BY CNT DESC) RNK
           FROM CRIME_DAY_UNPIVOT
           WHERE TRIM(CRIME_TYPE)='절도'
       )
WHERE  RNK = 1;
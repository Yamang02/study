/* 126. 엑셀 데이터 DB업로드 */

CREATE TABLE CANCER (
    암종   VARCHAR2(50),
    질병코드 VARCHAR2(20),
    환자수  NUMBER(10),
    성별   VARCHAR(20),
    조유병률 NUMBER(10, 2),
    생존률  NUMBER(10, 2)
);
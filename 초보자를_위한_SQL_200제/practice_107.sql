/*107. 데이터의 품질 높이기 ④(CHECK)*/

CREATE TABLE EMP6 (
    EMPNO NUMBER(10),
    ENAME VARCHAR2(20),
    SAL   NUMBER(10)
        CONSTRAINT EMP6_SAL_CK CHECK ( SAL BETWEEN 0 AND 6000 )
)

/* 특정 컬럼에 특정 조건의 데이터만 입력되거나 수정되도록 제한을 거는 제약 */

/* 제약을 삭제하는 명령어 */
ALTER TABLE EMP6 DROP CONSTRAINT EMP6_SAL_CK;
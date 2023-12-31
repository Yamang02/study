/*108. 데이터의 품질 높이기 ⑤(FOREIGN KEY)*/

DROP TABLE EMP7;

CREATE TABLE DEPT7 (
    deptno NUMBER(10)
        CONSTRAINT dept7_deptno_pk PRIMARY KEY,
    dname  VARCHAR2(14),
    loc    VARCHAR2(10)
);

CREATE TABLE emp7 (
    empno  NUMBER(10),
    ename  VARCHAR2(20),
    sal    NUMBER(10),
    deptno NUMBER(10)
        CONSTRAINT emp7_deptno_fk
            REFERENCES dept7 ( deptno )
);

/*  제약 상황에서 DEPT7 테이블의 PK 삭제 불가 ORA-02273*/

ALTER TABLE DEPT7 DROP CONSTRAINT DEPT7_DEPTNO_PK;

/* CASCADE 옵션을 붙여야 삭제됨 : FOREIGN KEY 제약과 함께 */
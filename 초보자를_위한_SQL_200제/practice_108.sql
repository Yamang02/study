/*108. �������� ǰ�� ���̱� ��(FOREIGN KEY)*/

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

/*  ���� ��Ȳ���� DEPT7 ���̺��� PK ���� �Ұ� ORA-02273*/

ALTER TABLE DEPT7 DROP CONSTRAINT DEPT7_DEPTNO_PK;

/* CASCADE �ɼ��� �ٿ��� ������ : FOREIGN KEY ����� �Բ� */
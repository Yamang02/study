/* 105.데이터의 품질 높이기 ②(UNIQUE) */

CREATE TABLE DEPT3 (
    DEPTNO NUMBER(10),
    DNAME  VARCHAR(14)
        CONSTRAINT DEPT3_DNAME_UN UNIQUE,
    LOC    VARCHAR2(10)
);

/* 중복 안됨, 하지만 PK와 다르게 NULL 가능, 테이블 생성시 혹은 생성 이후 모두 부여 가능*/
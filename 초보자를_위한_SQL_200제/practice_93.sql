/* 93.일반 테이블 생성하기(CREATE TABLE) */


CREATE TABLE EMP01 (
    EMPNO    NUMBER(10),
    ENAME    VARCHAR2(10),
    SAL      NUMBER(10, 2),
    HIREDATE DATE
);

/*
테이블은 반드시 문자로 시작해야 함
이름의 길이는 30자 이하여야 함
대소문자 알파벳, 숫자 포함 가능
특수문자는 $, _, # 포함 가능

숫자는 1-38 자리까지, 소수점은 84-127까지 가증
VARCHAR2 지정할 수 있는 최대 길이는 4,000
*/
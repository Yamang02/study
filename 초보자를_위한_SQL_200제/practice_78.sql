/*78. 데이터 입력하기(INSERT)*/

INSERT INTO EMP (
    EMPNO,
    ENAME,
    SAL,
    HIREDATE,
    JOB
) VALUES (
    2812,
    'JACK',
    3500,
    TO_DATE('20190605', 'RRRRMMDD'),
    'ANALYST'
);

/*
컬럼명을 기술하지 않는다면 전체 컬럼에 데이터를 입력해야 하고,
명시된 컬럼(혹은 생략된 컬럼)과 입력되는 데이터의 순서를 맞춰야 한다.
*/

/*

NULL의 입력
암시적 입력 : 전체 컬럼 중 입력되지 않은 컬럼에 NULL
명시적 입력 : NULL, 혹은 ''

*/

/*

테이블에 데이터를 입력하고 수정하고 삭제하는 SQL문 : DML문
DATA MANIPULATION LANGUAGE : INSERT, UPDATE, DELECT, MERGE

*/

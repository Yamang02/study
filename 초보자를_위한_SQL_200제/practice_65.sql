/*65. 여러 테이블의 데이터를 조인해서 출력하기 ⑧(LEFT/RIGHT OUTER JOIN)*/

SELECT
    E.ENAME 이름,
    E.JOB   직업,
    E.SAL   월급,
    D.LOC   부서_위치
FROM
    EMP  E
    RIGHT OUTER JOIN DEPT D ON ( E.DEPTNO = D.DEPTNO );

-- DEPT 테이블에는 없는 부서 번호 50 입력
INSERT INTO EMP (
    EMPNO,
    ENAME,
    SAL,
    JOB,
    DEPTNO
) VALUES (
    8282,
    'JACK',
    3000,
    'ANALYST',
    50
);

SELECT
    E.ENAME 이름,
    E.JOB   직업,
    E.SAL   월급,
    D.LOC   부서_위치
FROM
    EMP  E
    LEFT OUTER JOIN DEPT D ON ( E.DEPTNO = D.DEPTNO );
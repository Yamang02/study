/* 81. 데이터 저장 및 취소하기 (COMMIT, ROLLBACK)*/

INSERT INTO EMP (
    EMPNO,
    ENAME,
    SAL,
    DEPTNO
) VALUES (
    1122,
    'JACK',
    3000,
    29
);

COMMIT;

UPDATE EMP
SET
    SAL = 4000
WHERE
    ENAME = 'SCOTT';
    
ROLLBACK;    

SELECT * FROM EMP
WHERE ENAME IN ('SCOTT',  'JACK');

/*

TCL : TRANSACTION CONTROL LANGUAGE 
COMMIT : 모든 변경 사항을 DB에 반영
ROLLBACK : 모든 변경 사항을 취소
SAVEPOINT : 특정 지점까지의 변경을 취소함


*/
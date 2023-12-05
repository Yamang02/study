/* 82.데이터 입력, 수정, 삭제 한번에 하기(MERGE) */

ALTER TABLE EMP
ADD LOC VARCHAR2(10);

/* 사원 테이블에 부서 위치 컬럼 추가, 부서 테이블 이용하여 해당 사원의 부서 위치로 값이 갱신 
만약 부서 테이블 존재 부서, 사원 테이블에 없는 부서 번호는 사원 테이블에 입력

*/

MERGE INTO EMP E
USING DEPT D ON ( E.DEPTNO = D.DEPTNO )
WHEN MATCHED THEN -- MERGE UPDATE절
 UPDATE
SET E.LOC = D.LOC
WHEN NOT MATCHED THEN -- MERGE INSERT절
INSERT (
    E.EMPNO,
    E.DEPTNO,
    E.LOC )
VALUES
    ( 1111,
    D.DEPTNO,
    D.LOC );
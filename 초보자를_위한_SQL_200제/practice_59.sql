drop  table  salgrade;

create table salgrade
( grade   number(10),
  losal   number(10),
  hisal   number(10) );

insert into salgrade  values(1,700,1200);
insert into salgrade  values(2,1201,1400);
insert into salgrade  values(3,1401,2000);
insert into salgrade  values(4,2001,3000);
insert into salgrade  values(5,3001,9999);

commit;

SELECT e.ename, e.sal, s.grade
  FROM emp e, salgrade s
  WHERE e.sal between s.losal and s.hisal;




/* 59. 여러 테이블의 데이터를 조인해서 출력하기 ②(NON EQUI JOIN)*/

SELECT
    E.ENAME,
    E.SAL,
    S.GRADE
FROM
    EMP      E,
    SALGRADE S
WHERE
    E.SAL BETWEEN S.LOSAL AND S.HISAL;
/*    
EMP 테이블의 SALGRADE 테이블을 조인해서 이름과 급여 등급을 하나의 결과로 출력하고자 하는데, 
EMP와 DEPT사이의 DEPTNO처럼 동일한 컬럼이 없음 >
EMP테이블의 월급은 SALGRADE 테이블의 LOSAL과 HISAL 사이에 있음

> NTILE 분석 함수와 다르게 범위를 더 상세하게 지정이 가능하다.
*/
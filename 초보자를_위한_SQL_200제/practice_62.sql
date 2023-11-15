/*62. 여러 테이블의 데이터를 조인해서 출력하기 ⑤(ON절)*/

SELECT
    E.ENAME AS 이름,
    E.JOB   AS 직업,
    E.SAL   AS 월급,
    D.LOC   AS "부서 위치"
FROM
         EMP E
    JOIN DEPT D ON ( E.DEPTNO = D.DEPTNO )
WHERE
    E.JOB = 'SALESMAN';
    
/*
작성법은 이전까지 다뤘던 오라클 조인 작성법과 ANSI/ISO SQL:1999 STANDARD 조인 작성법으로 나뉨
ANSI/ISO... 작성법은 9i 버전부터 지원됨

여러 테이블 조인 시 JOIN 조건 예약어를 테이블의 수 - 1만큼 작성함

*/

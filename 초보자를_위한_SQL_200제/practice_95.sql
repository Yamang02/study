/* 복잡한 쿼리를 단순하게 하기 ① (VIEW) */

/* 직업이 SALESMAN인 사원들의 사원번호 이름 월급 직업 부서 번호를 출력하는 VIEW 생성 */

CREATE VIEW EMP_VIEW AS
    SELECT
        EMPNO,
        ENAME,
        SAL,
        JOB,
        DEPTNO
    FROM
        EMP
    WHERE
        JOB = 'SALESMAN';

SELECT
    *
FROM
    EMP_VIEW;
    
/* 보안상 공개하면 안 되는 데이터들이 있을 때 유용*/   

/* VIEW에 업데이트시 실제 테이블의 변경 */
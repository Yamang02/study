/* 74. 서브 쿼리 사용하기 ④ (EXIST와 NOT EXISTS) */

-- 부서 테이블에 있는 부서 번호 중에서 사원테이블에서도 존재하는 부서 번호의 부서 번호, 부서명, 부서 위치를 출력

SELECT
    *
FROM
    DEPT D
WHERE
    EXISTS (
        SELECT
            *
        FROM
            EMP E
        WHERE
            E.DEPTNO = D.DEPTNO
    );
    
/*
테이블 A에 존재하는 데이터가 테이블 B에 존재하는지 여부를 확인할 때 
EXISTS 또는 NOT EXISTS를 사용

WHERE 절 바로 다음에 EXISTS문을 작성하고, 따로 컬럼명은 기술하지 않음
*/   

/*
존재하는지 하나의 레코드를 확인한 이후에는 더 이상 확인하지 않음
(스캔을 멈춤)
*/

SELECT
    *
FROM
    DEPT D
WHERE
    NOT EXISTS (
        SELECT
            *
        FROM
            EMP E
        WHERE
            E.DEPTNO = D.DEPTNO
    );
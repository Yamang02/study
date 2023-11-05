-- 데이터 분석 함수로 비율 출력하기 (RATIO_TO_REPORT)
-- 특정 컬럼의 데이터의 합을 기준으로 각 로우의 상대적 비율을 구하는 방법

SELECT
    E.EMPNO,
    E.ENAME,
    E.SAL,
    RATIO_TO_REPORT(SAL)
    OVER() AS 비율
FROM
    EMP E
WHERE
    E.DEPTNO = 20;

-- 전체 월급에서 부서번호가 20에 속하는 사람들의 20부서 총월급 분의 자신의 월급 비율을 보여줌

SELECT
    E.EMPNO,
    E.ENAME,
    E.SAL,
    RATIO_TO_REPORT(SAL)
    OVER() AS 비율,
    E.SAL/SUM(SAL) OVER () AS "비교 비율"
FROM
    EMP E
WHERE
    E.DEPTNO = 20;
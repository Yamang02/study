-- 데이터 분석 함수로 집계 결과 출력하기 ①(ROLLUP)

-- 직업과 직업별 토탈 월급을 출력, 맨 마지막 행에 토탈 월급 출력
SELECT
    E.JOB,
    SUM(E.SAL)
FROM
    EMP E
GROUP BY
    ROLLUP(JOB);
    
-- ROLLUP에 컬럼 2개
SELECT
    E.DEPTNO,
    E.JOB,
    SUM(E.SAL)
FROM
    EMP E
GROUP BY
    ROLLUP(DEPTNO,
           JOB);

-- ROLLUP 내부에서 뒤에서부터 하나씩 제거해 나감
-- 즉, 조합별로 ROLLUP결과를 한행씩 출력함
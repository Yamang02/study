-- 데이터 분석 함수로 집계 결과 출력하기 ②(CUBE)

SELECT JOB, SUM(SAL)
FROM EMP
GROUP BY CUBE(JOB)

-- 부서 번호도 오름차순으로 정렬됨

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY CUBE(DEPTNO, JOB);

-- 전체 토탈 월급 맨 위, 직업별 토탈월급, 부서번호별 토탈월급, 부서 번호별 직업별 토탈월급 출력됨
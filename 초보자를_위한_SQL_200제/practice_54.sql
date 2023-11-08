-- 데이터 분석 함수로 집계 결과 출력하기 ③(GROUPING SETS)

-- 부서 번호와 직업, 부서 번호별 토탈월급과 직업별 토탈 월급. 전체 토탈 월급 출력
SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS((DEPTNO), (JOB), ());

-- 이거 왜 JOB 먼저 나오지?? 예시는 DEPTNO, JOB, SUM 집계순으로 나오는데.. 

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS((DEPTNO), (JOB), ());

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS((JOB), (DEPTNO), ());
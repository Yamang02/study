SELECT
    ENAME    "이름",
    SAL      "급여",
    JOB      "직책",
    HIREDATE "고용일",
    DEPTNO   "부서번호"
FROM
    EMP
WHERE
    HIREDATE = '81/11/17';

-- 현재 접속한 세션의 날짜 형식 확인
SELECT
    *
FROM
    NLS_SESSION_PARAMETERS
WHERE
    PARAMETER = 'NLS_DATE_FORMAT';
    
-- 현재 접속한 세션의 날짜 형식 변경
ALTER SESSION SET NLS_DATE_FORMAT = 'YY/MM/DD';
-- 기존 SELECT 문에 정상적으로 출력되지 않음.
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';
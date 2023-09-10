/* 개월 수 더한 날짜 출력하기 (ADD_MONTHS) */

SELECT
    ADD_MONTHS(TO_DATE('2019-05-01', 'RRRR-MM-DD'), 100)
FROM
    DUAL;
    
-- 일수를 더하기 (한 달이 30일이나 31일이므로 더하는 일자를 파악해야 함)
SELECT
    TO_DATE('2019-05-01', 'RRRR-MM-DD') + 100
FROM
    DUAL;
    
-- ADD_MONTH
SELECT
    TO_DATE('2019-05-01', 'RRRR-MM-DD') + INTERVAL '100' MONTH
FROM
    DUAL;

--    
SELECT
    INTERVAL '100' MONTH
FROM
    DUAL;

-- 날짜유형 뒤에 주어지는 숫자는 자리수? 기본값이 유형마다 있어 만약 그 범위보다 큰 수치를 주려면 명시해야 하는 듯
SELECT
    INTERVAL '3100' DAY ( 4 )
FROM
    DUAL;

-- 3 년 더하기
SELECT
    TO_DATE('2019-05-01', 'RRRR-MM-DD') + INTERVAL '3' YEAR
FROM
    DUAL;

-- 3년 5개월 후 파악하기
SELECT
    TO_DATE('2019-05-01', 'RRRR-MM-DD') + TO_YMINTERVAL('03-05') AS 날짜
FROM
    DUAL;
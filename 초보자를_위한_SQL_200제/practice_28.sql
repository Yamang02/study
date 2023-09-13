/* 특정 날짜 뒤에 오는 요일 날짜 출력하기(NEXT_DAY)  */

SELECT
    '2019/05/22' AS 날짜,
    NEXT_DAY('2019/05/22', '월요일')
FROM
    DUAL;

SELECT
    SYSDATE AS "오늘_날짜"
FROM
    DUAL;
    
    
SELECT
    NEXT_DAY(SYSDATE, '화요일') AS 다음_날짜
FROM
    DUAL;    
    
SELECT
    NEXT_DAY(ADD_MONTHS('2019/05/22', 100), '화요일') AS 다음_날짜
FROM
    DUAL;       
    
SELECT
    NEXT_DAY(ADD_MONTHS(SYSDATE, 100), '월요일') AS 다음_날짜
FROM
    DUAL;            
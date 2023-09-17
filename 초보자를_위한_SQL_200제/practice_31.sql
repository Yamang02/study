/* 날짜형으로 데이터 유형 변환하기 (TO_DATE)*/

SELECT ename, hiredate
FROM emp
WHERE hiredate = TO_DATE('81/11/17', 'RR/MM/DD');

/* 세션 날짜 형식 확인 */
SELECT *
FROM NLS_SESSION_PARAMETERS
WHERE parameter = 'NLS_DATE_FORMAT';

/* 세션 날짜 형식 변경 */
ALTER SESSION SET NLS_DATE_FORMAT = 'DD/MM/RR';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';


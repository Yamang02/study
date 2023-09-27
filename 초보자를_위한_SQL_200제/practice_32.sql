/* 암시적 형 변환 이해 */
-- 문자형 > 숫자형
SELECT
    ENAME,
    SAL
FROM
    EMP
WHERE
    SAL = '3000';


/* 테이블 생성 */

CREATE TABLE EMP32 (
    ENAME VARCHAR2(10),
    SAL   VARCHAR2(10)
);

INSERT INTO EMP32 VALUES (
    'SCOTT',
    '3000'
);

INSERT INTO EMP32 VALUES (
    'SMITH',
    '1200'
);

COMMIT;

SELECT
    ENAME,
    SAL
FROM
    EMP32
WHERE
    SAL = '3000';
    
/* 문자 > 숫자 형변환 TO_NUMBER(SAL) */
SELECT
    ENAME,
    SAL
FROM
    EMP32
WHERE
    SAL = 3000;
    
    
/* 문자 > 숫자 형변환 TO_NUMBER(SAL) */
-- SQL 실행 계획 같이 출력
-- SET AUTOT ON
SELECT
    ENAME,
    SAL
FROM
    EMP32
WHERE
    SAL = 3000;    
/* 92. 계층형 질의문으로 서열을 주고 데어터 출력하기 ④ */

/*서열 순서 가로로 출력 */
SELECT
    ENAME,
    SYS_CONNECT_BY_PATH(ENAME, '/') AS PATH
FROM
    EMP
START WITH
    ENAME = 'KING'
CONNECT BY
    PRIOR EMPNO = MGR;

SELECT
    ENAME,
    LTRIM(SYS_CONNECT_BY_PATH(ENAME, '/'),
          '/') AS PATH
FROM
    EMP
START WITH
    ENAME = 'KING'
CONNECT BY
    PRIOR EMPNO = MGR;
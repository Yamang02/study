/* 반올림해서 출력하기(ROUND) */

SELECT
    '876.567' AS 숫자,
    ROUND(876.567, 1),
    ROUND(876.567, 2),
    ROUND(876.567, - 1),
    ROUND(876.567, - 2),
    ROUND(876.567, 0),
    ROUND(876.567)
FROM
    DUAL;
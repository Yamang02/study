/* 숫자를 버리고 출력하기 */

SELECT
    '876.567' 숫자,
    TRUNC(876.567, 1),
    TRUNC(876.567, 2),
    TRUNC(876.567, -1),
    TRUNC(876.567, -1),
    TRUNC(876.567, 0),
    TRUNC(876.567)
FROM
    DUAL;
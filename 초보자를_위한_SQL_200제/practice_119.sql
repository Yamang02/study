/*119.SQL로 알고리즘 문제 풀기 ⑦(1부터 10까지 짝수만 출력)*/

/*아래 쿼리 WITHIN 없다고 오류남*/
/* SQL*Plus: Release 11.2.0.2.0 Production  */
/*오라클 데이터베이스 11g Express Edition (XE)에서 LISTAGG 함수 사용 시 ORA-02000: missing WITHIN keyword 오류가 발생하는 이유는 해당 버전에서는 LISTAGG 함수에서 WITHIN GROUP 키워드를 지원하지 않기 때문입니다. WITHIN GROUP은 Oracle Database 11g Release 2 (11.2.0.2.0) 이후 버전부터 도입된 기능 중 하나이며, Oracle 12c 이상에서 표준 SQL에서 정의한 대로 사용 가능합니다.

11g Express Edition에서는 WITHIN GROUP 키워드를 사용하지 않고 LISTAGG 함수를 활용하려면, 정렬을 하지 않거나 별도의 정렬이 필요하다면 ORDER BY 구문을 사용하여 정렬을 수행해야 합니다.*/

UNDEFINE P_N
ACCEPT P_N PROMPT '숫자에 대한 값 입력 : ';

UNDEFINE P_N
ACCEPT P_N PROMPT '숫자에 대한 값 입력 : ';

SELECT
    LISTAGG(LEVEL, ' , ') AS "짝수"
FROM
    DUAL
CONNECT BY
    LEVEL <= &P_N AND MOD(LEVEL, 2) = 0;


SELECT
    LISTAGG(LEVEL, ' , ') WITHIN GROUP(
    ORDER BY
        LEVEL
    ) AS "짝수"
FROM
    DUAL
WHERE
    MOD(LEVEL, 2) = 0
CONNECT BY
    LEVEL <= &P_N;
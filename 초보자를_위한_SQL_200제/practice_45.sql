/* 
데이터 분석 함수로 데이터를 가로로 출력하기(LISTAGG) 

*/


/* LISTAGG 구분자에 , 사용해 이름이 콤마로 구분됨. WITHIN GROUP :  '~이내의' = GROUP 다음에 나오는 괄호에 속한 그룹의 데이터를 출력하겠다.*/
SELECT
    DEPTNO,
    LISTAGG(ENAME, ',') WITHIN GROUP(
    ORDER BY
        ENAME
    ) AS EMPLOYEE
FROM
    EMP
GROUP BY
    DEPTNO;


/* 직업별 소속*/

SELECT
    JOB,
    LISTAGG(ENAME, ',') WITHIN GROUP(
    ORDER BY
        ENAME ASC
    ) AS EMPLOYEE
FROM
    EMP
GROUP BY
    JOB;

SELECT
    JOB,
    LISTAGG(ENAME
            || '('
            || SAL
            || ')', ',') WITHIN GROUP(
    ORDER BY
        ENAME ASC
    ) AS EMPLOYEE
FROM
    EMP
GROUP BY
    JOB;
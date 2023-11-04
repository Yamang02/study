-- 데이터 분석 함수로 누적 데이터 출력하기(SUM OVER)
SELECT
    EMPNO,
    ENAME,
    SAL,
    SUM(SAL)
    OVER(
        ORDER BY
            EMPNO
        ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW
    ) 누적치
FROM
    EMP
WHERE
    JOB IN ( 'ANALYST', 'MANAGER' );
/*   
OVER 다음의 괄호 안에는 값을 누적할 윈도우를 지정할 수 있음.
ORDER BY EMPNO를 통해 사원번호를 오름차순으로 정렬을하고 정렬을 기준으로 월급의 누적치 출력

윈도우 기준 ROWS /
윈도우 방식 UNBOUNDED PRECEDING - 맨 첫 번째 행 / UNBOUNDED FOLLOWING - 맨 마지막 행 / CURRENT TOW - 현재 행
ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW 는 첫 번째 행부터 현재 행까지
*/
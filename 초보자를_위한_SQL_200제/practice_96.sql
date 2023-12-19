/* 96. 복잡한 쿼리를 단순하게 하기 ②(VIEW) */

/*
부서 번호와 부서 번호별 평균 월급을 출력하는 VIEW를 생성
*/

CREATE VIEW EMP_VIEW2 AS
    SELECT
        DEPTNO,
        ROUND(AVG(SAL)) 평균_월급
    FROM
        EMP
    GROUP BY
        DEPTNO;

/*
뷰 생성 시 함수나 그룹함수를 작성할 때는 반드시 컬럼 별칭 사용
뷰에 함수나 그룹 함수 포함 시 복합 뷰
복합 VIEW는 단순 VIEW와 비교해 데이터 수정이 불가능 할 수 있음
복잡한 쿼리 단순화 가능
*/
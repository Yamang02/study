/*149. PL/SQL Cursor for Loop문 이해하기 */

/*
서브쿼리로 148번을 더 간단하게 작성
*/

SET SERVEROUTPUT ON
SET VERIFY OFF

ACCEPT P_DEPTNO PROMPT '부서 번호 입력'

BEGIN
    FOR EMP_RECORD IN (
        SELECT
            ENAME,
            SAL,
            DEPTNO
        FROM
            EMP
        WHERE
            DEPTNO = &P_DEPTNO
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(EMP_RECORD.ENAME
                             || ' '
                             || EMP_RECORD.SAL
                             || ' '
                             || EMP_RECORD.DEPTNO);
    END LOOP;
END;
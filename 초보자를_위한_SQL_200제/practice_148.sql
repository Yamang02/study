/*148. PL/SQL Cursor문 이해하기(FOR LOOP) */

ACCEPT P_DEPTNO PROMPT '부서 번호 입력'

SET SERVEROUTPUT ON
SET VERIFY OFF

DECLARE
    CURSOR C_EMP IS
    SELECT
        ENAME,
        SAL,
        DEPTNO
    FROM
        EMP
    WHERE
        DEPTNO = &P_DEPTNO;

BEGIN
    FOR EMP_RECORD IN C_EMP LOOP
        DBMS_OUTPUT.PUT_LINE(EMP_RECORD.ENAME
                             || ' '
                             || EMP_RECORD.SAL
                             || ' '
                             || EMP_RECORD.DEPTNO);
    END LOOP;
END;
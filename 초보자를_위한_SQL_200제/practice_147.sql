/*147. PL/SQL CURSOR문 이해하기(BASIC LOOP)  */

SET SERVEROUTPUT ON

DECLARE
    V_ENAME  EMP.ENAME%TYPE;
    V_SAL    EMP.SAL%TYPE;
    V_DEPTNO EMP.DEPTNO%TYPE;
    CURSOR EMP_CURSOR IS
    SELECT
        ENAME,
        SAL,
        DEPTNO
    FROM
        EMP
    WHERE
        DEPTNO = &P_DEPTNO;

BEGIN
    OPEN EMP_CURSOR;
    LOOP
        FETCH EMP_CURSOR INTO
            V_ENAME,
            V_SAL,
            V_DEPTNO;
        EXIT WHEN EMP_CURSOR%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(V_ENAME
                             || ' '
                             || V_SAL
                             || ' '
                             || V_DEPTNO);

    END LOOP;

    CLOSE EMP_CURSOR;
END;
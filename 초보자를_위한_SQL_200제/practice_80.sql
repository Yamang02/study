/* 80. 데이터 삭제하기 (DELETE, TRUNCATE, DROP) */

DELETE FROM EMP
WHERE
    ENAME = 'SCOTT';
    
/* 오라클 데이터 삭제하는 명령어 3가지

데이터, 저장공간, 저장구조, 취소여부, 플래쉬백 여부

DELETE는     삭제 / 남김 / 남김 / 가증 / 가능
TRUNCATE    삭제 / 삭제 / 남김 / 불가능 / 불가능
 > 취소가 불가능하므로 속도가 더 빠름
DROP        삭제 / 삭제 / 삭제 / 불가능 / 가능

*/    

/* DDL 문은 암시적인 COMMIT 발생 : CREATE ALTER DROP TRUNCATE RENAME*/
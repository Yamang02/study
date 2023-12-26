/*103. 실수로 지운 데이터 복구하기 ⑤ (FLASHBACK TRANSACTION QUERY)*/

SELECT
    UNDO_SQL
FROM
    FLASHBACK_TRANSACTION_QUERY
WHERE
        TABLE_OWNER = 'scott'
    AND TABLE_NAME = 'EMP'
    AND COMMIT_SCN BETWEEN 9457390 AND 9457397
ORDER BY
    START_TIMESTAMP DESC;
    
/* SCN 은 SYSTEM CHANGE NUMBER의 약자 COMMIT시 생성됨. 특정 시간대의 SCN번호로 범위 지정*/ 
/* TRANSACTION QUERY의 결과 보기 위해서는 DB모드를 아카이브 모드로 변경 : 장애 발생시 DB를 복구할 수 있는 로그 정보를 자동으로 저장
*/

/*SQL 플러스에서 진행*/
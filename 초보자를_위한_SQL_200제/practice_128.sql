/*128. 스티브 잡스 연설문에는 긍정단어가 많은가 부정단어가 많은가?*/

CREATE TABLE POSITIVE (
    P_TEXT VARCHAR2(2000)
);

CREATE TABLE NEGATIVE (
    N_TEXT VARCHAR2(2000)
);

/* 이전 연설문 단어 추출 쿼리를 VIEW로 생성*/
CREATE VIEW SPEECH_VIEW AS
    SELECT
        REGEXP_SUBSTR(LOWER(SPEECH_TEXT),
                      '[^ ]+',
                      1,
                      A) AS WORD
    FROM
        SPEECH,
        (
            SELECT
                LEVEL A
            FROM
                DUAL
            CONNECT BY
                LEVEL <= 52
        );
        
/* 긍정 단어 조회 */
SELECT
    COUNT(WORD) AS 긍정단어
FROM
    SPEECH_VIEW
WHERE
    LOWER(WORD) IN (
        SELECT
            LOWER(P_TEXT)
        FROM
            POSITIVE
    );

/* 부정 단어 */
SELECT
    COUNT(WORD) AS 부정단어
FROM
    SPEECH_VIEW
WHERE
    LOWER(WORD) IN (
        SELECT
            LOWER(N_TEXT)
        FROM
            NEGATIVE
    );

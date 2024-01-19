/*127. 스티브 잡스 연설문에서 가장 많이 나오는 단어는 무엇인가?*/

CREATE TABLE SPEECH (
    SPECH_TEXT VARCHAR2(1000)
);

SELECT
    COUNT(*)
FROM
    SPEECH;

/* 정규표현식을 통해 어절 추출 */
SELECT REGEXP_SUBSTR(
    'I never graduated from college',
    '[^ ]+',
    1,
    2
) word from dual;

/*가장 긴 문장의 어절 개수는 52*/
SELECT REGEXP_SUBSTR(lower(speech_text), '[^ ]+', 1, a) AS WORD 
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

WITH WORDS AS 
(SELECT REGEXP_SUBSTR(lower(speech_text), '[^ ]+', 1, a) AS WORD 
FROM
    SPEECH,
    (
        SELECT
            LEVEL A
        FROM
            DUAL
        CONNECT BY
            LEVEL <= 52
    ) )

SELECT WORD, COUNT(*) 
FROM WORDS
WHERE WORD IS NOT NULL
GROUP BY WORD
ORDER BY COUNT(*) DESC;

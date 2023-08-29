SELECT
    INSTR('SMITH', 'M')
FROM
    DUAL;

/* INSTR + SUBSTR 로 특정 문자열 추출 */

-- 없앨 문자열 위치 찾기
SELECT
    INSTR('ABCDEFG@NAVER.COM', '@')
FROM
    DUAL;

-- @ 다음부터 끝까지 출력
SELECT
    SUBSTR('ABCDEFG@NAVER.COM',
           INSTR('ABCDEFG@NAVER.COM', '@') + 1)
FROM
    DUAL;

-- RTRIM = NAVER
SELECT
    RTRIM(SUBSTR('ABCDEFG@NAVER.COM',
                 INSTR('ABCDEFG@NAVER.COM', '@') + 1),
          '.COM')
FROM
    DUAL    
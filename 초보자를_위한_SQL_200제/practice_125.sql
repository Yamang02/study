/*125. SQL로 알고리즘 문제풀기 ⑮(오일러 상수 자연상수 구하기)*/

/*몬테카를로 알고리즘을 이용해 자연상수e 값 출력*/

WITH LOOP_TABLE AS (
    SELECT
        LEVEL AS NUM
    FROM
        DUAL
    CONNECT BY
        LEVEL <= 100000
)
SELECT
    RESULT
FROM
    (
        SELECT
            NUM,
            POWER((1 + 1 / NUM), NUM) AS RESULT
        FROM
            LOOP_TABLE
    )
WHERE
    NUM = 100000;
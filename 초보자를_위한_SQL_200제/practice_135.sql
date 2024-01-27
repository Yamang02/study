DROP TABLE ACC_LOC_DATA;

CREATE TABLE ACC_LOC_DATA (
    ACC_LOC_NO       NUMBER(10),
    ACC_YEAR         NUMBER(10),
    ACC_TYPE         VARCHAR2(20),
    ACC_LOC_CODE     NUMBER(10),
    CITY_NAME        VARCHAR2(50),
    ACC_LOC_NAME     VARCHAR2(200),
    ACC_CNT          NUMBER(10),
    AL_CNT           NUMBER(10),
    DEAD_CNT         NUMBER(10),
    M_INJURY_CNT     NUMBER(10),
    L_INJURY_CNT     NUMBER(10),
    H_INJURY_CNT     NUMBER(10),
    LAT              NUMBER(15, 8),
    LOT              NUMBER(15, 8),
    DATA_UPDATE_DATE DATE
);

SELECT
    *
FROM
    (
        SELECT
            ACC_LOC_NAME AS 사고_장소,
            ACC_CNT      AS 사고_건수,
            DENSE_RANK()
            OVER(
                ORDER BY
                    ACC_CNT DESC NULLS LAST
            )            AS 순위
        FROM
            ACC_LOC_DATA
        WHERE
            ACC_YEAR = 2017
    )
WHERE
    순위 <= 5;
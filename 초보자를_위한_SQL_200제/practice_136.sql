DROP TABLE CLOSING;

CREATE TABLE CLOSING (
    년도     NUMBER(10),
    미용실    NUMBER(10),
    양식집    NUMBER(10),
    일식집    NUMBER(10),
    치킨집    NUMBER(10),
    커피음료   NUMBER(10),
    한식음식점  NUMBER(10),
    호프간이주점 NUMBER(10)
);

SELECT
    년도  AS "치킨집 폐업 연도",
    치킨집 AS "건수"
FROM
    (
        SELECT
            년도,
            치킨집,
            RANK()
            OVER(
                ORDER BY
                    치킨집 DESC
            ) 순위
        FROM
            CLOSING
    )
WHERE
    순위 = 1;
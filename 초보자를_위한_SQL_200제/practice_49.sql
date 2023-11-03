drop  table order2;

create table order2
( ename  varchar2(10),
  bicycle  number(10),
  camera   number(10),
  notebook  number(10) );

insert  into  order2  values('SMITH', 2,3,1);
insert  into  order2  values('ALLEN',1,2,3 );
insert  into  order2  values('KING',3,2,2 );

commit;




-- 열을 행으로 출력
SELECT *
FROM ORDER2
UNPIVOT(건수 FOR 아이템 IN (BICYCLE, CAMERA, NOTEBOOK))

-- AS 사용 가능
SELECT *
FROM ORDER2
UNPIVOT(건수 FOR 아이템 IN (BICYCLE AS 'B', CAMERA AS 'C', NOTEBOOK AS 'N'));

-- NULL이 포함된 행은 UNPIVOT에서 출력되지 않음
UPDATE ORDER2
SET
    NOTEBOOK = NULL
WHERE
    ENAME = 'SMITH'
    
-- INCLUDE NULLS 명령어 사용
SELECT * 
FROM ORDER2
UNPIVOT INCLUDE NULLS(건수 FOR 아이템 IN (BICYCLE, CAMERA, NOTEBOOK));
/* 97. 데이터 검색 속도를 높이기(INDEX)*/
CREATE INDEX EMP_SAL
ON EMP(SAL);

/* 인덱스가 없으면 풀스캔 조건에 맞는 행 찾은 후 풀 스캔*/

/* 인덱스가 있을시 인덱스(컬럼값과 로우 아이디)를 통해 접근: SAL이 내림차순으로 저장되어 있음*/
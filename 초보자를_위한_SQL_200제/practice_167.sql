/* 167. 기초 통계 구현하기 ⑩(정규분포)  */

CREATE OR REPLACE PROCEDURE PROBN (
    P_MU IN NUMBER, -- 평균값
    P_SIG IN NUMBER, -- 표준편차
    P_BIN IN NUMBER -- 키 데이터의 도수 
) IS
    TYPE ARR_TYPE IS
        VARRAY(9) OF NUMBER(30);
    V_SIM NUMBER(10) := 10000;
    V_RV  NUMBER(20, 7);  -- 평균 160에 표준편차 5로 하는 키 데이터를 할당할 변수
    V_MU  NUMBER(10) := P_MU;
    V_SIG NUMBER(10) := P_SIG;
    V_NM  ARR_TYPE := ARR_TYPE('', 0, 0, 0, 0, 0, 0, 0, ''); -- 키 데이터 저장할 배열 변수, 양쪽의 ""는 무한대를 나타내어 결과에서 ~ 를 표현하기 위함
    V_CNT ARR_TYPE := ARR_TYPE(0, 0, 0, 0, 0, 0, 0, 0); -- 해당 범위의 인원 카운트
    V_RG  ARR_TYPE := ARR_TYPE(-POWER(2, 31), -3, -2, -1, 0, 1, 2, 3, POWER(2, 32)); -- 표준편차 크기 정하는 값을 저장할 배열변수
BEGIN
    FOR I IN V_NM.FIRST + 1 .. V_NM.LAST - 1 LOOP
        V_NM(I) := V_MU - 3 * P_BIN + (I - 2) * P_BIN;
    END LOOP; -- 히스토그램의 그래프 간격... 145 ... 175 저장

    FOR I IN 1 .. V_SIM LOOP
        V_RV := DBMS_RANDOM.NORMAL * V_SIG + V_MU;
        FOR I IN 2.. V_RG.COUNT LOOP
            IF V_RV > V_MU + V_RG(I-1) * P_BIN AND V_RV < V_MU + V_RG(I) * P_BIN THEN
                V_CNT(I-1) := V_CNT(I-1) +1;
            END IF;
        END LOOP;
    END LOOP;

    FOR I IN 1 .. V_CNT.COUNT LOOP
        DBMS_OUTPUT.PUT_LINE(RPAD(V_NM(I)
                                  || '~'
                                  || V_NM(I+1), 10, ' ')
                             || LPAD('■', TRUNC((V_CNT(I)/V_SIM)*100), '■'));
    END LOOP;
END;

EXEC PROBN(160, 5, 5)
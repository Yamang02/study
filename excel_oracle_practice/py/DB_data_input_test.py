import cx_Oracle
from openpyxl import load_workbook
import os

# 스크립트가 위치한 경로
script_path = os.path.dirname(os.path.abspath(__file__))

# EXCEL_TEST.xlsx 파일의 경로
file_path = os.path.join(script_path, "../EXCEL_TEST.xlsx")

''' 데이터베이스 연결 정보는 config로 실행

# Oracle 데이터베이스 연결 정보
username = "PRACTICE_TEST"
password = "TEST"
host = "localhost"
port = "1521"
service_name = "xe"

# Oracle 데이터베이스 연결 문자열 생성
dsn = cx_Oracle.makedsn(host, port, service_name=service_name)

# 연결 시작
connection = cx_Oracle.connect(username, password, dsn)

# 연결 상태 확인
if connection.version:
    print("Oracle DB에 성공적으로 연결되었습니다.")
    # 추가로 작업하거나 쿼리를 실행할 수 있습니다.
else:
    print("Oracle DB 연결에 실패했습니다.")
    exit()
'''
    

# Excel 파일에서 데이터 가져오기
wb = load_workbook(filename=file_path)
ws_sheet1 = wb['Sheet1']
data_list = [{'idx': row[0], 'str': row[1]} for row in ws_sheet1.iter_rows(min_row=2, values_only=True)]

# 데이터 삽입 쿼리 실행
try:
    cursor = connection.cursor()

    for data in data_list:
        query = "INSERT INTO EXCEL_TEST (PK_TYPE_NUM, TYPE_VARCHAR) VALUES (:1, :2)"
        cursor.execute(query, (data['idx'], data['str']))

    connection.commit()
    print("데이터가 성공적으로 삽입되었습니다.")
except cx_Oracle.Error as error:
    print(f"데이터 삽입 중 오류 발생: {error}")
    connection.rollback()
finally:
    cursor.close()
    connection.close()
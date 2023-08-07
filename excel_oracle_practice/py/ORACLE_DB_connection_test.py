# Oracle DB와의 연결확인
# cx_Oracle 라이브러리 사용
import os
import json
import cx_Oracle

cpath = os.getcwd()
config_file_path = cpath + '/excel_oracle_practice/config/test_connection_info.json'
# config_file_path = '../config/test_connection_info.json'

# 설정 파일 읽기
with open(config_file_path, 'r') as config_file:
    config_data = json.load(config_file)

# 연결 정보 가져오기
username = config_data['username']
password = config_data['password']
host = config_data['host']
port = config_data['port']
service_name = config_data['service_name']

# Oracle 데이터베이스 연결 문자열 생성
dsn = cx_Oracle.makedsn(host, port, service_name=service_name)

def connect() :
    # 연결 시작
    try:
        connection = cx_Oracle.connect(username, password, dsn)
        print("Oracle DB에 성공적으로 연결되었습니다.")
        return connection
    except cx_Oracle.Error as error:
        print(f"Oracle DB 연결에 실패했습니다: {error}")
        return None

# connect()

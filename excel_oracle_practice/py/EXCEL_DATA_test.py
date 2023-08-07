# openpyxl 라이브러리로 excel의 DATA 다루기
from openpyxl import load_workbook
import os
from classes import DataManage as dm, data_type1
# 스크립트가 위치한 경로
script_path = os.path.dirname(os.path.abspath(__file__))

# EXCEL_TEST.xlsx 파일의 경로
file_path = os.path.join(script_path, "../EXCEL_TEST.xlsx")

wb = load_workbook(filename=file_path)

# 워크시트 정보
ws_sheet1 = wb['Sheet1']

# 워크시트에 정보 추가
# 데이터 생성
from classes import data_type1  # classes 모듈에서 data_type1 클래스를 임포트합니다.

'''
# data_type1 클래스의 생성자에 num과 name을 전달합니다.
test_data = data_type1(2, 'John')
test_data2 = data_type1(3,'Tom')

# dataInsert 함수를 호출할 때 data 매개변수로 test_data를 전달합니다.
dm.dataInsert(ws_sheet1, 2, test_data)
dm.dataInsert(ws_sheet1, 3, test_data2)

print(dm.dataSelect(ws_sheet1, 2))

dm.dataUpdate(ws_sheet1, 3, test_data2)

dm.visibleToggle(ws_sheet1, 3)
dm.dataDelete(ws_sheet1)
'''

wb.save(filename=file_path)

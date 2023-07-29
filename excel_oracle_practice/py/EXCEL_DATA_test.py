# openpyxl 라이브러리로 excel의 DATA 다루기
from openpyxl import load_workbook
import os

# 스크립트가 위치한 경로
script_path = os.path.dirname(os.path.abspath(__file__))

# EXCEL_TEST.xlsx 파일의 경로
file_path = os.path.join(script_path, "../EXCEL_TEST.xlsx")

wb = load_workbook(filename=file_path)

# 워크시트 정보
ws_sheet1 = wb['Sheet1']

# 입력된 모든 정보 확인
def check_whole_data() :
    for idx, row in enumerate(ws_sheet1.iter_rows(min_row=1, values_only=True), 1):
        print(f"row {idx}, row[0] : {row[0]}, row[1] : {row[1]}")

    # 인덱스 없이 값만 확인
    # for row in ws_sheet1.iter_rows(min_row=1, values_only=True):
    #     print(f"row[0] : {row[0]}, row[1] : {row[1]}",  )

# 새 정보 입력
def insert_data(target_row, data) :
    ws_sheet1.cell(row=target_row,column=1).value = data['idx']
    ws_sheet1.cell(row=target_row,column=2).value = data['str']

data = { 'idx': 3, 'str' : '배고파'}

wb.save(filename=file_path)
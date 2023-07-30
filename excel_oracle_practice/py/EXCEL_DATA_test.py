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



data = { 'idx': 3, 'str' : '배고파'}

wb.save(filename=file_path)
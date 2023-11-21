import sys, os
dir_path = os.getcwd()
sys.path.append(dir_path + "\\excel_oracle_practice\\py" )

# print(dir_path)
# print(__file__)

from openpyxl import load_workbook

from ExcelDataManager import ExcelDataManager

# openpyxl은 csv를 지원하지 않음
workbook = load_workbook("main_asp_list.xlsx")
worksheet = workbook['main_asp_list']

exceldm = ExcelDataManager()

list =  exceldm.create_data_list(worksheet)

#print(list)
src_base_path = "C:\\Users\\dit223501\\Desktop\\git\\gitlab_dit-cybershop"
src_file = ""
dest_path = ""


# 파일 옮기는 로직
import shutil

for list_item in list :
    # 연결되는 페이지가 없으면
    if list_item['연결여부'] == 'N' or list_item['연결여부'] == 'n' :
        
        # 해당 디렉토리의 BACK 폴더에 파일들을 옮김
        if list_item['dir'] == 'root' :
            src_file = os.path.join(src_base_path , list_item['ASP 파일명'])
            dest_path = src_base_path + "\\BACK"
            print(f"{src_file},{dest_path}")
            try :
                shutil.move(src_file, dest_path)
            except :
                continueD
        else :
            src_file = os.path.join(src_base_path + list_item['dir'] , list_item['ASP 파일명'])
            dest_path = src_base_path + list_item['dir'] + "\\BACK"
            print(f"{src_file},{dest_path}")
            try :
                shutil.move(src_file, dest_path)
            except :
                continue



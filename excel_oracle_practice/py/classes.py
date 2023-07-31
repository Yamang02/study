class DataManage :

    # worksheet 내 헤더 정보 확인
    def worksheetHeader(self, worksheet):
        header_data = []

        for row in worksheet.iter_rows(min_row=1, max_row=1, values_only=True):
            header_data = list(row)

        return header_data

    # 새 정보 입력
    def dataInsert(worksheet, target_row : int, data):
        data_dict = data.__dict__

        for col_idx, (key, value) in enumerate(data_dict.items(), 1):
            worksheet.cell(row=target_row, column=col_idx).value = value

    # 특정 행의 정보 확인
    def dataSelect(worksheet, target_row : int):
        selected_row_data = {}
        header_row = worksheet[1]  # 1행의 데이터를 가져옴

        for col_idx, cell in enumerate(worksheet.iter_rows(min_row=target_row, max_row=target_row, values_only=True), 1):
            for header_cell, value in zip(header_row, cell):
                selected_row_data[header_cell.value] = value
                print(f"{header_cell.value}, value: {value}")

        return selected_row_data
    

     # 특정 행의 정보 수정 (컬럼 대소문자 구분)
    def dataUpdate(worksheet, target_row : int, data):
        data_dict = data.__dict__
        header_row = worksheet[1]  # 1행의 데이터를 가져옴

        for col_idx, (key, value) in enumerate(data_dict.items(), 1):
            # 헤더에 해당하는 컬럼을 찾기 위해 key와 일치하는 컬럼을 탐색
            for header_cell in header_row:
                if header_cell.value == key:
                    worksheet.cell(row=target_row, column=header_cell.column, value=value)
                    break
            else:
                print(f"Warning: '{key}' is not a valid column in the worksheet.")

     # 행의 'visible' 값을 'n'으로 변환하고 변경된 행의 인덱스를 반환하는 함수
    def visibleToggle(worksheet, target_row : int):
        header_row = worksheet[1]  # 1행의 데이터를 가져옴

        # 'visible' 컬럼을 찾기 위해 헤더를 탐색
        visible_column_idx = None
        for col_idx, header_cell in enumerate(header_row, 1):
            if header_cell.value == 'visible':
                visible_column_idx = col_idx
                break

        if visible_column_idx is None:
            print("Error: 'visible' column not found in the worksheet.")
            return None

        # 현재 'visible' 값을 확인하여 토글
        current_value = worksheet.cell(row=target_row, column=visible_column_idx).value
        new_value = 'n' if current_value == 'y' else 'y'
        worksheet.cell(row=target_row, column=visible_column_idx, value=new_value)
        return target_row
    
         # visible 값이 'n'인 행을 삭제하고 삭제된 행의 개수를 반환하는 함수
    
    def dataDelete(worksheet):
        header_row = worksheet[1]  # 1행의 데이터를 가져옴

        # 'visible' 컬럼을 찾기 위해 헤더를 탐색
        visible_column_idx = None
        for col_idx, header_cell in enumerate(header_row, 1):
            if header_cell.value == 'visible':
                visible_column_idx = col_idx
                break

        if visible_column_idx is None:
            print("Error: 'visible' column not found in the worksheet.")
            return None

        # visible 값이 'n'인 행을 찾아 삭제
        deleted_row_count = 0
        for row_idx, cell in enumerate(worksheet.iter_rows(min_row=2, min_col=visible_column_idx,
                                                           max_col=visible_column_idx, values_only=True), 2):
            if cell[0] == 'n':
                worksheet.delete_rows(row_idx)
                deleted_row_count += 1

        return deleted_row_count

class data_type1 :
    def __init__(self, num, name) :
        self.num = num
        self.name = name
        self.visible = 'y'
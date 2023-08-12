import json
import os

def load_user_agents():
    script_dir = os.path.dirname(__file__)  # 모듈 파일의 디렉토리 경로
    file_path = os.path.join(script_dir, 'json_package', 'user_agents.json')  # JSON 파일의 상대 경로 지정
    with open(file_path, 'r') as file:
        data = json.load(file)
        return data

def get_user_agents():
    return load_user_agents()
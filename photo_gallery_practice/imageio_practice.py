import os
import subprocess

class VideoToGifConverter:
    def __init__(self, input_path, output_path):
        self.input_path = input_path
        self.output_path = output_path

    def convert_to_gif(self):
        # 입력 폴더가 없으면 생성
        if not os.path.exists(self.input_path):
            os.makedirs(self.input_path)

        # 출력 폴더가 없으면 생성
        if not os.path.exists(self.output_path):
            os.makedirs(self.output_path)

        # 입력 폴더에서 MP4 파일 목록을 가져옴
        video_files = [f for f in os.listdir(self.input_path) if f.endswith('.mp4')]

        for video_file in video_files:
            input_video_path = os.path.join(self.input_path, video_file)
            output_gif_path = os.path.join(self.output_path, video_file.replace('.mp4', '.gif'))  # 확장자 변경

            if not os.path.exists(output_gif_path):
                if self.create_gif(input_video_path, output_gif_path):
                    print(f"GIF를 저장했습니다: {output_gif_path}")
                else:
                    print(f"GIF 생성 중 오류 발생: {output_gif_path}")

    def create_gif(self, input_path, output_path):
        try:
            # MP4 파일을 이미지 시퀀스로 추출
            subprocess.run(['ffmpeg', '-i', input_path, '-vf', 'fps=10', os.path.join(self.output_path, 'frame_%04d.png')])

            # 이미지 시퀀스를 GIF로 변환
            subprocess.run(['ffmpeg', '-i', os.path.join(self.output_path, 'frame_%04d.png'), '-vf', 'fps=10', output_path])

            # 이미지 파일 삭제
            image_files = [f for f in os.listdir(self.output_path) if f.endswith('.png')]
            for image_file in image_files:
                os.remove(os.path.join(self.output_path, image_file))

            return True

        except FileNotFoundError as e:
            print(f"오류 발생: {e}")
            return False
        except Exception as e:
            print(f"오류 발생: {e}")
            return False

if __name__ == "__main__":
    input_path = 'E:\\video_clip\\'
    output_path = 'E:\\video_gif\\'

    gif_converter = VideoToGifConverter(input_path, output_path)
    gif_converter.convert_to_gif()

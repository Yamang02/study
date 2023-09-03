import cv2
import os
import subprocess  # subprocess 모듈 추가

class ClipMaker:
    def __init__(self, input_path, output_path, ffmpeg_path):  # ffmpeg 경로 추가
        self.input_path = input_path
        self.output_path = output_path
        self.ffmpeg_path = ffmpeg_path  # ffmpeg 경로 저장

    def make_clips(self):
        # 입력 폴더에서 동영상 파일 목록을 가져옴
        video_files = [f for f in os.listdir(self.input_path) if f.endswith('.mp4')]

        for video_file in video_files:
            input_video_path = os.path.join(self.input_path, video_file)
            output_video_path = os.path.join(self.output_path, video_file.replace('.mp4', '.gif'))  # 확장자 변경

            if not os.path.exists(output_video_path):
                if self.create_clip(input_video_path, output_video_path):
                    print(f"클립을 저장했습니다: {output_video_path}")
                else:
                    print(f"클립 생성 중 오류 발생: {output_video_path}")
                    # 오류가 발생했을 때, 해당 클립 파일 삭제
                    os.remove(output_video_path)

    def create_clip(self, input_path, output_path):
        try:
            # 비디오 캡처 객체 생성
            cap = cv2.VideoCapture(input_path)

            # 파일이 존재하지 않을 경우 예외 처리
            if not cap.isOpened():
                print(f"동영상 파일을 찾을 수 없습니다: {input_path}")
                return False

            # 비디오의 프레임 레이트 얻기
            frame_rate = int(cap.get(cv2.CAP_PROP_FPS))

            # 비디오의 총 프레임 수 얻기
            total_frames = int(cap.get(cv2.CAP_PROP_FRAME_COUNT))

            # 클립 길이 (프레임 수)
            clip_length = frame_rate * 5

            # 프리뷰 클립을 저장할 리스트
            preview_clips = []

            # 동영상을 10개의 클립으로 나누고 각 클립에서 시작 부분에서 1.5초를 2배속으로 보여줌
            for i in range(10):
                start_frame = i * (total_frames // 10)

                cap.set(cv2.CAP_PROP_POS_FRAMES, start_frame)

                clip_frames = []
                for j in range(clip_length):
                    ret, frame = cap.read()
                    if not ret:
                        break
                    clip_frames.append(frame)

                # 2배 속으로 재생
                clip_frames = [clip_frames[j] for j in range(int(1.5 * frame_rate), len(clip_frames), 2)]

                preview_clips.extend(clip_frames)

            # 비디오 캡처 객체 해제
            cap.release()

            # 이미지 파일로 프리뷰 클립 저장
            temp_image_path = 'temp_clip.gif'
            fourcc = cv2.VideoWriter_fourcc(*'GIF ')  # GIF 형식으로 지정
            out = cv2.VideoWriter(temp_image_path, fourcc, frame_rate, (preview_clips[0].shape[1], preview_clips[0].shape[0]), isColor=True)

            # 프리뷰 클립을 이미지 파일에 쓰기
            for frame in preview_clips:
                out.write(frame)

            # 비디오 라이터 해제
            out.release()

            # 이미지 파일을 GIF로 변환
            subprocess.run([self.ffmpeg_path, '-i', temp_image_path, '-pix_fmt', 'rgb24', output_path])

            # 임시 이미지 파일 삭제
            os.remove(temp_image_path)

            return True

        except FileNotFoundError as e:
            print(f"오류 발생: {e}")
            return False
        except Exception as e:
            print(f"오류 발생: {e}")
            return False

if __name__ == "__main__":
    input_path = 'E:\\video_source\\'
    output_path = 'E:\\video_clip\\'
    ffmpeg_path = 'C:\\Users\\ljj02\\Desktop\\dev\\tools\\ffmpeg-2023-08-30-git-7aa71ab5c0-essentials_build\\bin\\ffmpeg.exe'  # ffmpeg 실행 파일 경로

    clip_maker = ClipMaker(input_path, output_path, ffmpeg_path)
    clip_maker.make_clips()

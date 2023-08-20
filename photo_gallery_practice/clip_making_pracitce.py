import cv2
import os

class ClipMaker:
    def __init__(self, input_path, output_path):
        self.input_path = input_path
        self.output_path = output_path

    def make_clips(self):
        # 입력 폴더에서 동영상 파일 목록을 가져옴
        video_files = [f for f in os.listdir(self.input_path) if f.endswith('.mp4')]

        for video_file in video_files:
            input_video_path = os.path.join(self.input_path, video_file)
            output_video_path = os.path.join(self.output_path, video_file)

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

            # 클립을 저장할 비디오 라이터 생성
            fourcc = cv2.VideoWriter_fourcc(*'mp4v')
            out = cv2.VideoWriter(output_path, fourcc, frame_rate, (preview_clips[0].shape[1], preview_clips[0].shape[0]), isColor=True)

            # 프리뷰 클립을 비디오 파일에 쓰기
            for frame in preview_clips:
                out.write(frame)

            # 비디오 라이터 해제
            out.release()

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

    clip_maker = ClipMaker(input_path, output_path)
    clip_maker.make_clips()

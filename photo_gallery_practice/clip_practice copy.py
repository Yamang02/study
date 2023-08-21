import cv2
import numpy as np

# 동영상 파일 경로
video_path = 'E:\\video_source\\1792546.mp4'

# 비디오 캡처 객체 생성
cap = cv2.VideoCapture(video_path)

# 비디오의 프레임 레이트 얻기
frame_rate = int(cap.get(cv2.CAP_PROP_FPS))

# 비디오의 총 프레임 수 얻기
total_frames = int(cap.get(cv2.CAP_PROP_FRAME_COUNT))

# 클립 길이 (15초)
clip_length = 15 * frame_rate

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

# 모든 클립을 하나의 창에서 연속해서 보여줌
cv2.namedWindow('Preview', cv2.WINDOW_NORMAL)
cv2.resizeWindow('Preview', 1280, 720)

for frame in preview_clips:
    cv2.imshow('Preview', frame)
    if cv2.waitKey(25) & 0xFF == ord('q'):
        break

# 모든 창 닫기
cv2.destroyAllWindows()

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

# 클립 길이 (20초)
clip_length = 20 * frame_rate

# 프리뷰 클립을 저장할 리스트
preview_clips = []

# 동영상을 10개의 클립으로 나누고 각 클립에서 시작 부분에서 2초를 1.5배속으로 보여줌
for i in range(10):
    start_frame = i * (total_frames // 10)
    end_frame = start_frame + clip_length
    
    cap.set(cv2.CAP_PROP_POS_FRAMES, start_frame)
    
    clip_frames = []
    for j in range(clip_length):
        ret, frame = cap.read()
        if not ret:
            break
        clip_frames.append(frame)
    
    # 1.5배속으로 재생
    clip_frames = [clip_frames[j] for j in range(0, len(clip_frames), 2)]
    
    preview_clips.append(np.array(clip_frames))

# 비디오 캡처 객체 해제
cap.release()

# 프리뷰 클립을 순회하면서 보여줌
for i, clip in enumerate(preview_clips):
    for frame in clip:
        cv2.imshow(f'Preview Clip {i+1}', frame)
        if cv2.waitKey(25) & 0xFF == ord('q'):
            break

# 모든 창 닫기
cv2.destroyAllWindows()

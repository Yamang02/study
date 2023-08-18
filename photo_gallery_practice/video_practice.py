import os
import tkinter as tk
from tkinter import ttk
from tkinter import filedialog
import cv2
from PIL import Image, ImageTk

class VideoPlayerApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Video Player App")
        
        self.video_paths = []  # 동영상 파일 경로 리스트를 저장할 변수
        self.current_video_index = 0  # 현재 보여지는 동영상의 인덱스
        self.part_duration = 3  # 각 파트의 재생 길이 (초)
        
        self.frame = ttk.Frame(root)
        self.frame.pack(padx=10, pady=10)
        
        self.canvas = tk.Canvas(self.frame)
        self.canvas.pack()
        
        self.prev_video_button = ttk.Button(self.frame, text="Previous Video", command=self.show_previous_video)
        self.prev_video_button.pack(side="left")
        
        self.play_pause_button = ttk.Button(self.frame, text="Play", command=self.toggle_play_pause)
        self.play_pause_button.pack(side="left")
        
        self.next_video_button = ttk.Button(self.frame, text="Next Video", command=self.show_next_video)
        self.next_video_button.pack(side="right")
        
        self.load_button = ttk.Button(self.frame, text="Load Videos", command=self.load_videos)
        self.load_button.pack()
        
        self.playing = False  # 동영상 재생 중 여부
        self.capture = None  # cv2.VideoCapture 객체
        self.start_frame = 0  # 현재 파트의 시작 프레임
        self.end_frame = 0  # 현재 파트의 마지막 프레임
        
    def load_videos(self):
        """동영상 파일들을 선택하고 동영상 파일 경로를 저장"""
        folder_path = filedialog.askdirectory(title="Select Folder")
        if folder_path:
            self.video_paths = self.get_video_paths(folder_path)
            self.current_video_index = 0
            self.load_video()
            
    def get_video_paths(self, folder_path):
        """주어진 폴더 경로에서 모든 동영상 파일 경로를 탐색하여 리스트 반환"""
        video_paths = []
        for root_folder, _, filenames in os.walk(folder_path):
            for filename in filenames:
                if filename.lower().endswith(('.mp4', '.avi', '.mkv', '.mov')):
                    video_paths.append(os.path.join(root_folder, filename))
        return video_paths
            
    def load_video(self):
        """현재 인덱스에 해당하는 동영상을 로드하여 준비"""
        if self.video_paths:
            video_path = self.video_paths[self.current_video_index]
            self.release_capture()  # 이전 동영상의 cv2.VideoCapture 객체 해제
            self.capture = cv2.VideoCapture(video_path)
            self.playing = False
            self.play_pause_button.config(text="Play")
            self.load_part()
            
    def load_part(self):
        """현재 파트의 시작 프레임과 마지막 프레임 설정"""
        if self.capture:
            frame_rate = int(self.capture.get(cv2.CAP_PROP_FPS))
            frame_count = int(self.capture.get(cv2.CAP_PROP_FRAME_COUNT))
            part_frames = int(frame_rate * self.part_duration)
            
            if self.start_frame + part_frames <= frame_count:
                self.end_frame = self.start_frame + part_frames
            else:
                self.end_frame = frame_count
            
    def show_frame(self):
        """cv2.VideoCapture에서 프레임을 가져와 화면에 표시"""
        if self.capture and not self.playing:
            ret, frame = self.capture.read()
            if ret and self.start_frame <= self.end_frame:
                frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
                image = Image.fromarray(frame)
                photo = ImageTk.PhotoImage(image=image)
                self.canvas.create_image(0, 0, anchor="nw", image=photo)
                self.canvas.photo = photo  # Keep a reference to prevent photo from being garbage collected
                self.root.after(10, self.show_frame)
            else:
                self.load_part()
                self.start_frame = self.end_frame if self.end_frame < self.start_frame else self.start_frame
                self.show_frame()
                
    def release_capture(self):
        """cv2.VideoCapture 객체 해제"""
        if self.capture:
            self.capture.release()
            self.capture = None
            
    def toggle_play_pause(self):
        """동영상 재생/일시정지 토글"""
        if self.playing:
            self.playing = False
            self.play_pause_button.config(text="Play")
        else:
            self.playing = True
            self.play_pause_button.config(text="Pause")
            self.play_part()
            
    def play_part(self):
        """동영상 파트 재생"""
        if self.capture and self.playing and self.start_frame < self.end_frame:
            ret, frame = self.capture.read()
            if ret:
                frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
                image = Image.fromarray(frame)
                photo = ImageTk.PhotoImage(image=image)
                self.canvas.create_image(0, 0, anchor="nw", image=photo)
                self.canvas.photo = photo  # Keep a reference to prevent photo from being garbage collected
                self.start_frame += 1
                self.root.after(int(1000 / self.capture.get(cv2.CAP_PROP_FPS)), self.play_part)
            else:
                self.load_part()
                self.start_frame = self.end_frame if self.end_frame < self.start_frame else self.start_frame
                self.play_part()
            
    def show_previous_video(self):
        """이전 동영상으로 전환"""
        if self.video_paths:
            self.current_video_index = (self.current_video_index - 1) % len(self.video_paths)
            self.load_video()
            
    def show_next_video(self):
        """다음 동영상으로 전환"""
        if self.video_paths:
            self.current_video_index = (self.current_video_index + 1) % len(self.video_paths)
            self.load_video()

if __name__ == "__main__":
    root = tk.Tk()
    app = VideoPlayerApp(root)
    root.mainloop()

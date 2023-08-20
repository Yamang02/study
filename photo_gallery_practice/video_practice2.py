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
        self.current_video_index = None  # 현재 보여지는 동영상의 인덱스
        self.page_size = 20  # 페이지 당 보여줄 동영상 개수
        self.current_page = 0  # 현재 페이지
        
        self.frame = ttk.Frame(root)
        self.frame.pack(padx=10, pady=10)
        
        self.thumbnail_canvas = tk.Canvas(self.frame)
        self.thumbnail_canvas.pack()
        
        self.clip_canvas = tk.Canvas(self.frame)
        self.clip_canvas.pack()
        
        self.prev_page_button = ttk.Button(self.frame, text="Previous Page", command=self.show_previous_page)
        self.prev_page_button.pack(side="left")
        
        self.next_page_button = ttk.Button(self.frame, text="Next Page", command=self.show_next_page)
        self.next_page_button.pack(side="right")
        
        self.load_button = ttk.Button(self.frame, text="Load Videos", command=self.load_videos)
        self.load_button.pack()
        
        self.clips = []  # 동영상 클립들의 cv2.VideoCapture 객체 리스트
        self.clip_index = 0  # 현재 보여지는 클립의 인덱스
        self.playing_clip = False  # 클립 재생 여부
        
    def load_videos(self):
        """동영상 파일들을 선택하고 동영상 파일 경로를 저장"""
        folder_path = filedialog.askdirectory(title="Select Folder")
        if folder_path:
            self.video_paths = self.get_video_paths(folder_path)
            self.current_video_index = None
            self.current_page = 0
            self.load_thumbnail_grid()
            
    def get_video_paths(self, folder_path):
        """주어진 폴더 경로에서 모든 동영상 파일 경로를 탐색하여 리스트 반환"""
        video_paths = []
        for root_folder, _, filenames in os.walk(folder_path):
            for filename in filenames:
                if filename.lower().endswith(('.mp4', '.avi', '.mkv', '.mov')):
                    video_paths.append(os.path.join(root_folder, filename))
        return video_paths
            
    def load_thumbnail_grid(self):
        """썸네일 그리드 표시"""
        self.clear_thumbnail_grid()
        
        start_index = self.current_page * self.page_size
        end_index = min(start_index + self.page_size, len(self.video_paths))
        
        for i in range(start_index, end_index):
            thumbnail_frame = ttk.Frame(self.thumbnail_canvas)
            thumbnail_frame.grid(row=(i - start_index) // 4, column=(i - start_index) % 4, padx=5, pady=5)
            thumbnail_button = ttk.Button(thumbnail_frame, text="Video {}".format(i+1), command=lambda index=i: self.load_video_and_clips(index))
            thumbnail_button.pack()
            
    def clear_thumbnail_grid(self):
        """썸네일 그리드 비우기"""
        for widget in self.thumbnail_canvas.winfo_children():
            widget.destroy()
            
    def load_video_and_clips(self, index):
        """선택한 동영상과 클립들을 로드"""
        self.current_video_index = index
        self.clips = self.get_video_clips(self.video_paths[index])
        self.clip_index = 0
        self.load_clip()
        
    def get_video_clips(self, video_path):
        """동영상을 클립들로 분할하여 cv2.VideoCapture 객체들의 리스트로 반환"""
        clips = []
        capture = cv2.VideoCapture(video_path)
        frame_rate = int(capture.get(cv2.CAP_PROP_FPS))
        frame_count = int(capture.get(cv2.CAP_PROP_FRAME_COUNT))
        clip_duration = 2
        clip_frames = int(frame_rate * clip_duration)
        
        for i in range(0, frame_count, clip_frames):
            clips.append((video_path, i))
            
        return clips
            
    def load_clip(self):
        """선택한 클립 로드"""
        if self.clips:
            self.release_clip()
            self.clip_index = self.clip_index % len(self.clips)
            self.playing_clip = False
            self.load_clip_frames()
        
    def load_clip_frames(self):
        """클립의 프레임들 로드"""
        if self.clips and not self.playing_clip:
            clip_info = self.clips[self.clip_index]
            video_path, start_frame = clip_info
            clip = cv2.VideoCapture(video_path)
            clip.set(cv2.CAP_PROP_POS_FRAMES, start_frame)
            
            ret, frame = clip.read()
            if ret:
                frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
                image = Image.fromarray(frame)
                photo = ImageTk.PhotoImage(image=image)
                self.clip_canvas.create_image(0, 0, anchor="nw", image=photo)
                self.clip_canvas.photo = photo  # Keep a reference to prevent photo from being garbage collected
                self.root.after(10, self.load_clip_frames)
            else:
                self.release_clip()
            
    def release_clip(self):
        """클립의 cv2.VideoCapture 객체 해제"""
        if self.clips:
            clip_info = self.clips[self.clip_index]
            clip = cv2.VideoCapture(clip_info[0])
            clip.release()
            
    def toggle_play_clip(self):
        """클립 재생/일시정지 토글"""
        if self.clips:
            self.playing_clip = not self.playing_clip
            if self.playing_clip:
                self.play_clip()
        
    def play_clip(self):
        """클립 재생"""
        if self.clips and self.playing_clip:
            clip_info = self.clips[self.clip_index]
            clip = cv2.VideoCapture(clip_info[0])
            clip.set(cv2.CAP_PROP_POS_FRAMES, clip_info[1])
            
            ret, frame = clip.read()
            if ret:
                frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
                image = Image.fromarray(frame)
                photo = ImageTk.PhotoImage(image=image)
                self.clip_canvas.create_image(0, 0, anchor="nw", image=photo)
                self.clip_canvas.photo = photo  # Keep a reference to prevent photo from being garbage collected
                self.root.after(int(1000 / clip.get(cv2.CAP_PROP_FPS)), self.play_clip)
            else:
                self.load_next_clip()
                
    def load_next_clip(self):
        """다음 클립 로드"""
        if self.clips:
            self.clip_index = (self.clip_index + 1) % len(self.clips)
            self.load_clip_frames()
        
    def show_previous_page(self):
        """이전 페이지로 전환"""
        if self.current_page > 0:
            self.current_page -= 1
            self.load_thumbnail_grid()
            
    def show_next_page(self):
        """다음 페이지로 전환"""
        total_pages = len(self.video_paths) // self.page_size
        if len(self.video_paths) % self.page_size != 0:
            total_pages += 1
        if self.current_page < total_pages - 1:
            self.current_page += 1
            self.load_thumbnail_grid()

if __name__ == "__main__":
    root = tk.Tk()
    app = VideoPlayerApp(root)
    root.mainloop()

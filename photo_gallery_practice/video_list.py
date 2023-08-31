import os
import glob
import csv

directory = "E:\\video_source"  # 동영상 파일이 있는 디렉토리 경로로 변경하세요.
video_files = glob.glob(os.path.join(directory, "*.mp4"))

with open("video_list.csv", "w", newline="") as csvfile:
    csvwriter = csv.writer(csvfile)
    csvwriter.writerow(["동영상 파일명"])
    for video_file in video_files:
        csvwriter.writerow([os.path.basename(video_file)])

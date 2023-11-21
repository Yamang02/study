import os
import glob
import csv

base_directory = "C:\\Users\\dit223501\\Desktop\\git\\gitlab_dit-cybershop\\cs_supervisor\\"
directory = "04_notice"
  # asp 파일이 있는 디렉토리 경로 변경.

asp_files = glob.glob(os.path.join(base_directory + directory, "*.asp"))
file_name = directory + "_asp_list.csv"

with open(file_name, "w", newline="") as csvfile:
    csvwriter = csv.writer(csvfile)
    csvwriter.writerow(["ASP 파일명"])
    for asp_file in asp_files:
        csvwriter.writerow([os.path.basename(asp_file)])


# script for filling csv-file with uib exam-dates
import csv

with open("uib_exams.csv", mode="w") as exam_file:
    fieldnames = ['Exam part', 'Year/Sem', 'Date and time', 'Duration', 'Location']
    writer = csv.DictWriter(exam_file, fieldnames=fieldnames)
    writer.writeheader()
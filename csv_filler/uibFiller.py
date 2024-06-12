# script for filling csv-file with uib exam-dates
import csv

with open("uib_exams.csv", mode="w") as exam_file:
    fieldnames = ["Subject Code", "Exam part", "Year/Sem", "Date and time", "Duration", "Location"]
    writer = csv.DictWriter(exam_file, fieldnames=fieldnames)
    writer.writeheader()
    writer.writerow({"Subject Code": "INF112", "Exam part": "Written exam",
                    "Year/Sem": "24H" , "Date and time": "25.05.2023 15:00",
                    "Duration": "5 hours", "Location": "Solheimsgaten"})


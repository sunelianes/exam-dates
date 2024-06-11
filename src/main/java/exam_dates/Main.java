package exam_dates;

import exam_dates.finders.ExamDateFinder;
import exam_dates.finders.IExamDateFinder;
import exam_dates.finders.NtnuExamDateFinder;

public class Main {
    public static void main(String[] args) {
        IExamDateFinder finder = ExamDateFinder.newFinder();
        System.out.println("Title: " + finder.getTitle());
        System.out.println("Exam Date: " + finder.getExamDate());
    }
}
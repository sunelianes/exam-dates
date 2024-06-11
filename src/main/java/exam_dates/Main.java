package exam_dates;

import exam_dates.finders.FinderFactory;
import exam_dates.finders.IExamDateFinder;

public class Main {
    public static void main(String[] args) {
        IExamDateFinder finder = FinderFactory.newFinder();
        System.out.println("Title: " + finder.getTitle());
        System.out.println("Exam Date: " + finder.getExamDate());
    }
}
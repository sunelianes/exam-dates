package exam_dates.finders;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Scanner;

public abstract class ExamDateFinder implements IExamDateFinder {
    private final Scanner scanner = new Scanner(System.in);

    String getYear() {
        System.out.println("Enter year: ");
        return scanner.nextLine();
    }

    String getSemester() {
        System.out.println("Enter semester (V or H): ");
        return scanner.nextLine();
    }

    String getSubjectCode() {
        System.out.println("Enter subject code: ");
        return scanner.nextLine();
    }

    Document connect(String url) {
        try {return Jsoup.connect(url).get();}
        catch (Exception e) {
            System.out.println("Invalid URL: " + url);
            return null;
        }
    }

}

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

    // refactor out ? probably yes, due to static method in non static contexts
    public static IExamDateFinder newFinder() {
        System.out.println("Enter school ID: ");
        String schoolID = new Scanner(System.in).nextLine();

        return switch(schoolID) {
            case "UIB" -> new UibExamDateFinder();
            case "NTNU" -> new NtnuExamDateFinder();
            default -> throw new IllegalArgumentException("Invalid school ID: " + schoolID);
        };
    }

}

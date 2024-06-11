package exam_dates.finders;

import java.util.Scanner;

public class FinderFactory {
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

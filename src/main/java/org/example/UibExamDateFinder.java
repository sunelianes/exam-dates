package org.example;

import java.util.Scanner;

public class UibExamDateFinder implements IExamDateFinder {
    @Override
    public String findExamDate(String url) {
        return "";
    }

    @Override
    public String getSubjectCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject code: ");
        return scanner.nextLine();
    }
}

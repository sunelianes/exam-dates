package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Scanner;

public abstract class ExamDateFinder implements IExamDateFinder {
    String getSubjectCode() {
        Scanner scanner = new Scanner(System.in);
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

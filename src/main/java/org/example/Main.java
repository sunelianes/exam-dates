package org.example;

public class Main {
    public static void main(String[] args) {
        IExamDateFinder finder = new UibExamDateFinder();
        System.out.println("Title: " + finder.getTitle());
        System.out.println("Exam Date: " + finder.findExamDate());
    }
}
package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IExamDateFinder finder = new UibExamDateFinder();
        System.out.println("Title: " + finder.getTitle());
        System.out.println("Exam Date: " + finder.findExamDate());
    }
}
package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public interface IExamDateFinder {
    String findExamDate();
    String getSubjectCode();
    Document connect(String url);
    String getTitle(Document document);
    Element getExamElem(Document document);
}

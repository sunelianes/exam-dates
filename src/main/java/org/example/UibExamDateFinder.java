package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class UibExamDateFinder extends ExamDateFinder {
    private final String baseURL = "https://www4.uib.no/en/courses/";
    private final Document doc;

    public UibExamDateFinder() {
        String url = baseURL + getSubjectCode();
        this.doc = connect(url);
    }

    @Override
    public String findExamDate() {
        return getExamElem().text();
    }


    @Override
    public String getTitle() {
        return doc.title();
    }

    @Override
    public Element getExamElem() {
        try {
            return doc.select("dt:contains(Date)").first().nextElementSibling();
        }
        catch (NullPointerException exception) {
            return null;
        }
    }
}

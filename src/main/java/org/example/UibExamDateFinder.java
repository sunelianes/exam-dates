package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;

public class UibExamDateFinder extends ExamDateFinder {
    private final String baseURL = "https://www4.uib.no/en/courses/";
    private final Document doc;

    public UibExamDateFinder() {
        String url = baseURL + getSubjectCode();
        this.doc = connect(url);
    }

    @Override
    public String getExamDate() {
        return findExamElem().text();
    }


    @Override
    public String getTitle() {
        return doc.title();
    }

    @Override
    public Element findExamElem() {
        try {
            return doc.select("dt:contains(Date)").first().nextElementSibling();
        }
        catch (NullPointerException exception) {
            return null;
        }
    }

    @Override
    public List<String> getExamDateList() {
        return null;
    }
}

package org.example;

import org.jsoup.nodes.Element;

import java.util.List;


public interface IExamDateFinder {
    String getExamDate();
    String getTitle();
    Element findExamElem();
    List<String> getExamDateList();
}

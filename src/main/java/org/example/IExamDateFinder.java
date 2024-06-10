package org.example;

import org.jsoup.nodes.Element;


public interface IExamDateFinder {
    String getExamDate();
    String getTitle();
    Element findExamElem();
}

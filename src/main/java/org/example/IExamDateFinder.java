package org.example;

import org.jsoup.nodes.Element;


public interface IExamDateFinder {
    String findExamDate();
    String getTitle();
    Element getExamElem();
}

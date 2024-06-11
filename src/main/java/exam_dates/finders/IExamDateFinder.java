package exam_dates.finders;

import org.jsoup.nodes.Element;

public interface IExamDateFinder {
    String getExamDate();
    String getTitle();
    Element findExamElem();
}

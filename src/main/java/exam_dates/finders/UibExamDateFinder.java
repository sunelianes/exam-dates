package exam_dates.finders;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class UibExamDateFinder extends ExamDateFinder {
    private final String baseURL = "https://www4.uib.no/en/courses/";
    private final Document doc;

    UibExamDateFinder() {
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
            return new Element("No date found");
        }
    }
}

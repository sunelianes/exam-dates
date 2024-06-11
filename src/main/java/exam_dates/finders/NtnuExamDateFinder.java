package exam_dates.finders;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NtnuExamDateFinder extends ExamDateFinder {
    private final String baseURL = "https://www.ntnu.no/studier/emner/";
    private final String endOfURL = "#tab=omEksamen";
    private final Document doc;

    NtnuExamDateFinder() {
        String url = baseURL + getSubjectCode() + endOfURL;
        this.doc = connect(url);
    }

    @Override
    public String getExamDate() {
        String examDate = findExamElem().text();
        return examDate.isEmpty() ? "No Exam Date Found" : examDate;
    }

    @Override
    public String getTitle() {
        return doc.title();
    }

    @Override
    public Element findExamElem() {
        try {
            return doc.select("span.exam-date").first();
        }
        catch (NullPointerException e) {
            System.out.println("error");
            return new Element("No exam date found");
        }
    }
}

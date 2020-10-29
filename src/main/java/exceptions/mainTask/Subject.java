package exceptions.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String subject;
    private List<Mark> mark = new ArrayList<>();

    public Subject(String subject, List<Mark> mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Mark> getMark() {
        return mark;
    }

    public void setMark(List<Mark> mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }
}

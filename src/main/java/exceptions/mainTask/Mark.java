package exceptions.mainTask;

public class Mark extends StudySubject {

    private int markOnTheSubject;

    public Mark() {
    }

    public Mark(int markOnTheSubject) {
        this.markOnTheSubject = markOnTheSubject;
        if (markOnTheSubject < 0 || markOnTheSubject > 10) {
            throw new IllegalArgumentException("Mark need to be from 0 to 10");
        }
    }

    public int getMarkOnTheSubject() {
        return markOnTheSubject;
    }

    public void setMarkOnTheSubject(int markOnTheSubject) {
        this.markOnTheSubject = markOnTheSubject;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mark{");
        sb.append("markOnTheSubject=").append(markOnTheSubject);
        sb.append('}');
        return sb.toString();
    }
}
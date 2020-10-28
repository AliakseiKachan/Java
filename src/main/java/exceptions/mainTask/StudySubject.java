package exceptions.mainTask;

public class StudySubject extends Student {

    private String nameOfStudySubject;

    public StudySubject() {
    }

    public StudySubject(String nameOfStudySubject) {
        this.nameOfStudySubject = nameOfStudySubject;
    }

    public String getNameOfStudySubject() {
        return nameOfStudySubject;
    }

    public void setNameOfStudySubject(String nameOfStudySubject) {
        this.nameOfStudySubject = nameOfStudySubject;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudySubject{");
        sb.append("nameOfStudySubject='").append(nameOfStudySubject).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
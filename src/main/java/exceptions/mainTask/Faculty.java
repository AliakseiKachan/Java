package exceptions.mainTask;

public class Faculty extends University {

    private String nameOfTheFaculty;

    public Faculty() {
    }

    public Faculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
    }

    public String getNameOfTheFaculty() {
        return nameOfTheFaculty;
    }

    public void setNameOfTheFaculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Faculty{");
        sb.append("nameOfTheFaculty='").append(nameOfTheFaculty).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
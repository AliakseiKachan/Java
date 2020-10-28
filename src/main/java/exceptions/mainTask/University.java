package exceptions.mainTask;

public class University {

    private String nameOfTheUniversity;

    public University() {
    }

    public University(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("University{");
        sb.append("nameOfTheUniversity='").append(nameOfTheUniversity).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
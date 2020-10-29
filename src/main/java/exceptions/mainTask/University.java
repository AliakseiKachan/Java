package exceptions.mainTask;

import java.util.List;

public class University {

    private String nameOfTheUniversity;
    private List<Faculty> facultiesList;

    public University(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public List<Faculty> getFacultiesList() {
        return facultiesList;
    }

    public void setFacultiesList(List<Faculty> facultiesList) {
        this.facultiesList = facultiesList;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfTheUniversity='" + nameOfTheUniversity + '\'' +
                '}';
    }
}
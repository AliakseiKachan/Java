package exceptions.mainTask.bean;

import exceptions.mainTask.customExceptions.EmptyListException;
import java.util.ArrayList;
import java.util.List;

public class University {

    private String nameOfTheUniversity;
    private List<Faculty> facultiesList = new ArrayList<>();

    public University(String nameOfTheUniversity, List<Faculty> facultiesList) throws EmptyListException {
        this.nameOfTheUniversity = nameOfTheUniversity;
        this.facultiesList = facultiesList;

        if(facultiesList.isEmpty()) {
            throw new EmptyListException("University need to include at least one faculty, "
                    + "size of faculty list: " + facultiesList.size());
        }
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
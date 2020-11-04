package exceptions.mainTask.bean;

import exceptions.mainTask.enums.UniversityName;
import java.util.List;

public class University {

    private UniversityName universityName;
    private List<Faculty> facultiesList;

    public University(UniversityName universityName, List<Faculty> facultiesList) {
        this.universityName = universityName;
        this.facultiesList = facultiesList;
    }

    public UniversityName getUniversityName() {
        return universityName;
    }

    public void setUniversityName(UniversityName universityName) {
        this.universityName = universityName;
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
                "universityName=" + universityName +
                ", facultiesList=" + facultiesList +
                '}';
    }
}
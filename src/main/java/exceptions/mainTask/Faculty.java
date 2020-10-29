package exceptions.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String nameOfTheFaculty;
    private List<Group> groupsList = new ArrayList<>();

    public Faculty(String nameOfTheFaculty, List<Group> groupsList) {
        this.nameOfTheFaculty = nameOfTheFaculty;
        this.groupsList = groupsList;
    }

    public String getNameOfTheFaculty() {
        return nameOfTheFaculty;
    }

    public void setNameOfTheFaculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
    }

    public List<Group> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Group> groupsList) {
        this.groupsList = groupsList;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "nameOfTheFaculty='" + nameOfTheFaculty + '\'' +
                ", groupsList=" + groupsList +
                '}';
    }
}
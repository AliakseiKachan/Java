package exceptions.mainTask;

import java.util.List;

public class Faculty {

    private String nameOfTheFaculty;
    private List<Group> groupsList;

    public Faculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
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
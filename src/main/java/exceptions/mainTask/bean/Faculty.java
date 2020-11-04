package exceptions.mainTask.bean;

import exceptions.mainTask.enums.FacultyName;
import java.util.List;

public class Faculty {

    private FacultyName facultyName;
    private List<Group> groupsList;

    public Faculty(FacultyName facultyName, List<Group> groupsList) {
        this.facultyName = facultyName;
        this.groupsList = groupsList;
    }

    public FacultyName getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(FacultyName facultyName) {
        this.facultyName = facultyName;
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
                "facultyName=" + facultyName +
                ", groupsList=" + groupsList +
                '}';
    }
}
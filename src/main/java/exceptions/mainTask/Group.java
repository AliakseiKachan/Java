package exceptions.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int groupNumber;
    private List<Student> studentsList = new ArrayList<>();

    public Group(int groupNumber, List<Student> studentsList) {
        this.groupNumber = groupNumber;
        this.studentsList = studentsList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", studentsList=" + studentsList +
                '}';
    }
}
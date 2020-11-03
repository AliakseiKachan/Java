package exceptions.mainTask.bean;

import exceptions.mainTask.customExceptions.EmptyListException;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private int groupNumber;
    private List<Student> studentsList = new ArrayList<>();

    public Group(int groupNumber, List<Student> studentsList) throws EmptyListException {
        this.groupNumber = groupNumber;
        this.studentsList = studentsList;

        if(studentsList.isEmpty()) {
            throw new EmptyListException("Group need to include at least one student, "
                    + "size of student list: " + studentsList.size());
        }
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
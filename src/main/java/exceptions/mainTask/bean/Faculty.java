package exceptions.mainTask.bean;

import exceptions.mainTask.customExceptions.EmptyListException;
import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String nameOfTheFaculty;
    private List<Group> groupsList = new ArrayList<>();

    public Faculty(String nameOfTheFaculty, List<Group> groupsList) throws EmptyListException {
        this.nameOfTheFaculty = nameOfTheFaculty;
        this.groupsList = groupsList;

        if(groupsList.isEmpty()) {
            throw new EmptyListException("Faculties need to include at least one group, "
                    + "size of group list: " + groupsList.size());
        }
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
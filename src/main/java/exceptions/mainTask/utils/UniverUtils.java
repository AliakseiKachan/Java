package exceptions.mainTask.utils;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniverUtils {

    public double getAverageMarkOfOneStudent(List<Student> studentListGroupNumber) {

        List<Double> doubleList = new ArrayList<>(studentListGroupNumber.get(0).getSubjectAndMark().values());

        double sum = 0;

        for (int i = 0; i < doubleList.size(); i++) {
            sum += doubleList.get(i);
        }

        return sum / doubleList.size();
    }

    public double getAverageMarkForSpecificSubjectInSpecificGroupAndAtSpecificFaculty(List<Faculty> facultyList) {

        double sum = 0;

        for (int i = 0; i < facultyList.get(0).getGroupsList().get(0).getStudentsList().size(); i++) {
            sum += facultyList.get(0).getGroupsList().get(0).getStudentsList().get(i)
                    .getSubjectAndMark().get("Computer Science");
        }

        return sum / facultyList.get(0).getGroupsList().get(0).getStudentsList().size();
    }

    public double getAverageMarkForOneSubjectForEntireUniversity(List<University> universityList) {

        double sum = 0;
        int quantityOfMarks = 0;

        int facultyMaxIndex = universityList.get(0).getFacultiesList().size() - 1;
        int groupMaxIndex = universityList.get(0)
                .getFacultiesList().get(facultyMaxIndex).getGroupsList().size() - 1;
        int studentsMaxIndex = universityList.get(0)
                .getFacultiesList().get(facultyMaxIndex).getGroupsList().get(groupMaxIndex)
                .getStudentsList().size() - 1;

        try {

            while (facultyMaxIndex >= 0) {

                if (studentsMaxIndex >= 0) {

                    sum += universityList.get(0).getFacultiesList().get(facultyMaxIndex).getGroupsList()
                            .get(groupMaxIndex).getStudentsList().get(studentsMaxIndex).getSubjectAndMark()
                            .get("Physics");
                    quantityOfMarks++;
                    studentsMaxIndex--;

                    if (studentsMaxIndex < 0 && groupMaxIndex >= 0) {

                        studentsMaxIndex = universityList.get(0)
                                .getFacultiesList().get(facultyMaxIndex).getGroupsList().get(groupMaxIndex)
                                .getStudentsList().size() - 1;
                        groupMaxIndex--;

                        if (groupMaxIndex < 0 && facultyMaxIndex >= 0) {

                            groupMaxIndex = universityList.get(0)
                                    .getFacultiesList().get(facultyMaxIndex).getGroupsList().size() - 1;
                            facultyMaxIndex--;
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {

        }

        return sum / quantityOfMarks;
    }

    public void checkMarksAreInRangeFromZeroToTen(HashMap<String, Double> stringDoubleHashMap) {

        List<Double> doubleList = new ArrayList<>(stringDoubleHashMap.values());

        for (int i = 0; i < doubleList.size(); i++) {

            if(doubleList.get(i) < 0 || doubleList.get(i) > 10) {

                throw new IllegalArgumentException("Mark may be from 0 to 10 only, this mark is incorrect: "
                        + doubleList.get(i));
            }
        }
    }

    public void checkHasStudentAtLeastOneSubject(HashMap<String, Double> stringDoubleHashMap) {

        if(stringDoubleHashMap.isEmpty()) {

            throw new IllegalArgumentException("Student need to have at least one subject, "
                    + "count of subjects: " + stringDoubleHashMap.size());
        }
    }

    public void checkHasAtLeastOneStudentInGroup(List<Student> studentList) {

        if(studentList.isEmpty()) {

            throw new IllegalArgumentException("Group need to include at least one student, "
                    + "size of student list: " + studentList.size());
        }
    }

    public void checkHasAtLeastOneGroupInTheFaculty(List<Group> groupList) {

        if(groupList.isEmpty()) {

            throw new IllegalArgumentException("Faculties need to include at least one group, "
                    + "size of group list: " + groupList.size());
        }
    }

    public void checkHasAtLeastOneFacultyInUniversity(List<Faculty> facultyList) {

        if(facultyList.isEmpty()) {

            throw new IllegalArgumentException("University need to include at least one faculty, "
                    + "size of faculty list: " + facultyList.size());
        }
    }
}
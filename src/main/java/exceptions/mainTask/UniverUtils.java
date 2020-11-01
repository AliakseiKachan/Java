package exceptions.mainTask;

import java.util.ArrayList;
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
}
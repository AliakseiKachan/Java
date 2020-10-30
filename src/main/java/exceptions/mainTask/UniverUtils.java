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
            sum += facultyList.get(0).getGroupsList().get(0).getStudentsList().get(i).getSubjectAndMark().get("Computer Science");
        }

        return sum / facultyList.get(0).getGroupsList().get(0).getStudentsList().size();
    }

    public double getAverageMarkForOneSubjectForEntireUniversity(List<University> universityList) {

        double sum = 0;

        int facultyMaxIndex = universityList.get(0).getFacultiesList().size() - 1;
        int groupMaxIndex = universityList.get(0)
                .getFacultiesList().get(facultyMaxIndex).getGroupsList().size() - 1;
        int studentsMaxIndex = universityList.get(0)
                .getFacultiesList().get(facultyMaxIndex).getGroupsList().get(groupMaxIndex).getStudentsList().size() - 1;

        int facultySize = universityList.get(0).getFacultiesList().size();
        int groupSize = universityList.get(0)
                .getFacultiesList().get(facultyMaxIndex).getGroupsList().size();
        int studentsSize = universityList.get(0)
                .getFacultiesList().get(facultyMaxIndex).getGroupsList().get(groupMaxIndex).getStudentsList().size();

        while (facultySize != 0) {

            sum += universityList.get(0).getFacultiesList().get(facultyMaxIndex).getGroupsList().get(groupMaxIndex)
                    .getStudentsList().get(studentsMaxIndex).getSubjectAndMark().get("Mathematics");

            if(studentsSize > 0) {
                System.out.println("stud on start " + studentsSize + "\n");
                studentsSize--;
                System.out.println("stud on finish " + studentsSize + "\n");
            } else if(studentsSize == 0 && groupSize > 0) {
                System.out.println("group on start " + groupSize + "\n");
                groupSize--;
                System.out.println("group on finish " + groupSize + "\n");
                studentsSize = universityList.get(0)
                        .getFacultiesList().get(facultyMaxIndex).getGroupsList().get(groupMaxIndex-1).getStudentsList().size();
            } else {
                System.out.println("fac on start " + facultySize + "\n");
                facultySize--;
                System.out.println("fac on finish " + facultySize + "\n");
            }
        }
        return sum;
    }
}
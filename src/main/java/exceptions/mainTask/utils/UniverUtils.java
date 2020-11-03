package exceptions.mainTask.utils;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import exceptions.mainTask.enums.Subject;
import java.util.ArrayList;
import java.util.List;

public class UniverUtils {

    public double getAverageMarkOfOneStudent(Student student) {

        List<Double> doubleList = new ArrayList<>(student.getSubjectAndMark().values());

        double sum = 0;

        for (int i = 0; i < doubleList.size(); i++) {
            sum += doubleList.get(i);
        }

        System.out.print("Average mark of all subjects of " + student.getFirstName() + " "
                + student.getLastName() + " is: ");

        return Math.ceil(sum / doubleList.size() * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public double getAverageMarkForSpecificSubjectInSpecificGroupAndAtSpecificFaculty(Faculty faculty, Group group,
                                                                                                     Subject subject) {

        double sum = 0;

        for (int i = 0; i < group.getStudentsList().size(); i++) {
            sum += group.getStudentsList().get(i).getSubjectAndMark().get(subject.toString());
        }

        System.out.print("Average mark for " + subject.toString() + " in group number " + group.getGroupNumber()
                + " at the " + faculty.getNameOfTheFaculty() + " is: ");

        return Math.ceil(sum / group.getStudentsList().size() * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public double getAverageMarkForOneSubjectForEntireUniversity(University university, Subject subject) {

        double sum = 0;
        int counter = 0;

        for (int i = 0; i < university.getFacultiesList().size(); i++) {

            for (int j = 0; j < university.getFacultiesList().get(i).getGroupsList().size(); j++) {

                for (int k = 0; k < university.getFacultiesList().get(i).getGroupsList().get(j)
                                                                    .getStudentsList().size(); k++) {
                    counter++;
                    sum += university.getFacultiesList().get(i).getGroupsList().get(j).getStudentsList().get(k)
                                                                        .getSubjectAndMark().get(subject.toString());
                }
            }
        }

        System.out.print("Average mark for " + subject.toString() + " in "
                                + university.getNameOfTheUniversity() + " is: ");

        return Math.ceil(sum / counter * Math.pow(10, 2)) / Math.pow(10, 2);
    }
}
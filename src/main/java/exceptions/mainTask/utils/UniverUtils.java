package exceptions.mainTask.utils;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import exceptions.mainTask.enums.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UniverUtils {

    public double getAverageMarkOfOneStudent(Optional<Student> student) {

        List<Double> doubleList = new ArrayList<>(student.get().getSubjectAndMark().values());

        double sum = 0;

        for (int i = 0; i < doubleList.size(); i++) {
            sum += doubleList.get(i);
        }

        System.out.print("Average mark of all subjects of " + student.get().getFirstName() + " "
                + student.get().getLastName() + " is: ");

        return getResultWithTwoDigitsAfterDot(sum / doubleList.size());
    }

    public double getAverageMarkForSpecificSubjectInSpecificGroupAndAtSpecificFaculty(Optional<Faculty> faculty, Optional<Group> group,
                                                                                      Subject subject) {

        double sum = 0;

        for (int i = 0; i < group.get().getStudentsList().size(); i++) {
            sum += group.get().getStudentsList().get(i).getSubjectAndMark().get(subject);
        }

        System.out.print("Average mark for " + subject.toString() + " in group number " + group.get().getGroupNumber()
                + " at the " + faculty.get().getFacultyName() + " is: ");

        return getResultWithTwoDigitsAfterDot(sum / group.get().getStudentsList().size());
    }

    public double getAverageMarkForOneSubjectForEntireUniversity(Optional<University> university, Subject subject) {

        double sum = 0;
        int counter = 0;

        for (int i = 0; i < university.get().getFacultiesList().size(); i++) {

            for (int j = 0; j < university.get().getFacultiesList().get(i).getGroupsList().size(); j++) {

                for (int k = 0; k < university.get().getFacultiesList().get(i).getGroupsList().get(j)
                                                                    .getStudentsList().size(); k++) {
                    counter++;
                    sum += university.get().getFacultiesList().get(i).getGroupsList().get(j).getStudentsList().get(k)
                                                                        .getSubjectAndMark().get(subject);
                }
            }
        }

        System.out.print("Average mark for " + subject.toString() + " in "
                                + university.get().getUniversityName() + " is: ");

        return getResultWithTwoDigitsAfterDot(sum / counter);
    }

    public double getResultWithTwoDigitsAfterDot(double result) {

        double resultWithTwoDigitsAfterDot = Math.ceil(result * Math.pow(10, 2)) / Math.pow(10, 2);

        return resultWithTwoDigitsAfterDot;
    }
}
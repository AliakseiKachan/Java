package exceptions.mainTask;

import exceptions.mainTask.database.Database;
import exceptions.mainTask.enums.Subject;
import exceptions.mainTask.customExceptions.EmptyListException;
import exceptions.mainTask.utils.UniverUtils;

/**
 * The university has several faculties where students study in groups.
 * Each student has several subjects in which he receives grades.
 * It is necessary to create a hierarchy of students, groups and faculties.
 *
 * Calculate average mark in all of the student's subjects.
 * Calculate average mark in a specific subject in a specific group and at a specific faculty.
 * Calculate average mark in a subject for the entire university.
 * Release the following exceptions:
 *
 * Score below 0 or above 10.
 * Lack of subjects for the student (must have at least one).
 * Lack of students in the group.
 * Lack of groups in the faculty.
 * Lack of faculties at the university.
 */

public class Main {

    public static void main(String[] args) throws EmptyListException {

        Database database = new Database();
        UniverUtils univerUtils = new UniverUtils();

        System.out.println(univerUtils.getAverageMarkOfOneStudent(database.getStudentListGroup7().get(1)));

        System.out.println(univerUtils.getAverageMarkForSpecificSubjectInSpecificGroupAndAtSpecificFaculty(database
                        .getFacultyList().get(2), database.getGroupListFaculty3().get(2), Subject.PHYSICS));

        System.out.println(univerUtils.getAverageMarkForOneSubjectForEntireUniversity(database
                                                 .getUniversityList().get(0), Subject.COMPUTER_SCIENCE));
    }
}
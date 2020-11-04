package exceptions.mainTask;

import exceptions.mainTask.database.DatabaseCreator;
import exceptions.mainTask.database.DatabaseReader;
import exceptions.mainTask.enums.FacultyName;
import exceptions.mainTask.enums.Subject;
import exceptions.mainTask.customExceptions.EmptyListException;
import exceptions.mainTask.enums.UniversityName;
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

        DatabaseCreator databaseCreator = new DatabaseCreator();
        DatabaseReader databaseReader = new DatabaseReader(databaseCreator);
        UniverUtils univerUtils = new UniverUtils();

        System.out.println(univerUtils.getAverageMarkOfOneStudent(databaseReader.getStudentByLastName("Izrailov")));

        System.out.println(univerUtils.getAverageMarkForSpecificSubjectInSpecificGroupAndAtSpecificFaculty
                (databaseReader.getFacultyByName(FacultyName.INSTRUMENTATION_FACULTY),
                        databaseReader.getGroupByNumber(8), Subject.PHYSICS));

        System.out.println(univerUtils.getAverageMarkForOneSubjectForEntireUniversity(databaseReader
                .getUniversityByName(UniversityName.BELARUSIAN_NATIONAL_TECHNICAL_UNIVERSITY),
                        Subject.COMPUTER_SCIENCE));
    }
}
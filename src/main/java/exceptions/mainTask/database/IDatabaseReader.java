package exceptions.mainTask.database;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import exceptions.mainTask.customExceptions.EmptyListException;
import exceptions.mainTask.enums.FacultyName;
import exceptions.mainTask.enums.UniversityName;
import java.util.Optional;

public interface IDatabaseReader {

    Optional<University> getUniversityByName(UniversityName universityName) throws EmptyListException;

    Optional<Faculty> getFacultyByName(FacultyName facultyName) throws EmptyListException;

    Optional<Group> getGroupByNumber(int number) throws EmptyListException;

    Optional<Student> getStudentByLastName(String lastName) throws EmptyListException;
}
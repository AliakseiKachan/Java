package exceptions.mainTask.database;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import exceptions.mainTask.customExceptions.EmptyListException;
import exceptions.mainTask.enums.FacultyName;
import exceptions.mainTask.enums.UniversityName;
import java.util.NoSuchElementException;
import java.util.Optional;

public class DatabaseReader {

    private DatabaseCreator databaseCreator;

    public DatabaseReader(DatabaseCreator databaseCreator) {
        this.databaseCreator = databaseCreator;
    }

    public Optional<University> getUniversityByName(UniversityName universityName) throws EmptyListException {

        if(databaseCreator.getUniversityList().isEmpty()) {

            throw new EmptyListException("University list is empty!");
        }

        if(databaseCreator.getUniversityByName(universityName).isPresent()) {

            return databaseCreator.getUniversityByName(universityName);

        } else throw new NoSuchElementException("University with this name not found: " + universityName);
    }

    public Optional<Faculty> getFacultyByName(FacultyName facultyName) throws EmptyListException {

        if(databaseCreator.getFacultyList().isEmpty()) {

            throw new EmptyListException("Faculty list is empty!");
        }

        if(databaseCreator.getFacultyByName(facultyName).isPresent()) {

            return databaseCreator.getFacultyByName(facultyName);

        } else throw new NoSuchElementException("Faculty with this name not found: " + facultyName);
    }

    public Optional<Group> getGroupByNumber(int number) throws EmptyListException {

        if(databaseCreator.getGroupList().isEmpty()) {

            throw new EmptyListException("Group list is empty!");
        }

        if(databaseCreator.getGroupByNumber(number).isPresent()) {

            return databaseCreator.getGroupByNumber(number);

        } else throw new NoSuchElementException("Group with this number not found: " + number);
    }

    public Optional<Student> getStudentByLastName(String lastName) throws EmptyListException {

        if(databaseCreator.getStudentsList().isEmpty()) {

            throw new EmptyListException("Students list is empty!");
        }

        if(databaseCreator.getStudentByLastName(lastName).isPresent()) {

            return databaseCreator.getStudentByLastName(lastName);

        } else throw new NoSuchElementException("Student with this last name not found: " + lastName);
    }
}
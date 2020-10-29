package exceptions.mainTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {

    public List<University> createUniversitiesList() {

        List<University> universitiesList = new ArrayList<>();
        universitiesList.add(new University("Belarusian National Technical University"));

        return universitiesList;
    }


    public List<Faculty> createFacultiesList() {

        List<Faculty> facultiesList = new ArrayList<>();
        facultiesList.add(new Faculty("Automotive Faculty"));
        facultiesList.add(new Faculty("Faculty of Mechanics and Technology"));
        facultiesList.add(new Faculty("Instrumentation Faculty"));

        return facultiesList;
    }

    public List<Group> createGroupsList() {

        List<Group> groupsList = new ArrayList<>();
        groupsList.add(new Group(1));
        groupsList.add(new Group(2));
        groupsList.add(new Group(3));

        return groupsList;
    }

    public List<Student> createStudentsList() {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Ivanov", "Ivan"));
        studentsList.add(new Student("Petrov", "Petr"));
        studentsList.add(new Student("Sidorov", "Vladimir"));

        return studentsList;
    }

    public HashMap<String, Double> createFirstStudentSubjectsAndMarksList(){

        HashMap<String, Double> firstStudentSubjectsAndMarksList = new HashMap<>();
        firstStudentSubjectsAndMarksList.put("Computer Science", 7.0);
        firstStudentSubjectsAndMarksList.put("Chemistry", 5.0);
        firstStudentSubjectsAndMarksList.put("Physics", 8.0);
        firstStudentSubjectsAndMarksList.put("Mathematics", 6.0);

        return firstStudentSubjectsAndMarksList;
    }

    public HashMap<String, Double> createSecondStudentSubjectsAndMarksList(){

        HashMap<String, Double> secondStudentSubjectsAndMarksList = new HashMap<>();
        secondStudentSubjectsAndMarksList.put("Computer Science", 4.0);
        secondStudentSubjectsAndMarksList.put("Chemistry", 6.0);
        secondStudentSubjectsAndMarksList.put("Physics", 7.0);
        secondStudentSubjectsAndMarksList.put("Mathematics", 9.0);

        return secondStudentSubjectsAndMarksList;
    }

    public HashMap<String, Double> createThirdStudentSubjectsAndMarksList(){

        HashMap<String, Double> thirdStudentSubjectsAndMarksList = new HashMap<>();
        thirdStudentSubjectsAndMarksList.put("Computer Science", 5.0);
        thirdStudentSubjectsAndMarksList.put("Chemistry", 5.0);
        thirdStudentSubjectsAndMarksList.put("Physics", 9.0);
        thirdStudentSubjectsAndMarksList.put("Mathematics", 4.0);

        return thirdStudentSubjectsAndMarksList;
    }
}
package exceptions.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<University> createUniversitiesList() {

        List<University> universitiesList = new ArrayList<>();

        universitiesList.add(new University("BNTU",
                new Faculty("Automotive Faculty",
                new Group(1,
                new Student("Ivanov", "Ivan",
                new Subject("Computer Science",
                new Mark(7.0)))))));

        return universitiesList;
    }
}
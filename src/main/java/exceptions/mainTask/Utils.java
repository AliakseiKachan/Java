package exceptions.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public List<University> createUniversityList() {

        List<University> universityList = new ArrayList<>();
        universityList.add(new University("Belarusian National Technical University"));

        return universityList;
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
        studentsList.add(new Student("Ivanov", "Ivan", createUniversityList().get(0),
                createFacultiesList().get(0), createGroupsList().get(0)));
        studentsList.add(new Student("Petrov", "Petr", createUniversityList().get(0),
                createFacultiesList().get(1), createGroupsList().get(1)));
        studentsList.add(new Student("Sidorov", "Vladimir", createUniversityList().get(0),
                createFacultiesList().get(2), createGroupsList().get(2)));

        return studentsList;
    }

    public List<StudySubject> createStudySubjectsList() {

        List<StudySubject> studySubjectsList = new ArrayList<>();
        studySubjectsList.add(new StudySubject("Computer Science"));
        studySubjectsList.add(new StudySubject("Chemistry"));
        studySubjectsList.add(new StudySubject("Physics"));
        studySubjectsList.add(new StudySubject("Mathematics"));

        return studySubjectsList;
    }

    public List<Mark> createMarksList() {

        List<Mark> marksList = new ArrayList<>();
        marksList.add(new Mark(0));
        marksList.add(new Mark(1));
        marksList.add(new Mark(2));
        marksList.add(new Mark(3));
        marksList.add(new Mark(4));
        marksList.add(new Mark(5));
        marksList.add(new Mark(6));
        marksList.add(new Mark(7));
        marksList.add(new Mark(8));
        marksList.add(new Mark(9));
        marksList.add(new Mark(10));

        return marksList;
    }

    public List<University> createSummaryList() {

        List<University> summaryList = new ArrayList<>();
        summaryList.addAll(createStudentsList());
        summaryList.addAll(createStudySubjectsList());
        summaryList.addAll(createMarksList());

        return  summaryList;
    }
}
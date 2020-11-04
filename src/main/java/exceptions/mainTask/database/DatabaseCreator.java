package exceptions.mainTask.database;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import exceptions.mainTask.customExceptions.EmptyListException;
import exceptions.mainTask.enums.FacultyName;
import exceptions.mainTask.enums.Subject;
import exceptions.mainTask.enums.UniversityName;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import static java.util.Arrays.asList;

public class DatabaseCreator {

    /**
     * Create students with subjects and marks and students list for group 1 faculty 1
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group1() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group1 = new HashMap<>();
        subjectAndMarkForStudent1Group1.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent1Group1.put(Subject.CHEMISTRY, 5.0);
        subjectAndMarkForStudent1Group1.put(Subject.PHYSICS, 8.0);
        subjectAndMarkForStudent1Group1.put(Subject.MATHEMATICS, 6.0);

        return subjectAndMarkForStudent1Group1;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group1() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group1 = new HashMap<>();
        subjectAndMarkForStudent2Group1.put(Subject.COMPUTER_SCIENCE, 8.0);
        subjectAndMarkForStudent2Group1.put(Subject.CHEMISTRY, 4.0);
        subjectAndMarkForStudent2Group1.put(Subject.PHYSICS, 9.0);
        subjectAndMarkForStudent2Group1.put(Subject.MATHEMATICS, 8.0);

        return subjectAndMarkForStudent2Group1;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group1() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group1 = new HashMap<>();
        subjectAndMarkForStudent3Group1.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent3Group1.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent3Group1.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent3Group1.put(Subject.MATHEMATICS, 8.0);

        return subjectAndMarkForStudent3Group1;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent4Group1() {

        HashMap<Subject, Double> subjectAndMarkForStudent4Group1 = new HashMap<>();
        subjectAndMarkForStudent4Group1.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent4Group1.put(Subject.CHEMISTRY, 5.0);
        subjectAndMarkForStudent4Group1.put(Subject.PHYSICS, 9.0);
        subjectAndMarkForStudent4Group1.put(Subject.MATHEMATICS, 3.0);

        return subjectAndMarkForStudent4Group1;
    }

    private List<Student> getStudentListGroup1() throws EmptyListException {

        Student student1Group1 = new Student("Ivanov", "Ivan",
                getSubjectAndMarkForStudent1Group1());
        Student student2Group1 = new Student("Petrov", "Petr",
                getSubjectAndMarkForStudent2Group1());
        Student student3Group1 = new Student("Sidorov", "Vladimir",
                getSubjectAndMarkForStudent3Group1());
        Student student4Group1 = new Student("Izrailov", "Azamat",
                getSubjectAndMarkForStudent4Group1());

        return asList(student1Group1, student2Group1, student3Group1, student4Group1);
    }

    /**
     * Create students with subjects and marks and students list for group 2 faculty 1
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group2() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group2 = new HashMap<>();
        subjectAndMarkForStudent1Group2.put(Subject.COMPUTER_SCIENCE, 4.0);
        subjectAndMarkForStudent1Group2.put(Subject.CHEMISTRY, 4.0);
        subjectAndMarkForStudent1Group2.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent1Group2.put(Subject.MATHEMATICS, 9.0);

        return subjectAndMarkForStudent1Group2;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group2() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group2 = new HashMap<>();
        subjectAndMarkForStudent2Group2.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent2Group2.put(Subject.CHEMISTRY, 3.0);
        subjectAndMarkForStudent2Group2.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent2Group2.put(Subject.MATHEMATICS, 6.0);

        return subjectAndMarkForStudent2Group2;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group2() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group2 = new HashMap<>();
        subjectAndMarkForStudent3Group2.put(Subject.COMPUTER_SCIENCE, 8.0);
        subjectAndMarkForStudent3Group2.put(Subject.CHEMISTRY, 8.0);
        subjectAndMarkForStudent3Group2.put(Subject.PHYSICS, 7.0);
        subjectAndMarkForStudent3Group2.put(Subject.MATHEMATICS, 5.0);

        return subjectAndMarkForStudent3Group2;
    }

    private List<Student> getStudentListGroup2() throws EmptyListException {

        Student student1Group2 = new Student("Isaenko", "Dmitry",
                getSubjectAndMarkForStudent1Group2());
        Student student2Group2 = new Student("Kolesnev", "Igor",
                getSubjectAndMarkForStudent2Group2());
        Student student3Group2 = new Student("Popov", "Aliaksei",
                getSubjectAndMarkForStudent3Group2());

        return asList(student1Group2, student2Group2, student3Group2);
    }

    /**
     * Create students with subjects and marks and students list for group 3 faculty 1
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group3() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group3 = new HashMap<>();
        subjectAndMarkForStudent1Group3.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent1Group3.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent1Group3.put(Subject.PHYSICS, 7.0);
        subjectAndMarkForStudent1Group3.put(Subject.MATHEMATICS, 6.0);

        return subjectAndMarkForStudent1Group3;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group3() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group3 = new HashMap<>();
        subjectAndMarkForStudent2Group3.put(Subject.COMPUTER_SCIENCE, 6.0);
        subjectAndMarkForStudent2Group3.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent2Group3.put(Subject.PHYSICS, 4.0);
        subjectAndMarkForStudent2Group3.put(Subject.MATHEMATICS, 4.0);

        return subjectAndMarkForStudent2Group3;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group3() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group3 = new HashMap<>();
        subjectAndMarkForStudent3Group3.put(Subject.COMPUTER_SCIENCE, 9.0);
        subjectAndMarkForStudent3Group3.put(Subject.CHEMISTRY, 10.0);
        subjectAndMarkForStudent3Group3.put(Subject.PHYSICS, 8.0);
        subjectAndMarkForStudent3Group3.put(Subject.MATHEMATICS, 7.0);

        return subjectAndMarkForStudent3Group3;
    }

    private List<Student> getStudentListGroup3() throws EmptyListException {

        Student student1Group3 = new Student("Makarov", "Vasya",
                getSubjectAndMarkForStudent1Group3());
        Student student2Group3 = new Student("Evstrat", "Evgeny",
                getSubjectAndMarkForStudent2Group3());
        Student student3Group3 = new Student("Kravchenko", "Aliaksandr",
                getSubjectAndMarkForStudent3Group3());

        return asList(student1Group3, student2Group3, student3Group3);
    }

    /**
     * Create groups list for faculty 1
     */

    private List<Group> getGroupListFaculty1() throws EmptyListException {


        Group group1Faculty1 = new Group(1, getStudentListGroup1());
        Group group2Faculty1 = new Group(2, getStudentListGroup2());
        Group group3Faculty1 = new Group(3, getStudentListGroup3());

        return asList(group1Faculty1, group2Faculty1, group3Faculty1);
    }

    /**
     * Create students with subjects and marks and students list for group 4 faculty 2
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group4() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group4 = new HashMap<>();
        subjectAndMarkForStudent1Group4.put(Subject.COMPUTER_SCIENCE, 8.0);
        subjectAndMarkForStudent1Group4.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent1Group4.put(Subject.PHYSICS, 8.0);
        subjectAndMarkForStudent1Group4.put(Subject.MATHEMATICS, 3.0);

        return subjectAndMarkForStudent1Group4;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group4() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group4 = new HashMap<>();
        subjectAndMarkForStudent2Group4.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent2Group4.put(Subject.CHEMISTRY, 5.0);
        subjectAndMarkForStudent2Group4.put(Subject.PHYSICS, 7.0);
        subjectAndMarkForStudent2Group4.put(Subject.MATHEMATICS, 9.0);

        return subjectAndMarkForStudent2Group4;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group4() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group4 = new HashMap<>();
        subjectAndMarkForStudent3Group4.put(Subject.COMPUTER_SCIENCE, 4.0);
        subjectAndMarkForStudent3Group4.put(Subject.CHEMISTRY, 3.0);
        subjectAndMarkForStudent3Group4.put(Subject.PHYSICS, 4.0);
        subjectAndMarkForStudent3Group4.put(Subject.MATHEMATICS, 6.0);

        return subjectAndMarkForStudent3Group4;
    }

    private List<Student> getStudentListGroup4() throws EmptyListException {

        Student student1Group4 = new Student("Balashevich", "Mihail",
                getSubjectAndMarkForStudent1Group4());
        Student student2Group4 = new Student("Vlasov", "Dmitry",
                getSubjectAndMarkForStudent2Group4());
        Student student3Group4 = new Student("Hursevich", "Vladislav",
                getSubjectAndMarkForStudent3Group4());

        return asList(student1Group4, student2Group4, student3Group4);
    }

    /**
     * Create students with subjects and marks and students list for group 5 faculty 2
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group5() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group5 = new HashMap<>();
        subjectAndMarkForStudent1Group5.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent1Group5.put(Subject.CHEMISTRY, 6.0);
        subjectAndMarkForStudent1Group5.put(Subject.PHYSICS, 9.0);
        subjectAndMarkForStudent1Group5.put(Subject.MATHEMATICS, 4.0);

        return subjectAndMarkForStudent1Group5;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group5() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group5 = new HashMap<>();
        subjectAndMarkForStudent2Group5.put(Subject.COMPUTER_SCIENCE, 4.0);
        subjectAndMarkForStudent2Group5.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent2Group5.put(Subject.PHYSICS, 7.0);
        subjectAndMarkForStudent2Group5.put(Subject.MATHEMATICS, 9.0);

        return subjectAndMarkForStudent2Group5;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group5() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group5 = new HashMap<>();
        subjectAndMarkForStudent3Group5.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent3Group5.put(Subject.CHEMISTRY, 4.0);
        subjectAndMarkForStudent3Group5.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent3Group5.put(Subject.MATHEMATICS, 8.0);

        return subjectAndMarkForStudent3Group5;
    }

    private List<Student> getStudentListGroup5() throws EmptyListException {

        Student student1Group5 = new Student("Taratin", "Daniil",
                getSubjectAndMarkForStudent1Group5());
        Student student2Group5 = new Student("Shved", "Vanya",
                getSubjectAndMarkForStudent2Group5());
        Student student3Group5 = new Student("Kardymon", "Aliaksei",
                getSubjectAndMarkForStudent3Group5());

        return asList(student1Group5, student2Group5, student3Group5);
    }

    /**
     * Create students with subjects and marks and students list for group 6 faculty 2
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group6() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group6 = new HashMap<>();
        subjectAndMarkForStudent1Group6.put(Subject.COMPUTER_SCIENCE, 3.0);
        subjectAndMarkForStudent1Group6.put(Subject.CHEMISTRY, 4.0);
        subjectAndMarkForStudent1Group6.put(Subject.PHYSICS, 4.0);
        subjectAndMarkForStudent1Group6.put(Subject.MATHEMATICS, 5.0);

        return subjectAndMarkForStudent1Group6;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group6() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group6 = new HashMap<>();
        subjectAndMarkForStudent2Group6.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent2Group6.put(Subject.CHEMISTRY, 4.0);
        subjectAndMarkForStudent2Group6.put(Subject.PHYSICS, 5.0);
        subjectAndMarkForStudent2Group6.put(Subject.MATHEMATICS, 6.0);

        return subjectAndMarkForStudent2Group6;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group6() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group6 = new HashMap<>();
        subjectAndMarkForStudent3Group6.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent3Group6.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent3Group6.put(Subject.PHYSICS, 8.0);
        subjectAndMarkForStudent3Group6.put(Subject.MATHEMATICS, 9.0);

        return subjectAndMarkForStudent3Group6;
    }

    private List<Student> getStudentListGroup6() throws EmptyListException {

        Student student1Group6 = new Student("Voevodin", "Ruslan",
                getSubjectAndMarkForStudent1Group6());
        Student student2Group6 = new Student("Petrovich", "Valentin",
                getSubjectAndMarkForStudent2Group6());
        Student student3Group6 = new Student("Borisenko", "Ivan",
                getSubjectAndMarkForStudent3Group6());

        return asList(student1Group6, student2Group6, student3Group6);
    }

    /**
     * Create groups list for faculty 2
     */

    private List<Group> getGroupListFaculty2() throws EmptyListException {


        Group group4Faculty2 = new Group(4, getStudentListGroup4());
        Group group5Faculty2 = new Group(5, getStudentListGroup5());
        Group group6Faculty2 = new Group(6, getStudentListGroup6());

        return asList(group4Faculty2, group5Faculty2, group6Faculty2);
    }

    /**
     * Create students with subjects and marks and students list for group 7 faculty 3
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group7() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group7 = new HashMap<>();
        subjectAndMarkForStudent1Group7.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent1Group7.put(Subject.CHEMISTRY, 5.0);
        subjectAndMarkForStudent1Group7.put(Subject.PHYSICS, 7.0);
        subjectAndMarkForStudent1Group7.put(Subject.MATHEMATICS, 7.0);

        return subjectAndMarkForStudent1Group7;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group7() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group7 = new HashMap<>();
        subjectAndMarkForStudent2Group7.put(Subject.COMPUTER_SCIENCE, 4.0);
        subjectAndMarkForStudent2Group7.put(Subject.CHEMISTRY, 6.0);
        subjectAndMarkForStudent2Group7.put(Subject.PHYSICS, 5.0);
        subjectAndMarkForStudent2Group7.put(Subject.MATHEMATICS, 8.0);

        return subjectAndMarkForStudent2Group7;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group7() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group7 = new HashMap<>();
        subjectAndMarkForStudent3Group7.put(Subject.COMPUTER_SCIENCE, 3.0);
        subjectAndMarkForStudent3Group7.put(Subject.CHEMISTRY, 6.0);
        subjectAndMarkForStudent3Group7.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent3Group7.put(Subject.MATHEMATICS, 9.0);

        return subjectAndMarkForStudent3Group7;
    }

    private List<Student> getStudentListGroup7() throws EmptyListException {

        Student student1Group7 = new Student("Demidovich", "Sasha",
                getSubjectAndMarkForStudent1Group7());
        Student student2Group7 = new Student("Sidorova", "Anna",
                getSubjectAndMarkForStudent2Group7());
        Student student3Group7 = new Student("Batura", "Katya",
                getSubjectAndMarkForStudent3Group7());

        return asList(student1Group7, student2Group7, student3Group7);
    }

    /**
     * Create students with subjects and marks and students list for group 8 faculty 3
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group8() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group8 = new HashMap<>();
        subjectAndMarkForStudent1Group8.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent1Group8.put(Subject.CHEMISTRY, 5.0);
        subjectAndMarkForStudent1Group8.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent1Group8.put(Subject.MATHEMATICS, 7.0);

        return subjectAndMarkForStudent1Group8;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group8() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group8 = new HashMap<>();
        subjectAndMarkForStudent2Group8.put(Subject.COMPUTER_SCIENCE, 6.0);
        subjectAndMarkForStudent2Group8.put(Subject.CHEMISTRY, 6.0);
        subjectAndMarkForStudent2Group8.put(Subject.PHYSICS, 4.0);
        subjectAndMarkForStudent2Group8.put(Subject.MATHEMATICS, 5.0);

        return subjectAndMarkForStudent2Group8;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group8() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group8 = new HashMap<>();
        subjectAndMarkForStudent3Group8.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent3Group8.put(Subject.CHEMISTRY, 7.0);
        subjectAndMarkForStudent3Group8.put(Subject.PHYSICS, 6.0);
        subjectAndMarkForStudent3Group8.put(Subject.MATHEMATICS, 6.0);

        return subjectAndMarkForStudent3Group8;
    }

    private List<Student> getStudentListGroup8() throws EmptyListException {

        Student student1Group8 = new Student("Shobohov", "Veniamin",
                getSubjectAndMarkForStudent1Group8());
        Student student2Group8 = new Student("Sokolov", "Vlad",
                getSubjectAndMarkForStudent2Group8());
        Student student3Group8 = new Student("Putrik", "Alina",
                getSubjectAndMarkForStudent3Group8());

        return asList(student1Group8, student2Group8, student3Group8);
    }

    /**
     * Create students with subjects and marks and students list for group 9 faculty 3
     */

    private HashMap<Subject, Double> getSubjectAndMarkForStudent1Group9() {

        HashMap<Subject, Double> subjectAndMarkForStudent1Group9 = new HashMap<>();
        subjectAndMarkForStudent1Group9.put(Subject.COMPUTER_SCIENCE, 4.0);
        subjectAndMarkForStudent1Group9.put(Subject.CHEMISTRY, 6.0);
        subjectAndMarkForStudent1Group9.put(Subject.PHYSICS, 8.0);
        subjectAndMarkForStudent1Group9.put(Subject.MATHEMATICS, 8.0);

        return subjectAndMarkForStudent1Group9;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent2Group9() {

        HashMap<Subject, Double> subjectAndMarkForStudent2Group9 = new HashMap<>();
        subjectAndMarkForStudent2Group9.put(Subject.COMPUTER_SCIENCE, 5.0);
        subjectAndMarkForStudent2Group9.put(Subject.CHEMISTRY, 5.0);
        subjectAndMarkForStudent2Group9.put(Subject.PHYSICS, 8.0);
        subjectAndMarkForStudent2Group9.put(Subject.MATHEMATICS, 7.0);

        return subjectAndMarkForStudent2Group9;
    }

    private HashMap<Subject, Double> getSubjectAndMarkForStudent3Group9() {

        HashMap<Subject, Double> subjectAndMarkForStudent3Group9 = new HashMap<>();
        subjectAndMarkForStudent3Group9.put(Subject.COMPUTER_SCIENCE, 7.0);
        subjectAndMarkForStudent3Group9.put(Subject.CHEMISTRY, 4.0);
        subjectAndMarkForStudent3Group9.put(Subject.PHYSICS, 3.0);
        subjectAndMarkForStudent3Group9.put(Subject.MATHEMATICS, 5.0);

        return subjectAndMarkForStudent3Group9;
    }

    private List<Student> getStudentListGroup9() throws EmptyListException {

        Student student1Group9 = new Student("Kolesnik", "Ilya",
                getSubjectAndMarkForStudent1Group9());
        Student student2Group9 = new Student("Sahonchik", "Timofei",
                getSubjectAndMarkForStudent2Group9());
        Student student3Group9 = new Student("Kabakov", "Gleb",
                getSubjectAndMarkForStudent3Group9());

        return asList(student1Group9, student2Group9, student3Group9);
    }

    /**
     * Create groups list for faculty 3
     */

    private List<Group> getGroupListFaculty3() throws EmptyListException {

        Group group7Faculty3 = new Group(7, getStudentListGroup7());
        Group group8Faculty3 = new Group(8, getStudentListGroup8());
        Group group9Faculty3 = new Group(9, getStudentListGroup9());

        return asList(group7Faculty3, group8Faculty3, group9Faculty3);
    }

    /**
     * Create list of all students
     */

    public Optional<Student> getStudentByLastName(String lastName) throws EmptyListException {

        return getStudentsList().stream().filter(student -> student.getLastName().equals(lastName)).findFirst();
    }

    public List<Student> getStudentsList() throws EmptyListException {

        return asList(getStudentListGroup1().get(0), getStudentListGroup1().get(1),
                getStudentListGroup1().get(2), getStudentListGroup1().get(3),
                getStudentListGroup2().get(0), getStudentListGroup2().get(1), getStudentListGroup2().get(2),
                getStudentListGroup3().get(0), getStudentListGroup3().get(1), getStudentListGroup3().get(2),
                getStudentListGroup4().get(0), getStudentListGroup4().get(1), getStudentListGroup4().get(2),
                getStudentListGroup5().get(0), getStudentListGroup5().get(1), getStudentListGroup5().get(2),
                getStudentListGroup6().get(0), getStudentListGroup6().get(1), getStudentListGroup6().get(2),
                getStudentListGroup7().get(0), getStudentListGroup7().get(1), getStudentListGroup7().get(2),
                getStudentListGroup8().get(0), getStudentListGroup8().get(1), getStudentListGroup8().get(2),
                getStudentListGroup9().get(0), getStudentListGroup9().get(1), getStudentListGroup9().get(2));
    }

    /**
     * Create groups list of all faculties
     */

    public Optional<Group> getGroupByNumber(int number) throws EmptyListException {

        return getGroupList().stream().filter(group -> group.getGroupNumber() == number).findFirst();
    }

    public List<Group> getGroupList() throws EmptyListException {

        return asList(getGroupListFaculty1().get(0), getGroupListFaculty1().get(1), getGroupListFaculty1().get(2),
                        getGroupListFaculty2().get(0), getGroupListFaculty2().get(1), getGroupListFaculty2().get(2),
                        getGroupListFaculty3().get(0), getGroupListFaculty3().get(1), getGroupListFaculty3().get(2));
    }

    /**
     * Create faculties list for university
     */

    public Optional<Faculty> getFacultyByName(FacultyName facultyName) throws EmptyListException {

        return getFacultyList().stream().filter(faculty -> faculty.getFacultyName().equals(facultyName)).findFirst();
    }

    public List<Faculty> getFacultyList() throws EmptyListException {

        Faculty faculty1 = new Faculty(FacultyName.AUTOMOTIVE_FACULTY, getGroupListFaculty1());
        Faculty faculty2 = new Faculty(FacultyName.MECHANICAL_AND_TECHNOLOGICAL_FACULTY, getGroupListFaculty2());
        Faculty faculty3 = new Faculty(FacultyName.INSTRUMENTATION_FACULTY, getGroupListFaculty3());

        return asList(faculty1, faculty2, faculty3);
    }

    /**
     * Create university
     */

    public Optional<University> getUniversityByName(UniversityName universityName) throws EmptyListException {

        return getUniversityList().stream().filter(university -> university.getUniversityName()
                .equals(UniversityName.BELARUSIAN_NATIONAL_TECHNICAL_UNIVERSITY)).findFirst();
    }

    public List<University> getUniversityList() throws EmptyListException {

        University university = new University(UniversityName.BELARUSIAN_NATIONAL_TECHNICAL_UNIVERSITY,
                getFacultyList());

        return asList(university);
    }
}
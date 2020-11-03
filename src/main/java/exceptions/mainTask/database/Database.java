package exceptions.mainTask.database;

import exceptions.mainTask.bean.Faculty;
import exceptions.mainTask.bean.Group;
import exceptions.mainTask.bean.Student;
import exceptions.mainTask.bean.University;
import exceptions.mainTask.customExceptions.EmptyListException;
import java.util.HashMap;
import java.util.List;
import static java.util.Arrays.asList;

public class Database {

    /**
     * Create students with subjects and marks and students list for group 1 faculty 1
     */

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group1() {

        HashMap<String, Double> subjectAndMarkForStudent1Group1 = new HashMap<>();
        subjectAndMarkForStudent1Group1.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent1Group1.put("CHEMISTRY", 5.0);
        subjectAndMarkForStudent1Group1.put("PHYSICS", 8.0);
        subjectAndMarkForStudent1Group1.put("MATHEMATICS", 6.0);

        return subjectAndMarkForStudent1Group1;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group1() {

        HashMap<String, Double> subjectAndMarkForStudent2Group1 = new HashMap<>();
        subjectAndMarkForStudent2Group1.put("COMPUTER_SCIENCE", 8.0);
        subjectAndMarkForStudent2Group1.put("CHEMISTRY", 4.0);
        subjectAndMarkForStudent2Group1.put("PHYSICS", 9.0);
        subjectAndMarkForStudent2Group1.put("MATHEMATICS", 8.0);

        return subjectAndMarkForStudent2Group1;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group1() {

        HashMap<String, Double> subjectAndMarkForStudent3Group1 = new HashMap<>();
        subjectAndMarkForStudent3Group1.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent3Group1.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent3Group1.put("PHYSICS", 6.0);
        subjectAndMarkForStudent3Group1.put("MATHEMATICS", 8.0);

        return subjectAndMarkForStudent3Group1;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent4Group1() {

        HashMap<String, Double> subjectAndMarkForStudent4Group1 = new HashMap<>();
        subjectAndMarkForStudent4Group1.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent4Group1.put("CHEMISTRY", 5.0);
        subjectAndMarkForStudent4Group1.put("PHYSICS", 9.0);
        subjectAndMarkForStudent4Group1.put("MATHEMATICS", 3.0);

        return subjectAndMarkForStudent4Group1;
    }

    public List<Student> getStudentListGroup1() throws EmptyListException {

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

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group2() {

        HashMap<String, Double> subjectAndMarkForStudent1Group2 = new HashMap<>();
        subjectAndMarkForStudent1Group2.put("COMPUTER_SCIENCE", 4.0);
        subjectAndMarkForStudent1Group2.put("CHEMISTRY", 4.0);
        subjectAndMarkForStudent1Group2.put("PHYSICS", 6.0);
        subjectAndMarkForStudent1Group2.put("MATHEMATICS", 9.0);

        return subjectAndMarkForStudent1Group2;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group2() {

        HashMap<String, Double> subjectAndMarkForStudent2Group2 = new HashMap<>();
        subjectAndMarkForStudent2Group2.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent2Group2.put("CHEMISTRY", 3.0);
        subjectAndMarkForStudent2Group2.put("PHYSICS", 6.0);
        subjectAndMarkForStudent2Group2.put("MATHEMATICS", 6.0);

        return subjectAndMarkForStudent2Group2;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group2() {

        HashMap<String, Double> subjectAndMarkForStudent3Group2 = new HashMap<>();
        subjectAndMarkForStudent3Group2.put("COMPUTER_SCIENCE", 8.0);
        subjectAndMarkForStudent3Group2.put("CHEMISTRY", 8.0);
        subjectAndMarkForStudent3Group2.put("PHYSICS", 7.0);
        subjectAndMarkForStudent3Group2.put("MATHEMATICS", 5.0);

        return subjectAndMarkForStudent3Group2;
    }

    public List<Student> getStudentListGroup2() throws EmptyListException {

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

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group3() {

        HashMap<String, Double> subjectAndMarkForStudent1Group3 = new HashMap<>();
        subjectAndMarkForStudent1Group3.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent1Group3.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent1Group3.put("PHYSICS", 7.0);
        subjectAndMarkForStudent1Group3.put("MATHEMATICS", 6.0);

        return subjectAndMarkForStudent1Group3;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group3() {

        HashMap<String, Double> subjectAndMarkForStudent2Group3 = new HashMap<>();
        subjectAndMarkForStudent2Group3.put("COMPUTER_SCIENCE", 6.0);
        subjectAndMarkForStudent2Group3.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent2Group3.put("PHYSICS", 4.0);
        subjectAndMarkForStudent2Group3.put("MATHEMATICS", 4.0);

        return subjectAndMarkForStudent2Group3;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group3() {

        HashMap<String, Double> subjectAndMarkForStudent3Group3 = new HashMap<>();
        subjectAndMarkForStudent3Group3.put("COMPUTER_SCIENCE", 9.0);
        subjectAndMarkForStudent3Group3.put("CHEMISTRY", 10.0);
        subjectAndMarkForStudent3Group3.put("PHYSICS", 8.0);
        subjectAndMarkForStudent3Group3.put("MATHEMATICS", 7.0);

        return subjectAndMarkForStudent3Group3;
    }

    public List<Student> getStudentListGroup3() throws EmptyListException {

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

    public List<Group> getGroupListFaculty1() throws EmptyListException {


        Group group1Faculty1 = new Group(1, getStudentListGroup1());
        Group group2Faculty1 = new Group(2, getStudentListGroup2());
        Group group3Faculty1 = new Group(3, getStudentListGroup3());

        return asList(group1Faculty1, group2Faculty1, group3Faculty1);
    }

    /**
     * Create students with subjects and marks and students list for group 4 faculty 2
     */

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group4() {

        HashMap<String, Double> subjectAndMarkForStudent1Group4 = new HashMap<>();
        subjectAndMarkForStudent1Group4.put("COMPUTER_SCIENCE", 8.0);
        subjectAndMarkForStudent1Group4.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent1Group4.put("PHYSICS", 8.0);
        subjectAndMarkForStudent1Group4.put("MATHEMATICS", 3.0);

        return subjectAndMarkForStudent1Group4;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group4() {

        HashMap<String, Double> subjectAndMarkForStudent2Group4 = new HashMap<>();
        subjectAndMarkForStudent2Group4.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent2Group4.put("CHEMISTRY", 5.0);
        subjectAndMarkForStudent2Group4.put("PHYSICS", 7.0);
        subjectAndMarkForStudent2Group4.put("MATHEMATICS", 9.0);

        return subjectAndMarkForStudent2Group4;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group4() {

        HashMap<String, Double> subjectAndMarkForStudent3Group4 = new HashMap<>();
        subjectAndMarkForStudent3Group4.put("COMPUTER_SCIENCE", 4.0);
        subjectAndMarkForStudent3Group4.put("CHEMISTRY", 3.0);
        subjectAndMarkForStudent3Group4.put("PHYSICS", 4.0);
        subjectAndMarkForStudent3Group4.put("MATHEMATICS", 6.0);

        return subjectAndMarkForStudent3Group4;
    }

    public List<Student> getStudentListGroup4() throws EmptyListException {

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

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group5() {

        HashMap<String, Double> subjectAndMarkForStudent1Group5 = new HashMap<>();
        subjectAndMarkForStudent1Group5.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent1Group5.put("CHEMISTRY", 6.0);
        subjectAndMarkForStudent1Group5.put("PHYSICS", 9.0);
        subjectAndMarkForStudent1Group5.put("MATHEMATICS", 4.0);

        return subjectAndMarkForStudent1Group5;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group5() {

        HashMap<String, Double> subjectAndMarkForStudent2Group5 = new HashMap<>();
        subjectAndMarkForStudent2Group5.put("COMPUTER_SCIENCE", 4.0);
        subjectAndMarkForStudent2Group5.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent2Group5.put("PHYSICS", 7.0);
        subjectAndMarkForStudent2Group5.put("MATHEMATICS", 9.0);

        return subjectAndMarkForStudent2Group5;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group5() {

        HashMap<String, Double> subjectAndMarkForStudent3Group5 = new HashMap<>();
        subjectAndMarkForStudent3Group5.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent3Group5.put("CHEMISTRY", 4.0);
        subjectAndMarkForStudent3Group5.put("PHYSICS", 6.0);
        subjectAndMarkForStudent3Group5.put("MATHEMATICS", 8.0);

        return subjectAndMarkForStudent3Group5;
    }

    public List<Student> getStudentListGroup5() throws EmptyListException {

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

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group6() {

        HashMap<String, Double> subjectAndMarkForStudent1Group6 = new HashMap<>();
        subjectAndMarkForStudent1Group6.put("COMPUTER_SCIENCE", 3.0);
        subjectAndMarkForStudent1Group6.put("CHEMISTRY", 4.0);
        subjectAndMarkForStudent1Group6.put("PHYSICS", 4.0);
        subjectAndMarkForStudent1Group6.put("MATHEMATICS", 5.0);

        return subjectAndMarkForStudent1Group6;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group6() {

        HashMap<String, Double> subjectAndMarkForStudent2Group6 = new HashMap<>();
        subjectAndMarkForStudent2Group6.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent2Group6.put("CHEMISTRY", 4.0);
        subjectAndMarkForStudent2Group6.put("PHYSICS", 5.0);
        subjectAndMarkForStudent2Group6.put("MATHEMATICS", 6.0);

        return subjectAndMarkForStudent2Group6;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group6() {

        HashMap<String, Double> subjectAndMarkForStudent3Group6 = new HashMap<>();
        subjectAndMarkForStudent3Group6.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent3Group6.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent3Group6.put("PHYSICS", 8.0);
        subjectAndMarkForStudent3Group6.put("MATHEMATICS", 9.0);

        return subjectAndMarkForStudent3Group6;
    }

    public List<Student> getStudentListGroup6() throws EmptyListException {

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

    public List<Group> getGroupListFaculty2() throws EmptyListException {


        Group group4Faculty2 = new Group(4, getStudentListGroup4());
        Group group5Faculty2 = new Group(5, getStudentListGroup5());
        Group group6Faculty2 = new Group(6, getStudentListGroup6());

        return asList(group4Faculty2, group5Faculty2, group6Faculty2);
    }

    /**
     * Create students with subjects and marks and students list for group 7 faculty 3
     */

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group7() {

        HashMap<String, Double> subjectAndMarkForStudent1Group7 = new HashMap<>();
        subjectAndMarkForStudent1Group7.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent1Group7.put("CHEMISTRY", 5.0);
        subjectAndMarkForStudent1Group7.put("PHYSICS", 7.0);
        subjectAndMarkForStudent1Group7.put("MATHEMATICS", 7.0);

        return subjectAndMarkForStudent1Group7;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group7() {

        HashMap<String, Double> subjectAndMarkForStudent2Group7 = new HashMap<>();
        subjectAndMarkForStudent2Group7.put("COMPUTER_SCIENCE", 4.0);
        subjectAndMarkForStudent2Group7.put("CHEMISTRY", 6.0);
        subjectAndMarkForStudent2Group7.put("PHYSICS", 5.0);
        subjectAndMarkForStudent2Group7.put("MATHEMATICS", 8.0);

        return subjectAndMarkForStudent2Group7;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group7() {

        HashMap<String, Double> subjectAndMarkForStudent3Group7 = new HashMap<>();
        subjectAndMarkForStudent3Group7.put("COMPUTER_SCIENCE", 3.0);
        subjectAndMarkForStudent3Group7.put("CHEMISTRY", 6.0);
        subjectAndMarkForStudent3Group7.put("PHYSICS", 6.0);
        subjectAndMarkForStudent3Group7.put("MATHEMATICS", 9.0);

        return subjectAndMarkForStudent3Group7;
    }

    public List<Student> getStudentListGroup7() throws EmptyListException {

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

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group8() {

        HashMap<String, Double> subjectAndMarkForStudent1Group8 = new HashMap<>();
        subjectAndMarkForStudent1Group8.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent1Group8.put("CHEMISTRY", 5.0);
        subjectAndMarkForStudent1Group8.put("PHYSICS", 6.0);
        subjectAndMarkForStudent1Group8.put("MATHEMATICS", 7.0);

        return subjectAndMarkForStudent1Group8;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group8() {

        HashMap<String, Double> subjectAndMarkForStudent2Group8 = new HashMap<>();
        subjectAndMarkForStudent2Group8.put("COMPUTER_SCIENCE", 6.0);
        subjectAndMarkForStudent2Group8.put("CHEMISTRY", 6.0);
        subjectAndMarkForStudent2Group8.put("PHYSICS", 4.0);
        subjectAndMarkForStudent2Group8.put("MATHEMATICS", 5.0);

        return subjectAndMarkForStudent2Group8;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group8() {

        HashMap<String, Double> subjectAndMarkForStudent3Group8 = new HashMap<>();
        subjectAndMarkForStudent3Group8.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent3Group8.put("CHEMISTRY", 7.0);
        subjectAndMarkForStudent3Group8.put("PHYSICS", 6.0);
        subjectAndMarkForStudent3Group8.put("MATHEMATICS", 6.0);

        return subjectAndMarkForStudent3Group8;
    }

    public List<Student> getStudentListGroup8() throws EmptyListException {

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

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group9() {

        HashMap<String, Double> subjectAndMarkForStudent1Group9 = new HashMap<>();
        subjectAndMarkForStudent1Group9.put("COMPUTER_SCIENCE", 4.0);
        subjectAndMarkForStudent1Group9.put("CHEMISTRY", 6.0);
        subjectAndMarkForStudent1Group9.put("PHYSICS", 8.0);
        subjectAndMarkForStudent1Group9.put("MATHEMATICS", 8.0);

        return subjectAndMarkForStudent1Group9;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group9() {

        HashMap<String, Double> subjectAndMarkForStudent2Group9 = new HashMap<>();
        subjectAndMarkForStudent2Group9.put("COMPUTER_SCIENCE", 5.0);
        subjectAndMarkForStudent2Group9.put("CHEMISTRY", 5.0);
        subjectAndMarkForStudent2Group9.put("PHYSICS", 8.0);
        subjectAndMarkForStudent2Group9.put("MATHEMATICS", 7.0);

        return subjectAndMarkForStudent2Group9;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group9() {

        HashMap<String, Double> subjectAndMarkForStudent3Group9 = new HashMap<>();
        subjectAndMarkForStudent3Group9.put("COMPUTER_SCIENCE", 7.0);
        subjectAndMarkForStudent3Group9.put("CHEMISTRY", 4.0);
        subjectAndMarkForStudent3Group9.put("PHYSICS", 3.0);
        subjectAndMarkForStudent3Group9.put("MATHEMATICS", 5.0);

        return subjectAndMarkForStudent3Group9;
    }

    public List<Student> getStudentListGroup9() throws EmptyListException {

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

    public List<Group> getGroupListFaculty3() throws EmptyListException {


        Group group7Faculty3 = new Group(7, getStudentListGroup7());
        Group group8Faculty3 = new Group(8, getStudentListGroup8());
        Group group9Faculty3 = new Group(9, getStudentListGroup9());

        return asList(group7Faculty3, group8Faculty3, group9Faculty3);
    }

    /**
     * Create faculties list for university
     */

    public List<Faculty> getFacultyList() throws EmptyListException {

        Faculty faculty1 = new Faculty("Automotive Faculty", getGroupListFaculty1());
        Faculty faculty2 = new Faculty("Mechanical and Technological Faculty", getGroupListFaculty2());
        Faculty faculty3 = new Faculty("Instrumentation Faculty", getGroupListFaculty3());

        return asList(faculty1, faculty2, faculty3);
    }

    /**
     * Create university
     */

    public List<University> getUniversityList() throws EmptyListException {

        University university = new University("Belarusian National Technical University",
                getFacultyList());

        return asList(university);
    }
}
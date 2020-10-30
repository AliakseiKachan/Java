package exceptions.mainTask;

import java.util.HashMap;
import java.util.List;
import static java.util.Arrays.asList;

public class Database {

    /**
     * Create students with subjects and marks and students list for group 1 faculty 1
     */

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group1() {

        HashMap<String, Double> subjectAndMarkForStudent1Group1 = new HashMap<>();
        subjectAndMarkForStudent1Group1.put("Computer Science", 7.0);
        subjectAndMarkForStudent1Group1.put("Chemistry", 5.0);
        subjectAndMarkForStudent1Group1.put("Physics", 8.0);
        subjectAndMarkForStudent1Group1.put("Mathematics", 6.0);

        return subjectAndMarkForStudent1Group1;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group1() {

        HashMap<String, Double> subjectAndMarkForStudent2Group1 = new HashMap<>();
        subjectAndMarkForStudent2Group1.put("Computer Science", 6.0);
        subjectAndMarkForStudent2Group1.put("Chemistry", 4.0);
        subjectAndMarkForStudent2Group1.put("Physics", 9.0);
        subjectAndMarkForStudent2Group1.put("Mathematics", 5.0);

        return subjectAndMarkForStudent2Group1;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group1() {

        HashMap<String, Double> subjectAndMarkForStudent3Group1 = new HashMap<>();
        subjectAndMarkForStudent3Group1.put("Computer Science", 7.0);
        subjectAndMarkForStudent3Group1.put("Chemistry", 7.0);
        subjectAndMarkForStudent3Group1.put("Physics", 6.0);
        subjectAndMarkForStudent3Group1.put("Mathematics", 8.0);

        return subjectAndMarkForStudent3Group1;
    }

    public List<Student> getStudentListGroup1() {

        Student student1Group1 = new Student("Ivanov", "Ivan", getSubjectAndMarkForStudent1Group1());
        Student student2Group1 = new Student("Petrov", "Petr", getSubjectAndMarkForStudent2Group1());
        Student student3Group1 = new Student("Sidorov", "Vladimir", getSubjectAndMarkForStudent3Group1());

        return asList(student1Group1, student2Group1, student3Group1);
    }

    /**
     * Create students with subjects and marks and students list for group 2 faculty 1
     */

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group2() {

        HashMap<String, Double> subjectAndMarkForStudent1Group2 = new HashMap<>();
        subjectAndMarkForStudent1Group2.put("Computer Science", 4.0);
        subjectAndMarkForStudent1Group2.put("Chemistry", 4.0);
        subjectAndMarkForStudent1Group2.put("Physics", 6.0);
        subjectAndMarkForStudent1Group2.put("Mathematics", 9.0);

        return subjectAndMarkForStudent1Group2;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group2() {

        HashMap<String, Double> subjectAndMarkForStudent2Group2 = new HashMap<>();
        subjectAndMarkForStudent2Group2.put("Computer Science", 5.0);
        subjectAndMarkForStudent2Group2.put("Chemistry", 3.0);
        subjectAndMarkForStudent2Group2.put("Physics", 6.0);
        subjectAndMarkForStudent2Group2.put("Mathematics", 6.0);

        return subjectAndMarkForStudent2Group2;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group2() {

        HashMap<String, Double> subjectAndMarkForStudent3Group2 = new HashMap<>();
        subjectAndMarkForStudent3Group2.put("Computer Science", 8.0);
        subjectAndMarkForStudent3Group2.put("Chemistry", 8.0);
        subjectAndMarkForStudent3Group2.put("Physics", 7.0);
        subjectAndMarkForStudent3Group2.put("Mathematics", 5.0);

        return subjectAndMarkForStudent3Group2;
    }

    public List<Student> getStudentListGroup2() {

        Student student1Group2 = new Student("Isaenko", "Dmitry", getSubjectAndMarkForStudent1Group2());
        Student student2Group2 = new Student("Kolesnev", "Igor", getSubjectAndMarkForStudent2Group2());
        Student student3Group2 = new Student("Popov", "Aliaksei", getSubjectAndMarkForStudent3Group2());

        return asList(student1Group2, student2Group2, student3Group2);
    }

    /**
     * Create students with subjects and marks and students list for group 3 faculty 1
     */

    public HashMap<String, Double> getSubjectAndMarkForStudent1Group3() {

        HashMap<String, Double> subjectAndMarkForStudent1Group3 = new HashMap<>();
        subjectAndMarkForStudent1Group3.put("Computer Science", 5.0);
        subjectAndMarkForStudent1Group3.put("Chemistry", 7.0);
        subjectAndMarkForStudent1Group3.put("Physics", 7.0);
        subjectAndMarkForStudent1Group3.put("Mathematics", 6.0);

        return subjectAndMarkForStudent1Group3;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent2Group3() {

        HashMap<String, Double> subjectAndMarkForStudent2Group3 = new HashMap<>();
        subjectAndMarkForStudent2Group3.put("Computer Science", 6.0);
        subjectAndMarkForStudent2Group3.put("Chemistry", 7.0);
        subjectAndMarkForStudent2Group3.put("Physics", 4.0);
        subjectAndMarkForStudent2Group3.put("Mathematics", 4.0);

        return subjectAndMarkForStudent2Group3;
    }

    public HashMap<String, Double> getSubjectAndMarkForStudent3Group3() {

        HashMap<String, Double> subjectAndMarkForStudent3Group3 = new HashMap<>();
        subjectAndMarkForStudent3Group3.put("Computer Science", 9.0);
        subjectAndMarkForStudent3Group3.put("Chemistry", 10.0);
        subjectAndMarkForStudent3Group3.put("Physics", 8.0);
        subjectAndMarkForStudent3Group3.put("Mathematics", 7.0);

        return subjectAndMarkForStudent3Group3;
    }

    public List<Student> getStudentListGroup3() {

        Student student1Group3 = new Student("Makarov", "Vasya", getSubjectAndMarkForStudent1Group3());
        Student student2Group3 = new Student("Evstrat", "Evgeny", getSubjectAndMarkForStudent2Group3());
        Student student3Group3 = new Student("Kravchenko", "Aliaksandr", getSubjectAndMarkForStudent3Group3());

        return asList(student1Group3, student2Group3, student3Group3);
    }

    /**
     * Create groups list for faculty 1
     */

    public List<Group> getGroupListFaculty1() {


        Group group1Faculty1 = new Group(1, getStudentListGroup1());
        Group group2Faculty1 = new Group(1, getStudentListGroup2());
        Group group3Faculty1 = new Group(1, getStudentListGroup3());

        return asList(group1Faculty1, group2Faculty1, group3Faculty1);
    }

    /**
     * Create faculties list for university
     */

    public List<Faculty> getFacultyList() {

        Faculty faculty1 = new Faculty("Automotive Faculty", getGroupListFaculty1());

        return asList(faculty1);
    }

    /**
     * Create university
     */

    public List<University> getUniversityList() {

        University university = new University("Belarusian National Technical University", getFacultyList());

        return asList(university);
    }
}
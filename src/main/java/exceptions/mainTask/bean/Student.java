package exceptions.mainTask.bean;

import exceptions.mainTask.enums.Subject;
import java.util.HashMap;

public class Student {

    private String lastName;
    private String firstName;
    private Subject subject;
    private HashMap<String, Double> subjectAndMark = new HashMap<>();

    public Student(String lastName, String firstName, HashMap<String, Double> subjectAndMark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.subjectAndMark = subjectAndMark;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public HashMap<String, Double> getSubjectAndMark() {
        return subjectAndMark;
    }

    public void setSubjectAndMark(HashMap<String, Double> subjectAndMark) {
        this.subjectAndMark = subjectAndMark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", subject=" + subject +
                ", subjectAndMark=" + subjectAndMark +
                '}';
    }
}
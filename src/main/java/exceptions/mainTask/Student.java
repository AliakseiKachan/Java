package exceptions.mainTask;

import java.util.HashMap;

public class Student {

    private String lastName;
    private String firstName;
    private HashMap<String, Double> subjectsAndMarks;

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
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

    public HashMap<String, Double> getSubjectsAndMarks() {
        return subjectsAndMarks;
    }

    public void setSubjectsAndMarks(HashMap<String, Double> subjectsAndMarks) {
        this.subjectsAndMarks = subjectsAndMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", subjectsAndMarks=" + subjectsAndMarks +
                '}';
    }
}
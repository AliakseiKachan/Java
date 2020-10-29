package exceptions.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String lastName;
    private String firstName;
    private List<Subject> subject = new ArrayList<>();

    public Student(String lastName, String firstName, List<Subject> subject) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.subject = subject;
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

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", subject=" + subject +
                '}';
    }
}
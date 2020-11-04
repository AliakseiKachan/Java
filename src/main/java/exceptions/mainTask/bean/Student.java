package exceptions.mainTask.bean;

import exceptions.mainTask.enums.Subject;
import exceptions.mainTask.customExceptions.EmptyListException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {

    private String lastName;
    private String firstName;
    private HashMap<Subject, Double> subjectAndMark;

    public Student(String lastName, String firstName, HashMap<Subject, Double> subjectAndMark)
                    throws EmptyListException {
        this.lastName = lastName;
        this.firstName = firstName;
        this.subjectAndMark = subjectAndMark;

        List<Double> doubleList = new ArrayList<>(subjectAndMark.values());
        for (int i = 0; i < subjectAndMark.size(); i++) {
            if(doubleList.get(i) < 0 || doubleList.get(i) > 10) {
                throw new IllegalArgumentException("Mark may be from 0 to 10 only, this mark is incorrect: "
                        + doubleList.get(i));
            }
        }

        if(subjectAndMark.isEmpty()) {
            throw new EmptyListException("Student need to have at least one subject, "
                    + "count of subjects: " + subjectAndMark.size());
        }
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

    public HashMap<Subject, Double> getSubjectAndMark() {
        return subjectAndMark;
    }

    public void setSubjectAndMark(HashMap<Subject, Double> subjectAndMark) {
        this.subjectAndMark = subjectAndMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", subjectAndMark=" + subjectAndMark +
                '}';
    }
}
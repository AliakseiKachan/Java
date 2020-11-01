package exceptions.mainTask;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        UniverUtils univerUtils = new UniverUtils();

        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group1());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group1());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group1());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group2());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group2());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group2());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group3());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group3());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group3());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group4());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group4());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group4());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group5());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group5());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group5());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group6());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group6());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group6());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group7());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group7());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group7());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group8());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group8());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group8());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent1Group9());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent2Group9());
        univerUtils.checkMarksAreInRangeFromZeroToTen(database.getSubjectAndMarkForStudent3Group9());

        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group1());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group1());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group1());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group2());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group2());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group2());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group3());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group3());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group3());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group4());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group4());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group4());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group5());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group5());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group5());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group6());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group6());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group6());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group7());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group7());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group7());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group8());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group8());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group8());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent1Group9());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent2Group9());
        univerUtils.checkHasStudentAtLeastOneSubject(database.getSubjectAndMarkForStudent3Group9());

        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup1());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup2());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup3());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup4());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup5());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup6());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup7());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup8());
        univerUtils.checkHasAtLeastOneStudentInGroup(database.getStudentListGroup9());

        univerUtils.checkHasAtLeastOneGroupInTheFaculty(database.getGroupListFaculty1());
        univerUtils.checkHasAtLeastOneGroupInTheFaculty(database.getGroupListFaculty2());
        univerUtils.checkHasAtLeastOneGroupInTheFaculty(database.getGroupListFaculty3());

        univerUtils.checkHasAtLeastOneFacultyInUniversity(database.getFacultyList());

        System.out.println("Average mark of all subjects of "
                + database.getStudentListGroup1().get(0).getLastName()
                + " "
                + database.getStudentListGroup1().get(0).getFirstName()
                + " is: "
                + univerUtils.getAverageMarkOfOneStudent(database.getStudentListGroup1()));

        System.out.println("Average mark for "
                + database.getSubjectAndMarkForStudent1Group1().keySet().toArray()[1]
                + " in group number " + database.getFacultyList().get(0).getGroupsList().get(0).getGroupNumber()
                + " and at " + database.getFacultyList().get(0).getNameOfTheFaculty()
                + " is: " + univerUtils
                .getAverageMarkForSpecificSubjectInSpecificGroupAndAtSpecificFaculty(database.getFacultyList()));

        System.out.println("Average mark for "
                + database.getSubjectAndMarkForStudent1Group1().keySet().toArray()[3]
                + " at all University is : "
                +univerUtils.getAverageMarkForOneSubjectForEntireUniversity(database.getUniversityList()));
    }
}
package exceptions.mainTask;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        UniverUtils univerUtils = new UniverUtils();

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

        System.out.println(univerUtils.getAverageMarkForOneSubjectForEntireUniversity(database.getUniversityList()));
    }
}
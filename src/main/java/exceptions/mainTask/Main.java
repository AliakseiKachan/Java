package exceptions.mainTask;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();

        database.createUniversitiesList().forEach(System.out::println);
    }
}
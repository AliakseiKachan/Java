package fundamentals.mainTask;

import java.util.Scanner;

/**
 * 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

public class Task5 {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input month number: ");
        int monthNumber = input.nextInt();

        setMonth(monthNumber);

    }

    private static void setMonth (int monthNum) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String nameOfMonth;

        try {
            nameOfMonth = month[monthNum-1];
            System.out.println("This is " + nameOfMonth + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number of month! " + e.getMessage());
        }

    }
}
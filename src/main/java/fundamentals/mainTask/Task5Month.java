package fundamentals.mainTask;

import java.time.DateTimeException;
import java.time.Month;
import java.util.Scanner;

/**
 * 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

public class Task5Month {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input month number: ");
        int monthNumber = input.nextInt();

        setMonth(monthNumber);

    }

    private static void setMonth (int monthNum) {

        try {
            Month nameOfMonth = Month.of(monthNum);
            System.out.println("This is " + nameOfMonth + ".");
        } catch (DateTimeException e) {
            System.out.println("Wrong number of month! " + e.getMessage());
        }

    }
}

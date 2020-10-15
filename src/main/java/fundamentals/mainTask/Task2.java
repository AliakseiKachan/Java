package fundamentals.mainTask;

import java.util.Scanner;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Input some text please:");
        Scanner input = new Scanner(System.in);
        StringBuffer stringToReverse = new StringBuffer(input.nextLine());
        System.out.println(stringToReverse.reverse());

    }
}
package fundamentals.mainTask;

import java.util.Scanner;

/**
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.println("Input number x:");
            int x = input.nextInt();

            System.out.println("Input number y:");
            int y = input.nextInt();

            System.out.println("Sum result = " + (x + y));
            System.out.println("Multiplication result = " + (x * y));
        }

    }
}